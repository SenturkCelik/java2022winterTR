package Workshop;

import java.util.Scanner;

public class HalukHoca_pratik10 {
    /*
    -kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir.ternary kullanarak harflerin
    -uniqe olup olmadigina bakiniz, e.g   ala ==> 3
    -test data:ali eme all


     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim=scan.nextLine();
        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);
        String sonuc= isim.length()==3 ?((c1!=c2 && c1!=c3 && c2!=c3)?"  girdiginiz isim 3 harfli ve unique karaktere sahip":"girdiginiz isim 3 harfli ama unique dehil"):
                                                                        "girdiginiz isim 3 harfli degil";

        System.out.println(sonuc);

    }






}




