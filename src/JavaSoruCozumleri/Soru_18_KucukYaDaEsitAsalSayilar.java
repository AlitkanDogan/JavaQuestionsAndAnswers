package JavaSoruCozumleri;

import java.util.Scanner;

public class Soru_18_KucukYaDaEsitAsalSayilar {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan sayıdan küçük veya eşit olan
        Asal sayıları yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        for (int i = 2; i <= sayi; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }

            }
            if (sayac == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}
