package day03_Variables;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class C06_Scanner {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi: "+ ilkHarf);

    }
}
