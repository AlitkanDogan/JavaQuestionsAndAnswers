package JavaSoruCozumleri;

import java.util.Scanner;

public class Soru_02_ArmstrongSayi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan bir sayının Armstrong sayı olup
        olmadığını kontrol edin, sonucu konsola yazdırın.
        armstrong sayı:bir sayının rakamları küplerinin toplamı kendisine eşit sayılardır
        örn=153=1*1*1 +5*5*5 +3*3*3
        370
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        int sayi1 = sayi;
        int toplam = 0;
        int basamakDegeri = 0;

        while (sayi1 != 0) {

            basamakDegeri = sayi1 % 10;
            toplam += (basamakDegeri * basamakDegeri * basamakDegeri);
            sayi1 = sayi1 / 10;
        }

        if (sayi == toplam) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır");
        } else {
            System.out.println(sayi+" sayısı Armstrong sayı değildir.");
        }
    }

}

