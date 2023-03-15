package JavaSoruCozumleri;

import java.util.Scanner;

public class Soru_19_DersOrtalamaHesaplama {
    public static void main(String[] args) {
        /*
         Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
         sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın
         eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        */

        //Kullanıcıdan Ders notlarını alalım.
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Matematik notunuzu giriniz.");
        int mat= scan.nextInt();

        System.out.println("Lütfen Fizik notunuzu giriniz.");
        int fiz= scan.nextInt();

        System.out.println("Lütfen Kimya notunuzu giriniz.");
        int kim= scan.nextInt();

        System.out.println("Lütfen Turkce notunuzu giriniz.");
        int tur= scan.nextInt();

        System.out.println("Lütfen Tarih notunuzu giriniz.");
        int tar= scan.nextInt();

        System.out.println("Lütfen Müzik notunuzu giriniz.");
        int muz= scan.nextInt();

        //Ders ortalamasını alıp, ortalama adında bir veriable atama yapıyoruz.

        double ortalama=(mat+fiz+kim+tur+tar+muz)/6;
        //ortalama sonucu tam sayı olamayabilir. bu nedenle double data türü seçiyoruz.

        if (ortalama>=60 ){
            System.out.println("Ortalama nutunuz : "+ortalama+
                    "\nSınıfı geçtiniz. Tebrikler.");
        }else {
            System.out.println("Ortalama nutunuz : "+ortalama+
                    "\nSınıfta kaldınız. Çalışırsanız başarabilirsiniz.");
        }
    }
}
