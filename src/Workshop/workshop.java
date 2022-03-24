package Workshop;

import java.util.Scanner;

public class workshop {

    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("toplama icin 1\n  cikarma icin 2\n  carpma icin 3\n  bolme icin 4\n");

        int islem=scan.nextInt();
        System.out.println("lutfen iki tam sayi giriniz");

        double num1= scan.nextDouble();
        double num2=scan.nextDouble();
        if (islem==1){
            System.out.println("toplama isleminin sonucu: "      +num1+   " + "    + num2 +  " = "   + (num1 + num2));

        }else if (islem==2){
            System.out.println("cikarma isleminin sonucu:"  +num1+  "-"  +num2+  "="  +(num1-num2));
        }




    }
}
