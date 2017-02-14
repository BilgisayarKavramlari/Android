package com.example.cmert.hafizaoyunu;

import android.content.Context;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;

/**
 * Created by Cmert on 14.02.2017.
 */

public class kart extends Button
{
    boolean acikMi= false;
    int resimID;
    int arkaPlanID;

    public kart(Context context)
    {
        super(context);
        arkaPlanID=R.drawable.arka;
        Drawable d = AppCompatDrawableManager.get().getDrawable(context,arkaPlanID);
        setBackground(d);
    }

}
