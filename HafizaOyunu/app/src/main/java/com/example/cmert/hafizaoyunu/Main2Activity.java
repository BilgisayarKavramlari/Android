package com.example.cmert.hafizaoyunu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String s = i.getStringExtra("mesaj");
        TextView tv = (TextView) findViewById(R.id.tvIsim);
        tv.setText(s);
        GridLayout gr = (GridLayout)findViewById(R.id.kartlar);
        for(int j=0;j<10;j++)
        {
            gr.addView(new kart(this));
        }


    }
}
