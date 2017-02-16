package com.example.sadievrenseker.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.GridLayout;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String s  = i.getStringExtra("mesaj");
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(s);
        GridLayout gl = (GridLayout) findViewById(R.id.kartlar);
        for(int j =0;j<10;j++)
            gl.addView(new kart(this));


    }
}
