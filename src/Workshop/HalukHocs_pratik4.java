package Workshop;

import java.util.Scanner;

public class HalukHocs_pratik4 {

    public static void main(String[] args) {
/*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("ehliyetiniz var ise :1 yok ise : 0 yaziniz");
        int ehliyetiniz = scan.nextInt();
        System.out.println("hizinizi giriniz");
        int hiziniz = scan.nextInt();

        if (ehliyetiniz == 1) {
            if (hiziniz < 0) {
                System.out.println("hatali veri girdiniz");


        } else if (hiziniz >= 55 && hiziniz < 75) {

            System.out.println("Ceza 100 $");

        } else if (hiziniz >= 75 && hiziniz < 84) {
            System.out.println("Cezaniz 150 $");
        } else if (hiziniz >= 84 && hiziniz <= 94) {
            System.out.println("Ceza 320 $");

        } else if (hiziniz > 94) {
            System.out.println("Ceza 700 $");
        } else System.out.println("hiz sinirinda seyahat ediyorsunuz hayirli yolculuklar");


        }else if(ehliyetiniz == 0){


        if (hiziniz < 0) {
            System.out.println("negatif hiz olmaz hatali veri girisi");
        } else if (hiziniz >= 55 && hiziniz < 75) {
            System.out.println("Ceza 300 $ ");

        } else if (hiziniz >= 75 && hiziniz < 84) {
            System.out.println("Ceza 350 $");

        } else if (hiziniz <= 84 && hiziniz <= 94) {
            System.out.println("Ceza 520 $");

        } else if (hiziniz > 94) {
            System.out.println(" Ceza 700 $");


        } else System.out.println("hiz sinirinda syahat ediyorsunuz ancak ehliyetiniz yok cezaniz 200$ ");

        }else System.out.println("ehliyet yok");




        }
    }





