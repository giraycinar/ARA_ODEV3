package com.giray;
import com.giray.entity.Cinsiyet;
import com.giray.entity.Personel;
import com.giray.entity.State;
import com.giray.entity.Unvan;

public class Runner_SwitchCase2 {
    public static void main(String[] args) {

        Personel personel = new Personel("Murat","TA�",Unvan.MUDUR, State.AKTIF, Cinsiyet.ERKEK);


        personel = new Personel("Ay�e","TEK�N", Unvan.GENEL_MUDUR,State.BLOKE,Cinsiyet.KADIN);


        personel= new Personel("Bahar", "KORKMAZ", Unvan.CEO, State.BEKLEMEDE,Cinsiyet.KADIN);

        if (personel.getCinsiyet()==Cinsiyet.KADIN){
            System.out.println("Kad�n i�in hediye g�nderildi");
        }else if(personel.getCinsiyet()==Cinsiyet.ERKEK){
            System.out.println("Erkek i�in hediye g�nderildi");
        }else{
            System.out.println("Genel bir hediye g�nderildi.");

        }
        /**
         * kriterlerin belli oldu�u durumlarda daha i�levseldir.
         * Bir String return ediliyor.
         * Gelen duruma g�re bir cevap return eder.(arrow function switch-case)
         */

        String mesaj = switch (personel.getCinsiyet()){
            case ERKEK -> "Erkek i�in hediye g�nderildi";
            case KADIN -> "Kad�n i�in hediye g�nderildi";
            default -> "Kad�n i�in hediye g�nderildi";
        };


        System.out.println(mesaj);

        switch (personel.getCinsiyet()){
            case Cinsiyet.KADIN:
                System.out.println("Kad�n i�in hediye g�nderildi"); break;
            case Cinsiyet.ERKEK:
                System.out.println("Erkek i�in hediye g�nderildi"); break;
            default:
                System.out.println("Kad�n i�in hediye g�nderildi"); break;
        }



    }
}
