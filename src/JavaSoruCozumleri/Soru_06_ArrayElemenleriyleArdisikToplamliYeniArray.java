package JavaSoruCozumleri;

import java.util.Arrays;

public class Soru_06_ArrayElemenleriyleArdisikToplamliYeniArray {
    public static void main(String[] args) {
       /*
    Verilen bir arrayin elemanlarının artışık artan toplamını
    hasaplayıp yeni bir arraya atayan bir program create ediniz.

    input : {3,5,1,2,7,9,2,3,5,72,1,3,4,6}
    output : {3,5+1,2+7+9,2+3+5+7}
             {3,6,18,17,16}
     */
        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7,2,1,3,4,6};
        int[] yeniArr=new int[5];
        
        int basIndex=0;
        int bitIndex=1;


        for (int i = 0; i <5 ; i++) {
            int toplam=0;

            for (int j = basIndex; j <bitIndex; j++) {
                toplam+=arr[j];
            }
            yeniArr[i]=toplam;
            basIndex=bitIndex;
            bitIndex+=i+2;
        }

        System.out.println(Arrays.toString(yeniArr));
            }

        }



