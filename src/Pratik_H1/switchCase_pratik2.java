package Pratik_H1;

import java.util.Scanner;

public class switchCase_pratik2 {
    public static void main(String[] args) {
        // kullanicin yasadigi gune gore 100 gun sonra hangi gun oldugunuzu yazdiriin
        // pazartesi hafta basi

        Scanner scan = new Scanner(System.in);
        System.out.println("pazartesi: 1\nsali: 2\ncarsamba: 3\npersembe: 4\ncuma: 5\ncumartesi: 6\npazar: 7\n Haftanin kacinci gununde oldugunu giriniz:");
        int kacincigun = scan.nextInt();

        if (kacincigun <= 0 || kacincigun > 7) {

            System.out.println("hatali veri girdiniz");
        } else
            System.out.println("kac gun sonrasini ogrenmek istiyorsun: ");
        int kacgunSonrasi = scan.nextInt();
        int bulunanGun = (kacgunSonrasi % 7 + kacincigun) % 7;


        switch (bulunanGun) {
            case 1:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden PAZARTESI");
                break;
            case 2:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden SALI");
                break;
            case 3:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden CARSAMBA");
                break;
            case 4:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden PERSEMBE");
                break;
            case 5:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden CUMA");
                break;
            case 6:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden CUNARTESI");
                break;
            case 0:
                System.out.println(kacgunSonrasi + "gun sonra gunlerden PAZAR");
                break;

            default:
                System.out.println("hatali giris yaptin");

        }





    }



}
