package com.bjh.www.a1025_onclick_onlongclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    Button btn1, btn2, btn3, btn4;
    TextView textView;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3_long);
        btn3.setOnLongClickListener(this);
        btn4 = (Button)findViewById(R.id.btn4_long);
        btn4.setOnLongClickListener(this);
        textView = (TextView)findViewById(R.id.txtview);
    }

    @Override
    public void onClick(View v) {                   // onClickListener
        int id = v.getId();
        text = ((Button)v).getText().toString();

        if( id == R.id.btn1)
            textView.setText(text);
        if( id == R.id.btn2)
            textView.setText(text);
    }

    @Override
    public boolean onLongClick(View v) {            // onLongClickListener
        int id = v.getId();
        text = ((Button)v).getText().toString();

        if( id == R.id.btn3_long)
            textView.setText(text);
        if( id == R.id.btn4_long)
            textView.setText(text);
        return true;
    }
}


