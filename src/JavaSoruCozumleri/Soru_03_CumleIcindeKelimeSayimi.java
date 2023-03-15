package JavaSoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_03_CumleIcindeKelimeSayimi {
    public static void main(String[] args) {
        /*
  Girilen bir stringteki kelimeleri tek tek saydıran ve daha sonra konsola
  örnekte olduğu gibi yazdıran java code create ediniz.

  For example: İnput   : string is:"Ali come to school and Ayse come to school";
               Output  : Ali=2, come=2, to=2, school=2, and=1, Ayse=1;
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz : ");
        String cumle = scan.nextLine();

        String[] arr = cumle.split(" "); //Cümleyi arraye çevirdim

        List<String> arrList = new ArrayList<>(); //boş arraylist oluşturdum

        //arrayi for döngüsü ile kontrol ederek aynı olan kelimeleri
        // bir kere yazarak array liste element olarak ekledim
        for (int i = 0; i < arr.length; i++) {

            int sayac = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j].equals(arr[i])) {
                    sayac++;
                }
            }

            if (!arrList.contains(arr[i])) {
                arrList.add(arr[i] + "=" + sayac);
            }
        }
        //Array list olarak yazdırdığımız zaman başında sonundaki
        // "[]" parantezden kurtulmak için aşağıdaki for döngüsünü yaptım.

        for (int i = 0; i < arrList.size(); i++) {

            if (i < arrList.size() - 1) {

                System.out.print(arrList.get(i) + ", ");

            } else {
                System.out.println(arrList.get(i));
            }
        }
    }
}
