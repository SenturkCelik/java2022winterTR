package Workshop;

import java.util.Scanner;

public class calisma1 {

    public static void main(String[] args) {

        //girilen uc haneli sayinin onlar basamagini yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamakli sayi giriniz");
        int sayi=scan.nextInt();

        int onlarBasamagi=(sayi%10) %10, birlerBasamagi =(sayi%10),  yuzlerBasamagi=(sayi/100);


        if(sayi>99 && sayi<1000){

        switch(onlarBasamagi) {

            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }
            switch (yuzlerBasamagi){
            case 0: System.out.println("");break;
            case 1: System.out.print("yuz");break;
            case 2: System.out.print("ikiyuz");break;
            case 3: System.out.print("ucyuz");break;
            case 4: System.out.print("dortyuz");break;
            case 5: System.out.print("besyuz");break;
            case 6: System.out.print("altiyuz");break;
            case 7: System.out.print("yediyuz");break;
            case 8: System.out.print("sekizyuz");break;
            case 9: System.out.print("dokuzyuz");break;


        }
            switch (yuzlerBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;

            }
            scan.close();


    }
}}
