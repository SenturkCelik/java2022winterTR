package Workshop;

import java.util.Scanner;

public class HalukHocaPratik2  {

    public static void main(String[] args) {

        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("yasinizi giriniz :");
        int yas = scan.nextInt();
        System.out.println("kilonuzu giriniz :");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {  // yas ve sart kontrolu yapildi
            System.out.println("kan bagisi yapamazsin buyude gel");

        } else if (yas >= 18) {

            if (kilo > 0 && kilo < 50) {// kilo sarti ve kontrolu yapiyor
                System.out.println("yasiniz kan bagisi icin uygun ancak kilonuz yetersiz ");

            } else if (kilo >= 50) {
                System.out.println("sartlariniz uygun kan bagisi yapabilirsiniz");

            } else System.out.println(" hatali veri girdiniz");


        }
}}
