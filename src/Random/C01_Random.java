package Random;

import java.util.Random;
import java.util.Scanner;

public class C01_Random {
    public static void main(String[] args) {

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (sayi != tahmin) {
            System.out.println("lutfen bir sayi girin");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi soyle");


            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi gir");
            }

            sayac++;


        }
        System.out.println("tuttugum sayiyi" + (sayac - 1) + "tahminde bulundunuz");


    }



}
