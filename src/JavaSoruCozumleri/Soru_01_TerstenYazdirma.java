package JavaSoruCozumleri;

import java.util.Scanner;

public class Soru_01_TerstenYazdirma {
    public static void main(String[] args) {
        /*
        soru1_Kullanıcıdan bir metin alın, aldığınız metni
        tersttten yazdıran bir method olusturun.
         */

       terstenYazdirma();

    }

    public static void terstenYazdirma(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin=scan.nextLine();

        String yeniMetin="";


        for (int i = metin.length(); i >0 ; i--) {

            yeniMetin+=metin.charAt(i-1);
        }
        System.out.println(yeniMetin);
    }

}
