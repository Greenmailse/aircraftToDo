package com.company.aircraft.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    EditText tvOut;
    public static String[] taskarray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        Button btnOk = (Button) findViewById(R.id.btnOk);
        tvOut = (EditText) findViewById(R.id.tvOut);
        taskarray = new String[10];
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = tvOut.getText().toString();
                int i = 0;
                do{
                    taskarray[i] = task;
                    i++;
                }
                while (i<6);
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        btnOk.setOnClickListener(oclBtnOk);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)


        mAdapter = new MyAdapter(taskarray);
        recyclerView.setAdapter(mAdapter);

}
}