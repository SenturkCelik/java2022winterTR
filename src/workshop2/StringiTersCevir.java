package workshop2;

import java.util.Scanner;

public class StringiTersCevir {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String metin giriniz");
       String str= scan.nextLine();

       TersCevir(str);

    }

    private static void TersCevir(String str) {
        String reverseStr="";
        for (int i=str.length()-1;i>=0; i--){
            reverseStr+=str.charAt(i);

        }
        System.out.println(reverseStr);



    }
}
