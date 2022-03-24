package Workshop;

import java.util.Scanner;

public class dowhileloop1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=1;
        int toplam=0;
        int sayacNegatif=0;
                int sayacpozitif=0;

        do {
            System.out.println("pozitif bir tam sayi girin\nbitirmek icin 0'a basin");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("negatif sayi giremezsin");
                sayacNegatif++;

            }else if (sayi>0){
                toplam+=sayi;
                sayacpozitif++;
            }


        }while(sayi!=0);
        System.out.println("girilen pozitif sayilarin toplami :"+ toplam);
        System.out.println("girilen pozitif syilarin adedi:" + sayacpozitif);
        System.out.println("yanlislikla girilen negatif sayi adedi:"+sayacNegatif);


    }
}
