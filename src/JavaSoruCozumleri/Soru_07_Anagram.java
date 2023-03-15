package JavaSoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_07_Anagram {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 String girmesini isteyin.String'lerin büyük küçük harf duyarlılığı olmadan
        karakterleri ve karakter sayıları aynıysa console girilen karakterler "Anagram", aksi takdirde console "
        Anagram değil" yazdırın.
        Örnek: "Pide" ve "EDİP" anagram ifadelerdir.
                "Mary" and "army" and "Ramy" are Anagrams
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 String ifade giriniz. Her ifadeden sonra ENTER'e basınız.");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String strA = str1.toLowerCase();
        String strB = str2.toLowerCase();

        String[] arr1 = strA.split("");
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        String[] arr2 = strB.split("");
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i <arr2.length ; i++) {
            list2.add(arr2[i]);
        }


        if (list1.size()==list2.size()){
            for (int i = 0; i <list1.size() ; i++) {
                for (int j = 0; j <list2.size() ; j++) {
                    if (list1.get(i).equals(list2.get(j))){
                        list2.remove(j);
                    }
                }
            }

            if (list2.size()==0){
                System.out.println("Girdiğiniz ifade Anagram'dır");
            }else  {
                System.out.println("Girdiğiniz ifade Anagram değildir.");
            }

        }else {
            System.out.println("Girdiğiniz ifade Anagram değildir.");
        }
    }
}
