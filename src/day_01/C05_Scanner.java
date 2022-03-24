package day_01;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        float yaricap=scan.nextFloat();
        System.out.println("cemberin cevresi:"+yaricap);
        System.out.println("cemberin cevresi:"+2*3.14*yaricap);
        System.out.println("dairenin alani:"+3.14*yaricap*yaricap);


    }
}
