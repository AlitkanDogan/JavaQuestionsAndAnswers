package JavaSoruCozumleri;

import java.util.Scanner;

public class Soru_12_AsalSayiKontrolMethodu {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı girmesini isteyin, Sayının asal olup olmadığını kontrol
        eden ve sonucu console yazdıran method oluşturun.
         */

        asalMi();

    }

    public static void asalMi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz.");
        int sayi = scan.nextInt();

        int sayac = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac > 0) {
            System.out.println(sayi + " sayısı Asal sayi değildir");
        } else {
            System.out.println(sayi + " sayısı Asal sayıdır.");
        }
    }
}
