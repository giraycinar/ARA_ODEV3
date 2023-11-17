package com.giray;

import com.giray.entity.*;

public class Runner_SwitchCase3 {
    public static void main(String[] args) {

        AracTurleri aracTurleri = new AracTurleri("SIYAH","SUV","DIZEL");

        aracTurleri= new AracTurleri(Renk.SIYAH, Cesit.SUV,Yakit.DIZEL);

        /**
         * Burada Switch-Case imizi enumlardan çekebiliyoruz.
         */

        String Arac = switch (aracTurleri.getRenk()){
            case MAVÝ -> "Aracýnýz Mavi";
            case BEYAZ -> "Aracýnýz Beyaz";
            case SIYAH -> "Aracýnýz Siyah";
            default -> "Aracýnýz Beyaz";
        };
        System.out.println(Arac);


    }
}
