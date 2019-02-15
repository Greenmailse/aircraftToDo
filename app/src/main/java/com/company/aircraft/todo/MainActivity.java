package com.company.aircraft.todo;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    Button btnadd;
    TextView txview;
    int i = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button) findViewById(R.id.button2);
        edittext = (EditText) findViewById(R.id.plain_text_input);
        txview = (TextView) findViewById(R.id.textView);


        View.OnClickListener oclbtnadd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<TextView> txt = new ArrayList<>();
                for (int i=0; i<10; i++) {
                    TextView txtItem = new TextView(getApplicationContext());
                    txt.add(txtItem);
                    ConstraintLayout.(txtItem);

                String textvalue = edittext.getText().toString();
                        if (textvalue != null) {
                            txview.setText(textvalue);
                        } else {
                            txview.setText(null);
                        }

                    }
            }
        };
        btnadd.setOnClickListener(oclbtnadd);
    }
}
