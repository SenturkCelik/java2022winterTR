package day10_SwitchVeStringManupulation;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
            case 2:
            case 3:
                System.out.println("Kis");
                break;
            case 4:

            case 5:

            case 6:
                System.out.println("Ilkbahar");
                break;
            case 7:

            case 8:

            case 9:
                System.out.println("Yaz");
                break;
            case 10:

            case 11:

            case 12:
                System.out.println("s.bahar");

            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");
        }

    }
}


