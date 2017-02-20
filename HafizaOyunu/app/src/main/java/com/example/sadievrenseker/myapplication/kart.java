package com.example.sadievrenseker.myapplication;

/**
 * Created by sadievrenseker on 2/12/17.
 */

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.Button;



public class kart extends Button{
    boolean acikMi = false;
    boolean cevrilebilir = true;
    int arkaPlanID;
    int onPlanID=0;
    Drawable on;
    Drawable arka;
    public kart(Context context,int id) {
        super(context);
        setId(id);
        arkaPlanID = R.drawable.back;
        if(id%8==1)
            onPlanID = R.drawable.c1;
        if(id%8==2)
            onPlanID = R.drawable.c2;
        if(id%8==3)
            onPlanID = R.drawable.c3;
        if(id%8==4)
            onPlanID = R.drawable.c4;
        if(id%8==5)
            onPlanID = R.drawable.c5;
        if(id%8==6)
            onPlanID = R.drawable.c6;
        if(id%8==7)
            onPlanID = R.drawable.c7;
        if(id%8==0)
            onPlanID = R.drawable.c8;
        arka = AppCompatDrawableManager.get().getDrawable(context,arkaPlanID);
        on= AppCompatDrawableManager.get().getDrawable(context,onPlanID);
        setBackground(arka);


    }
    public void cevir(){
        if(cevrilebilir) {
            if (!acikMi) { // arkasi cevriliyse
                setBackground(on);
                acikMi = true;
            } else {
                setBackground(arka);
                acikMi = false;
            }
        }
    }

}
