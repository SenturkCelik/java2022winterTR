package day11_StringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katilip katilmayacaginizi sorun
        // evet derse cevabini ve "derse katilimini alinmistir" yazdirin
        //hayir derse cevabini ve "sonraki derslerimize bekleriz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz? \nEvet veya hayir yaziniz");
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz:"+cevap + " katiliminiz onaylanmistir");

        }else if(cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz:"+ cevap+"sonraki derslerimize bekleriz");
        }
    }
}
