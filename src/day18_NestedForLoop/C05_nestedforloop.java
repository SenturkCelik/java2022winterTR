package day18_NestedForLoop;

import java.util.Scanner;

public class C05_nestedforloop {
    public static void main(String[] args) {


        // A
        // A B
        // A B C
        // A B C D
        // A B C D E
        // A B C D E F şeklinde gitsin alfabeyi gezsin A 'nın ASCII değeri 65

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf girin: ");
        char input = scan.next().charAt(0);
        harflerdenUcgenOlustur(input);

    }

    private static void harflerdenUcgenOlustur(char input) {

        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
