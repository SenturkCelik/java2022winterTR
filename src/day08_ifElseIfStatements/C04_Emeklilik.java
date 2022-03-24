package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cinsinizi yaziniz" +
                "\nKadin icin K \nErkek icin E harfini giriniz");


        char cinsiyet=scan.next().toLowerCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='K') {

            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");

            } else if (yas < 60) {
                System.out.println("Emekli olamazsin \nDaha " + (60 - yas) + "yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        }if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");

            }else if(cinsiyet=='E'){

            }else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");

        } if (cinsiyet==('E'))


            System.out.println("Lutfen gecerli bir harf giriniz");
        }





    }



