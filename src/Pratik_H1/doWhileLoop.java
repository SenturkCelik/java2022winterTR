package Pratik_H1;

public class doWhileLoop {

    public static void main(String[] args) {

        int input=765551;
        int rakam=0;
        int rakamlartoplami=0;

        while(input>0){

            rakam=input%10;
            rakamlartoplami+=rakam;
            input/=10;


        }

        System.out.print(rakamlartoplami);


    }
}
