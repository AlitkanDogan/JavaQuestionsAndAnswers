package JavaSoruCozumleri;

import java.util.ArrayList;
import java.util.List;

public class Soru_04_ArrayIcerisindeToplamiAyniOlanSayilar {
    public static void main(String[] args) {
/*
Verilen bir arraydeki,toplamı belirli bir sayi olan
tüm çiftleri bulup,console yazdıran Java code 'nu yazın
input:{4,6,5,-10,8,5,20}==>10
output: 4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10
 */

        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        int istenenToplam = 10;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if ((arr[i] + arr[j]) == istenenToplam) {
                    if (!list.contains(arr[i] + " + " + arr[j] + " = " + istenenToplam)) {
                        list.add(arr[i] + " + " + arr[j] + " = " + istenenToplam);
                    }
                }
            }
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
