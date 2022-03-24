package day11_StringManipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel";

        str1.indexOf('J');
        System.out.println(str1.indexOf('J')); // 0
        System.out.println(str1.indexOf('l'));// 19
        System.out.println(str1.length()-1);

        System.out.println(str1.indexOf("b")); // ayni harften birden fazla olursa dondurur.

        System.out.println(str1.indexOf('b',5));
        // verilen String deki 2.a harfinin index ini bulalim

        int ilkindex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1));

       //strinde olmayan bir harf aratalim
        System.out.println(str1.indexOf("y"));//-1 yok demektir

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazsin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail=scan.next();
        if(mail.indexOf("@")==(-1)){

            System.out.println("gecersiz");


        }else{

            System.out.println("mailiniz kabul edildi");
        }




    }
}
