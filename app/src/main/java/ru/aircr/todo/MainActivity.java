package ru.aircr.todo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements headFragment.OnFragmentInteractionListener, bottomFragment.OnFragmentInteractionListener {

    private RecyclerView todoItemList;

    private String[] demoData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoItemList = findViewById(R.id.recyclerViewItems);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        todoItemList.setLayoutManager(layoutManager);
        todoItemList.setHasFixedSize(true);

        demoData = new String[30];
        demoData[0] = "Сжечь того типа";
        demoData[1] = "Купить нарКОТИКОВ";
        demoData[2] = "Крикнуть в носок";
        demoData[4] = "Продать пойманных пчёл";
        demoData[10] = "Зарядить розетку";
        demoData[16] = "Вспомнить бога";
        demoData[24] = "Покормить лес";

        todoItemList.setAdapter(new TodoItemsAdapter(30, demoData));

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
