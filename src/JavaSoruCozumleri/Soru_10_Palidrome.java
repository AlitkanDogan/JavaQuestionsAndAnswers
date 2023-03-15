package JavaSoruCozumleri;

public class Soru_10_Palidrome {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği bir String'in PALIDROME olup olmadığını kontrol
        eden bir method create ediniz.
        örnek1: Ey edip Adanada pide ye
        örnek2: Traş niçin şart
         */

        palidromKontrol("Ey edip Adanada pide ye");
    }

    public static void palidromKontrol(String str) {

        String str1 = str.toLowerCase();

        String strTers = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            strTers += str1.charAt(i);
        }
        if (str1.equals(strTers)) {
            System.out.println(str + " : POLIDROME bir ifadedir.");
        } else {
            System.out.println(str + " : POLIDROME değildir");
        }

    }
}
