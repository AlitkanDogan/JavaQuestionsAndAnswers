package JavaSoruCozumleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_15_StringTekrarEdenKarakterSayisi {
    public static void main(String[] args) {

        /*
        Verilen bir Stringte tekrarlayan character'leri ve
        tekrar satısını konsola yazdırınız.
        input : "abaabbabcbccbaabddbebdf"
        output: a6b9c3d3e1f1
         */

        String str="abaabbabcbccbaabddbebdf";

        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        List<String> list=new ArrayList<>();

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i].equals(arr[j])){
                    sayac++;
                }
            }
            if (!list.contains(arr[i]+sayac)){
                list.add(arr[i]+sayac);
            }
            sayac=0;
        }
        System.out.println(list);
        for (String a:list
             ) {
            System.out.print(a);
        }




    }
}
