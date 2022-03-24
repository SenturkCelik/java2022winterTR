package day11_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {
        //kullanicidan ismini alipbasharfini vr son harfini buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Ilk Harf:" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf: "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));



    }
}
