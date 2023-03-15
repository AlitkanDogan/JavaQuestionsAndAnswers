package JavaSoruCozumleri;

public class Soru_16_ArraydeBirbirineYakinSayiCiftleri {
    public static void main(String[] args) {

        /*
        Farklı güçleri olan atlarla bir at yarışı düzenleniyor
        Atların gücü bir tamsayi dizi assign edilirse
        birbirine yakın güçlere sahip at çiftlerini bulunuz.
        örnek: input    : {3,67,9,46,55,48}
               output   : 48,46
         */
        int[] arr = {14, 3, 67, 9, 1, 7, 55, 48};

        int sayi1 = arr[0];
        int sayi2 = arr[1];

        int fark;
        if ((arr[0] - arr[1]) >= 0) {
            fark = arr[0] - arr[1];

        } else {
            fark = arr[1] - arr[0];
        }
        System.out.println(fark);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] - arr[j]) < fark && (arr[i] - arr[j]) >= 0 && i != j) {
                    fark = arr[i] - arr[j];
                    sayi1 = arr[i];
                    sayi2 = arr[j];
                }
            }
        }
        System.out.println("Birbirine en yakın 2 sayi :"+sayi1+" ve "+sayi2);

    }
}
