package Workshop;

import java.util.Scanner;

public class HalukHoca_praktis5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz");
        double vize = scan.nextDouble();
        System.out.println("vize sinavi icin hesaplama yuzdesini giriniz");
        double vizeOrani = scan.nextDouble() / 100;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("fnal notunuzu giriniz");

        double fnal = scan.nextDouble();
        System.out.println("fnal sinavi icin hesaplama yuzdesini giriniz");
        double fnalOrani = 1-vizeOrani;


        double gecmeNotu = (vize * vizeOrani) + (fnal * fnalOrani);

        System.out.println("gecme notunuz :" +gecmeNotu);

        if (vize < 0 || fnal < 0) {
            System.out.println("bos kagit versen sifir alirdin sigir :))");

        } else {

            if (gecmeNotu >= 90) {
                System.out.println(" AA ");

            } else if (gecmeNotu < 90 && gecmeNotu >= 80) {
                System.out.println("BA");

            } else if (gecmeNotu < 80 && gecmeNotu >= 70) {
                System.out.println("BB");


            } else if (gecmeNotu < 70 && gecmeNotu >= 60) {
                System.out.println("CB");

            } else if (gecmeNotu < 60 && gecmeNotu >= 50) {
                System.out.println("CC");
                {

                }
                if (gecmeNotu < 50 && gecmeNotu >= 40) {
                    System.out.println("DC");


                } else if (gecmeNotu < 40 && gecmeNotu >= 30) {
                    System.out.println("DD");
                }
            }
        }
    }
}