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
    int resimID;
    int arkaPlanID;
    public kart(Context context) {
        super(context);
        arkaPlanID = R.drawable.arka;
        Drawable d = AppCompatDrawableManager.get().getDrawable(context,arkaPlanID);
        setBackground(d);


    }

}
