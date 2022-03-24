package Workshop;


import java.util.Scanner;

public class ElifHoca_pratik5 {



        //iki ayri deger girin iz ve bu iki kelimeyi method kull.birlestir
        //yukaridaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz

        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.print("string1 :");
            String str1=scan.nextLine();
            System.out.print("String2 :");
            String str2=scan.nextLine();


            System.out.println("Stringlerin 1.metot ile birlesimi:" +str1+ " " +str2);
            System.out.println("Stringlerin2.metot ile birlesimi:" +str1.concat(" " +str2));

            String str1ilkharfsiz=str1.substring(1);

            String str2ilkharfsiz=str2.substring(1);

            System.out.println("Stringlerin ilkharfsiz halleri: "+str1ilkharfsiz+" "+str2ilkharfsiz);

}
}
