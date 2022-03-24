package Workshop;

import java.util.Locale;
import java.util.Scanner;

public class elifHoca_pratik7 {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli kelime giriniz");

        String kelime=scan.next();

        if (kelime.length()==4){

            kelime=kelime.substring(3).toUpperCase(Locale.ROOT)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

            System.out.println(kelime);
        }else {
            System.out.println("hatali giris");}




    }
}
