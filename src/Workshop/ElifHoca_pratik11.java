package Workshop;

import java.util.Scanner;

public class ElifHoca_pratik11 {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacaginiz islemi seciniz + * - / ");

        char islem=scan.next().charAt(0);

        if (islem== '+' || islem=='-' || islem =='*'|| islem =='/' ) {


        System.out.println("birinci sayi :");
        double num1=scan.nextDouble();
        System.out.println("ikinci sayi :");
        double num2=scan.nextDouble();

        hesapMakinesi(islem,num1,num2);

        }else System.out.println("hatali giris yaptiniz");
    }

    private static void hesapMakinesi(char islem, double num1, double num2) {


                switch (islem) {
                    case '+':
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case '/':
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        break;
                    case '*':
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;

                     }


            //}else System.out.println("hatali giris yaptiniz");
    }


}

