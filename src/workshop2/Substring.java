package workshop2;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str=scan.nextLine();

        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        ilkSonHarf(str,sayi);
        System.out.println(ilkSonHarf(str,sayi));
    }

    private static String ilkSonHarf(String str, int sayi) {
        String s=str.substring(0,1)+str.substring(str.length()-1);
        System.out.print(s);
        String b="";
        for (int i=1; i<=sayi; i++) {
            b+=s;

        }
        return b;
    }
}
