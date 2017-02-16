package com.example.sadievrenseker.myapplication;

/**
 * Created by sadievrenseker on 2/5/17.
 */

public class karakter {
    int kilo;
    int hareketSayisi;
    int saldiriGucu;
    String isim ="Karaktere isim verin";

    public String yemek(){
        if(hareketSayisi > 0) {
            kilo++;
            hareketSayisi--;
            return "yemek yedi ve kilosu artti";
        }
        else
            return "Yeterli hareket yok";
    }
    public String uyumak(){
        if(hareketSayisi > 0) {
            hareketSayisi--;
            return "karakterimiz uyudu";
        }
        else
            return "Yeterli hareket yok";
    }
    public String savas(){
        if(hareketSayisi > 0) {
            hareketSayisi--;
            saldiriGucu++;
            return "karakterimiz savasti";
        }
        else
            return "Yeterli hareket yok";

    }

    @Override
    public String toString(){
        return "Karakterin ismi : " + isim
                +" \n kilo : "+ kilo
                + " \n haraket Sayisi : " +hareketSayisi
                + " \n Saldiri Gucu :" + saldiriGucu;
    }
}
