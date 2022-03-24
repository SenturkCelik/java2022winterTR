package Workshop;

import java.util.Scanner;

public class workshop_if {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("girilen sayi cift sayidir");


        }
        if (sayi % 2 != 0) {
            System.out.println("girilen sayi tektir");


        }


    }
}
