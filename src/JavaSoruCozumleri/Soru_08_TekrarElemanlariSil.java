package JavaSoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_08_TekrarElemanlariSil {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız elemanlardan oluşan bir listede
         tekrarlanan elemanları silen bir program yazınız.
         */

        List<String> list=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz list elamanlarını giriniz." +
                "\nBitirmek için 0'a basınız");

        String str="";

        do {
            str=scan.nextLine();
            list.add(str);
        }while (!str.equals("0"));

        if (list.contains("0")){
            list.remove("0");
        }
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                if(i==j){
                    //işlem yapma
                }else{
                    if (list.get(i).equals(list.get(j))){
                        list.remove(list.get(j));
                    }
                }
            }
        }
        System.out.println(list);

    }
}
