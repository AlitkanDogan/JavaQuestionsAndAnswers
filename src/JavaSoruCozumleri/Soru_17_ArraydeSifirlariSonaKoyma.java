package JavaSoruCozumleri;

import java.util.Arrays;

public class Soru_17_ArraydeSifirlariSonaKoyma {
    public static void main(String[] args) {

        /*
        Bir tamsayi dizisinde tüm sıfırları sona koyan bir program create ediniz.
        input : {3,0,4,2,0,6,0}
        ouutput : {3,4,2,6,0,0,0}

                 */

        int[] arr = {3, 0, 4, 2, 0, 6, 0};

        int[] arr2 = new int[arr.length];

        int tolam;

        //[0,0,0,0,0,0,0]

        int yeniIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                    arr2[yeniIndex] = arr[i];
                    yeniIndex++;
            }

        }
        System.out.println(Arrays.toString(arr2));


    }

}

