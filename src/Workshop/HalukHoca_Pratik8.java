package Workshop;

import java.util.Scanner;

public class HalukHoca_Pratik8 {
    public static void main(String[] args) {


    /*  TASK :
        Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */
        String harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a = harfDeposu.charAt(harfDeposu.indexOf("A"));
        char l = harfDeposu.charAt(harfDeposu.indexOf("L"));
        char i = harfDeposu.charAt(harfDeposu.indexOf("I"));


        System.out.println(""+a+l+i);



    }


}
