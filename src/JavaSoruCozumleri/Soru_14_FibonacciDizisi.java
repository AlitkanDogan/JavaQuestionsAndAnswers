package JavaSoruCozumleri;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_14_FibonacciDizisi {
    public static void main(String[] args) {
        /*
        Fibonacci dizisi create ediniz.
        Fibonacci serisi sayıları:0, 1,1,2,3,5,8,13,21,34,55, 89, 144, 233,
        377, 610, 987, 1597, 2584, 4181, 6765, 10946, … vb. şeklinde devam eder.
        Her sayı kendisinden önce gelen iki sayının toplamıdır.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz Fibonacci dizi eleman sayısını giriniz.");
        int diziElemanSayisi=scan.nextInt();

        int[] arr=new int[diziElemanSayisi];

        arr[0]=0;
        arr[1]=1;

        for (int i=2;i<diziElemanSayisi;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        System.out.println(Arrays.toString(arr));




    }
}
