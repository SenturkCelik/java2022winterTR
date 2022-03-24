package Workshop;

import java.util.Scanner;

public class workshop_if_2 {

    public static void main(String[] args) {

       // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin Ornek: gun=Pazar output = “Hafta sonu”
       // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if(gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");

        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){

        System.out.println("girdiginiz gun haftaici");

        }

    }
}
