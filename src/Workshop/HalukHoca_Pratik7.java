package Workshop;

import java.util.Scanner;

public class HalukHoca_Pratik7 {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    /*
    Bakiye(baslangic bakiyesi 1000 tl)ogrenme,para yatirma,para cekme,
    cikis islemlerinin yapildigi bir ATM app.code create ediniz.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ATM'ye Hosgeldiniz");
        System.out.println("Bakiye sorgulama : 1\nPara Cekme : 2\nPara Yatirma : 3\n)Cikis : 4\nSecim");
        secim();
    }

    private static void secim() {
        System.out.println("Yapacaginiz islemi seciniz");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCek();

                break;

            case 3:
                ParaYatir();

                break;

            case 4:
                cikis();
                break;
        }

    }

    private static void ParaYatir() {
        System.out.println("Yatircaginiz miktari giriniz");
        int yatirilacakMiktar=scan.nextInt();
        bakiye+=yatirilacakMiktar;
        System.out.println("Paraniz basariyla yatirilmstir");

        System.out.println("isleme devam etmek icin 1\nislemi sonlandirmak icin 0\nbasiniz");
        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();


    }

    private static void paraCek() {
        System.out.println("Cekeceginiz miktari giriniz");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar>bakiye){
            System.out.println("Bakiyeniz yetersiz");

        }else {
            bakiye-=cekilecekMiktar;
        }

            System.out.println("isleme devam etmek icin 1\nislemi sonlandirmak icin 0\n basiniz");
            int karar=scan.nextInt();
            if (karar==1){
                secim();
            }else cikis();

        }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz: " + bakiye);
        System.out.println("isleme devam etmek icin 1 \n islemi sonlandirmak icin 0\n basiniz");
        int karar=scan.nextInt();
        if (karar==1){
        secim();
    }else cikis();

}

    private static void cikis() {
        System.out.println("Iyi gunler dileriz, Yine bekleriz");

    }

}




