package Workshop;

import java.util.Scanner;

public class HalukHoca_pratik6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz : ");
        int sayi= scan.nextInt();

        String sonuc=(sayi>99 && sayi<1000)?("3 basamakli sayi"):(sayi%2==0 ?"3 basamakli olmayan cift sayi ": "3 basamakli olmayan tek sayi girdiniz");
        System.out.println(sonuc);


    }

}
