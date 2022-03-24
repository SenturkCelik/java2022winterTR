package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println ("Lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
// sayilarin ikside pozitif ise sayilarin toplamini yazdirin
        if (sayi1>0 && sayi2>0){
        System.out.println("girdiginiz iki sayi da pozitif oldugundan toplamlari="+ (sayi1+sayi2));

        // sayilarin ikiside negative ise sayilarin carpimini yazdirin

    } else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayida negatif oldugundan carpimlari="+ (sayi1*sayi2<0));

            // sayilarin ikisi farkli isaretlere sahipse
            //''farkli isaretlerde sayilarla islem yapamazsin''yazdirin

        }else if (sayi1*sayi2<0){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");


        }else {
            System.out.println( "sifir carpmaya gore yutan elamandir");
        }

        }

}
