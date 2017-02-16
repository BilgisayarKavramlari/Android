package com.example.sadievrenseker.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b =(Button) findViewById(R.id.button);
        b.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.textView2);
    }

    public void onClick(View view){

        tv.setText(R.string.cevap_1);
    }

}
