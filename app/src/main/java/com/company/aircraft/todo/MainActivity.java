package com.company.aircraft.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    Button button;
    TextView txview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClick() {
        edittext = (EditText) findViewById(R.id.plain_text_input);
        txview = (TextView) findViewById(R.id.textView);
        String textvalue = edittext.getText().toString();
        if (textvalue != null) {

        }
    }
}
