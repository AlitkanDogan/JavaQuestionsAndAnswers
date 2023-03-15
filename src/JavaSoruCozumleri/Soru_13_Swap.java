package JavaSoruCozumleri;

public class Soru_13_Swap {
    public static void main(String[] args) {

        /*
        Write a java Program To swap two Numbers
        Swap 8takas) islemini--> a=3, b=5 iken a=5, b=3 değerlerini alması
        işlemidir.İki yoldan yaptığınız kodu giriniz.
            1.Yol: 3. değişken kullanarak
            2.Yol: 3. değişken kullanmadan
         */
        System.out.println("//////////////1.YÖNTEM////////////");

        int a=3;
        int b=5;
        int c;
        System.out.println("Swap Öncesi : a="+a+", b="+b);

        c=b; b=a; a=c;

        System.out.println("Swap Sonrası : a="+a+", b="+b);

        System.out.println("//////////////2.YÖNTEM////////////");
        System.out.println("Swap Öncesi : a="+a+", b="+b);

      a=a-b;
      b=a+b;
      a=b-a;
        System.out.println("Swap Sonrası : a="+a+", b="+b);
    }
}
