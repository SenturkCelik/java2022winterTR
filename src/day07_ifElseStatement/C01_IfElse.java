package day07_ifElseStatement;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi  giriniz");

        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        } else{
            System.out.println(65-yas+ "emekli olamazsin");


        }




    }







}
