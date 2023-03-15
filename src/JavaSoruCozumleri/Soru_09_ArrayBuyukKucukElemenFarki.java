package JavaSoruCozumleri;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_09_ArrayBuyukKucukElemenFarki {
    public static void main(String[] args) {

        /*
        kullanıcıdan girdiği bir array'in en büyük elemanı ile en küçük
        elemanı arasındaki farkını bulan ve konsola yazdıran bir program yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz Array eleman sayısını giriniz : ");
        int elemanSayisi=scan.nextInt();

        int[] arr= new int[elemanSayisi];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print((i+1)+". elemanı giriniz : ");
            arr[i]=scan.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println(Arrays.toString(arr)+" Arrayinde \n        En büuük eleman : "+max
                +"\n        En küçük eleman : "+min);
        System.out.println("En büyük eleman ile en küçük eleman farkı : "+(max-min));
    }
}
