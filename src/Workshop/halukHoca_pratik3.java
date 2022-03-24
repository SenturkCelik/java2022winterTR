package Workshop;

import java.util.Scanner;

public class halukHoca_pratik3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("x ve y degerleri girin");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("girdiginiz degerler 1.bolge");


        } else if (x < 0 && y > 0) {
            System.out.println("girdiginiz degerler 2.bolge");

        } else if (x<0  && y < 0) {
            System.out.println("girdiginiz degerler 3.bolge");

        } else if (x> 0 && y<0) {
            System.out.println("girdiginiz degerler 4.bolge");

        }else if(x!=0 && y==0 ){
            System.out.println("girdiginiz degerler x ekseni uzerinde");

        }else if(x==0 && y!=0 ){
            System.out.println("girdiginiz degerler y ekseni uzerinde");


        }else System.out.println("girdiginiz degerler orjindedir");

    }
}