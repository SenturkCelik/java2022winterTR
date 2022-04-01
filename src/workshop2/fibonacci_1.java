package workshop2;

import java.util.Scanner;

public class fibonacci_1 {
    public static void main(String[] args) {

        //fibonacci serisi :0,1,1,2,3,5,8,13,21...
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int input=scan.nextInt();

        int s1=0;
        int s2=1;
        int toplam=0;
        System.out.println(input + "Sayisinin fibonacci serisi :");
        for (int i=1; i<=input; i++){
            System.out.print(s1+ ", ");
            toplam=s1+s2;
            s1=s2;
            s2=toplam;


        }






    }
}
