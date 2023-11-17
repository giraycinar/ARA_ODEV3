package com.giray;
import com.giray.entity.Cinsiyet;
import com.giray.entity.Personel;
import com.giray.entity.State;
import com.giray.entity.Unvan;

public class Runner_SwitchCase2 {
    public static void main(String[] args) {

        Personel personel = new Personel("Murat","TAÞ",Unvan.MUDUR, State.AKTIF, Cinsiyet.ERKEK);


        personel = new Personel("Ayþe","TEKÝN", Unvan.GENEL_MUDUR,State.BLOKE,Cinsiyet.KADIN);


        personel= new Personel("Bahar", "KORKMAZ", Unvan.CEO, State.BEKLEMEDE,Cinsiyet.KADIN);

        if (personel.getCinsiyet()==Cinsiyet.KADIN){
            System.out.println("Kadýn için hediye gönderildi");
        }else if(personel.getCinsiyet()==Cinsiyet.ERKEK){
            System.out.println("Erkek için hediye gönderildi");
        }else{
            System.out.println("Genel bir hediye gönderildi.");

        }
        /**
         * kriterlerin belli olduðu durumlarda daha iþlevseldir.
         * Bir String return ediliyor.
         * Gelen duruma göre bir cevap return eder.(arrow function switch-case)
         */

        String mesaj = switch (personel.getCinsiyet()){
            case ERKEK -> "Erkek için hediye gönderildi";
            case KADIN -> "Kadýn için hediye gönderildi";
            default -> "Kadýn için hediye gönderildi";
        };


        System.out.println(mesaj);

        switch (personel.getCinsiyet()){
            case Cinsiyet.KADIN:
                System.out.println("Kadýn için hediye gönderildi"); break;
            case Cinsiyet.ERKEK:
                System.out.println("Erkek için hediye gönderildi"); break;
            default:
                System.out.println("Kadýn için hediye gönderildi"); break;
        }



    }
}
