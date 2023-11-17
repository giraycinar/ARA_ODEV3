package com.giray;

import java.util.Scanner;

public class Runner_SwitchCase1 {
    public static void main(String[] args) {
        /**
         *  Switch Case; tan�mlanm�� olan yaln�zca bir de�i�kenin, alaca�� de�erlere ba�l� olarak,
         *  farkl� sonu�lar d�nd�rmesini sa�layan bir yap�d�r.
         * Girilen say�n�n ay isimlerinden birine kar��l�k gelip gelmedi�ini kontrol eden ve ekrana yazd�ran bir
         * uygulama yapal�m.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir say� girin (1-12): ");
        int ay = scanner.nextInt();

        String ayIsmi;

        switch (ay) {
            case 1:ayIsmi = "Ocak";    break;

            case 2:ayIsmi = "�ubat";   break;

            case 3:ayIsmi = "Mart";    break;

            case 4:ayIsmi = "Nisan";   break;

            case 5:ayIsmi = "May�s";   break;

            case 6:ayIsmi = "Haziran"; break;

            case 7:ayIsmi = "Temmuz";  break;

            case 8:ayIsmi = "A�ustos"; break;

            case 9:ayIsmi = "Eyl�l";   break;

            case 10:ayIsmi = "Ekim";   break;

            case 11:ayIsmi = "Kas�m";  break;

            case 12:ayIsmi = "Aral�k"; break;

            default:ayIsmi = "Ge�ersiz ay numaras�";
        }

        System.out.println("Girilen say�ya kar��l�k gelen ay: " + ayIsmi);

        scanner.close();
    }

}
