package com.giray;

import com.giray.entity.*;

public class Runner_SwitchCase3 {
    public static void main(String[] args) {

        AracTurleri aracTurleri = new AracTurleri("SIYAH","SUV","DIZEL");

        aracTurleri= new AracTurleri(Renk.SIYAH, Cesit.SUV,Yakit.DIZEL);

        /**
         * Burada Switch-Case imizi enumlardan �ekebiliyoruz.
         */

        String Arac = switch (aracTurleri.getRenk()){
            case MAV� -> "Arac�n�z Mavi";
            case BEYAZ -> "Arac�n�z Beyaz";
            case SIYAH -> "Arac�n�z Siyah";
            default -> "Arac�n�z Beyaz";
        };
        System.out.println(Arac);


    }
}
