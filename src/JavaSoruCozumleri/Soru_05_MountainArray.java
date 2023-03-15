package JavaSoruCozumleri;

import java.util.Arrays;

public class Soru_05_MountainArray {
    public static void main(String[] args) {

        /*
        Verilen bir arrayin mountain array olup olmadığını kontrol eden ve
        sonucuconsale yazdıran bir method create ediniz.

        int input1[]={0,2,5,3,1}
        int input2[]={5,2,7,1,4}

        Bir array elemanları en büyük değerine kafdar sürekli artan,
        en büyük değerinden sonra sürekli azalan değer alıyorsa Mountain Arraydir.
         */
        int input1[]={0,2,5,3,1};
        int input2[]={5,2,7,1,4};

        mountainArrayControl(input1);
        mountainArrayControl(input2);






    }

    public static void mountainArrayControl(int[] arr) {

        int max = 0;
        int index = 0;
        boolean control=true;

        //Array içerisindeki en büyük değer ve değere ait indexi buluyoruz.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;


            }
        }


        for (int i = 0; i <index ; i++) {
            if (arr[i]<arr[i+1]){
                continue;
            }else {
                control=false;
                break;
            }
        }

        for (int i = index; i <arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                continue;
            }else {
                control=false;
                break;
            }
        }

        if (control){
            System.out.println(Arrays.toString(arr)+" Arrayi Mountain Array.");
        }else {
            System.out.println(Arrays.toString(arr)+" Arrayi Mountain Array değildir.");
        }

    }


}
