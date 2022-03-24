package day09_ternary_SWitch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        // bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        // çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif tam sayi girin");
        int sayi1=scan.nextInt();


        if (sayi1/5==0){
            System.out.println("");
        }


    }
}
