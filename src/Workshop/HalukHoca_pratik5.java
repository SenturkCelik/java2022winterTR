package Workshop;

import java.util.Scanner;

public class HalukHoca_pratik5 {
    public static void main(String[] args) {
        /* TASK :
        *Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
        en kucuk olanlarini konsola yazdiriniz
        int num1
        int num2
        int num3
        */

        Scanner numara=new Scanner(System.in);
        System.out.println("lutfen uc adet numara giriniz");
                int num1=numara.nextInt();
        System.out.println("birinci numarayi girdiniz");
                int num2=numara.nextInt();
        System.out.println("ikinci numarayi girdiniz");
                int num3=numara.nextInt();
        System.out.println("ucuncu numarayi girdiniz");

                if(num1>num2 && num1>num3){
                    System.out.println("en buyuk numara : "+num1);
                }else if (num2>num1 && num2>num3){
                    System.out.println("en buyuk numara : "+num2);

                }else if (num3 > num1 && num3 >num2){
                    System.out.println("en buyuk numara : "+num3);

                }

                if (num1<num2 && num1<num3){
                    System.out.println("en kucuk numara : "+num1);
                }else if (num2<num1 && num2< num3){
                    System.out.println("en kucuk numara : "+num2);
                }else if (num3< num1 && num3<num2){
                    System.out.println("en kucuk numara : "+num3);
                }


    }
}
