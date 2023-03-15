package JavaSoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_11_StringBirdenFazlaKarakterYazdir {
    public static void main(String[] args) {
        /*
        Kullanıcının girmiş olduğu bir String'de tekrarlanan karakterleri
        (birden fazla olan karakterler) bulan ve consaole yazdıran
        method create ediniz.
        ör: input : "Java biraz bizi yordu."
        output : Tekrar eden karakterler: a, b, i, r, z
         */

        stringdeBirdenFazlaKarakterBul();

    }
    public static void stringdeBirdenFazlaKarakterBul() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String str = scan.nextLine();
        List<String> list = new ArrayList<>();
        int sayac = 0;


        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    sayac++;
                }
            }
            if (sayac > 0 && !list.contains(str.substring(i, i + 1)) && !str.substring(i, i + 1).equals(" ")) {
                list.add(str.substring(i, i + 1));
            }
            sayac = 0;
        }
        for (int i = 0; i < list.size(); i++) {

            if (i < list.size() - 1) {

                System.out.print(list.get(i) + ", ");

            } else {
                System.out.println(list.get(i));
            }
        }
    }
}

