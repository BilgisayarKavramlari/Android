package com.example.sadievrenseker.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements View.OnClickListener, EditText.OnEditorActionListener {
    TextView tv;
    TextView tvKarakterOzellikleri;
    int sayac = 0;
    Button bSaldir;
    Button bYemek;
    Button bUyu;
    karakter k;
    EditText isim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.cevap);
        tvKarakterOzellikleri = (TextView) findViewById(R.id.bilmece);
        bSaldir = (Button) findViewById(R.id.saldir);
        bYemek = (Button) findViewById(R.id.yemek);
        bUyu = (Button) findViewById(R.id.uyu);
      //  Button bYemek = (Button)
        bSaldir.setOnClickListener(this);
        bYemek.setOnClickListener(this);
        bUyu.setOnClickListener( this);
        k = new karakter();
        k.hareketSayisi = 10;
        k.kilo = 10;
        k.saldiriGucu=100;
        tvKarakterOzellikleri.setText(k.toString());
        tv.setText("Oyuna hos geldiniz, lutfen bir eylem secin");
        isim = (EditText) findViewById(R.id.editText3);
        isim.setOnEditorActionListener(this);

    }

    @Override
    public boolean onEditorAction(TextView tv2,int x, KeyEvent ke){
        tv.setText("Karakterin ismi " + isim.getText()+ " olarak atandi");
        k.isim = (String) isim.getText().toString();
        isim.setVisibility(View.INVISIBLE);
        tvKarakterOzellikleri.setText(k.toString());
        tvKarakterOzellikleri.setVisibility(View.VISIBLE);
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== bSaldir.getId())
                tv.setText(k.savas());
        else if(v.getId() == bUyu.getId())
                tv.setText(k.uyumak());
        else if(v.getId()==bYemek.getId())
                tv.setText(k.yemek());
        tvKarakterOzellikleri.setText(k.toString());
    }
}
