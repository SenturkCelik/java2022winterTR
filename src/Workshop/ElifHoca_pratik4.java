package Workshop;

import java.util.Scanner;

public class ElifHoca_pratik4 {

    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("String 1 :");
        String str1=scan.nextLine();
        System.out.println("String 2: ");
        String str2=scan.nextLine();

        System.out.println("Stringlerin 1.method ile birlesimi : "+ str1+" "+str2);
        System.out.println("Stringlerin2.method ile birlesimi :" + str1.concat(" " +str2));

        String str1ilksiz=str1.substring(1);
        String str2ilksiz=str2.substring(1);
        System.out.println("Stringlerin ilk harfsiz halleri : "+ str1ilksiz+" "+ str2ilksiz);


    }
}
