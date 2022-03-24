package Workshop;

import java.util.Scanner;

public class ElifHoca_pratik1 {
    public static void main(String[] args) {
        /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

        Scanner scan=new Scanner(System.in);
        System.out.print("yasinizi giriniz :");
        int age=scan.nextInt();

        if (age>=18 && age<=120){
            if (age>=70 ){
                System.out.println("yasiniz oy kullanmaya uygundur");
                System.out.println("uc kez oy kullanabilir");

            } else if (age >= 50) {
                System.out.println("yasiniz oy kullanmaya uygundur");
                System.out.println("iki kez oy kullanabilir");

            }else {
                System.out.println("yasiniz oy kullanmaya uygundur");
                System.out.println("bir kez oy kullanabilir");
            }

        }else if (age>0 && age<18){
            System.out.println("yasi oy kullanmaya uygun degildir");
        }else
            System.out.println("hatali giris yaptiniz");
    }

}
