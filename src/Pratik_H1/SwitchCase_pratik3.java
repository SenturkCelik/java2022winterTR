package Pratik_H1;

import java.util.Scanner;

public class SwitchCase_pratik3 {
    public static void main(String[] args) {

        //bakiye (baslangic bakiyesi 1000 tl) ogrenme,para yatirma,ve cekme,cikis islemlerinin yapildigi bir ATM app.

        // 1.adim:anahtar=switch ==>islem(bakiye sorma,yatir,cek,bakiye = bakiye yatirilan,cekecekse sart girer.
        // bakiye bin tl, cekmek istedigi miktar 2000 tl ,bakiye guncellemesi lazim)

        Scanner scan=new Scanner(System.in);
        System.out.print("  ****");
        System.out.println("  ATM'ye Hos geldiniz ");
        System.out.println(" Bakiye sorgula :1\nPara cekme :2\nPara yatirma :3\nCikis :4\nYapacaginiz islem seciniz :5\n");
        int islem=scan.nextInt();
        int bakiye=1000;
        switch (islem){
            case 1:
                System.out.print("mevcut bakiyeniz:"+bakiye);
                break;

                case 2:
                System.out.print("cekeceginiz miktari giriniz:");
                int cekilenMiktar=scan.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("yetersiz bakiye");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("kalan bakiye :"+bakiye);
                }


                break;

                case 3:
                System.out.print("yatiracaginiz miktari giriniz:");
                int yatirilanMiktar=scan.nextInt();
                bakiye+=yatirilanMiktar;
                    System.out.println("guncel bakiyenizin miktari :"+bakiye);
                break;

                case 4:
                System.out.println("cikisiniz yapilmistir,yine bekleriz");
                break;


        }















    }
}
