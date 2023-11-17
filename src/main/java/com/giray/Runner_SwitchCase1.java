package com.giray;

import java.util.Scanner;

public class Runner_SwitchCase1 {
    public static void main(String[] args) {
        /**
         *  Switch Case; tanýmlanmýþ olan yalnýzca bir deðiþkenin, alacaðý deðerlere baðlý olarak,
         *  farklý sonuçlar döndürmesini saðlayan bir yapýdýr.
         * Girilen sayýnýn ay isimlerinden birine karþýlýk gelip gelmediðini kontrol eden ve ekrana yazdýran bir
         * uygulama yapalým.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayý girin (1-12): ");
        int ay = scanner.nextInt();

        String ayIsmi;

        switch (ay) {
            case 1:ayIsmi = "Ocak";    break;

            case 2:ayIsmi = "Þubat";   break;

            case 3:ayIsmi = "Mart";    break;

            case 4:ayIsmi = "Nisan";   break;

            case 5:ayIsmi = "Mayýs";   break;

            case 6:ayIsmi = "Haziran"; break;

            case 7:ayIsmi = "Temmuz";  break;

            case 8:ayIsmi = "Aðustos"; break;

            case 9:ayIsmi = "Eylül";   break;

            case 10:ayIsmi = "Ekim";   break;

            case 11:ayIsmi = "Kasým";  break;

            case 12:ayIsmi = "Aralýk"; break;

            default:ayIsmi = "Geçersiz ay numarasý";
        }

        System.out.println("Girilen sayýya karþýlýk gelen ay: " + ayIsmi);

        scanner.close();
    }

}
