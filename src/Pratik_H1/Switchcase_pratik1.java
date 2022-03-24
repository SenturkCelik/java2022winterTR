package Pratik_H1;

import java.util.Scanner;

public class Switchcase_pratik1 {
    public static void main(String[] args) {

        //Girilen bir ay numarasina gore ,ayin kac oldugunu sayi ile yazdir

        Scanner scan = new Scanner(System.in);
        System.out.print("yilin kacinci ayini ogrenmek istiyorsun: ");
        int ay = scan.nextInt();

        switch (ay) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("girdiginiz ay 31 gundur");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("girdiginiz ay 30 gundur");
                break;

            case 2:
                System.out.print("bulundugunuz yili yaziniz");
                int yil = scan.nextInt();


                if (yil % 4 == 0) {

                    System.out.println("girdiginiz ayda 29 gun vardir:");

                } else System.out.println("girdiginiz ayda 28 gun vardir:");
                break;
            default:
                System.out.println("hatali giris yaptin dostum");

        }



        }

    }


