package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUppercase {
    public static void main(String[] args) {


        String str = "Java guzeldir";

        // biz string metotlarini ard arda kullanabiliriz
        // mesela 2.kelimenin ilk harfini kucuk olarak yazdiralim
        //str.charAt(5); boyle yazdigimizda sonuc artik string degil char olacaktir.dolayisiyle
        //stringte yapmak istedigimiz tum degisiklikleri once yapip sonra charAt()methodunu kullaniriz

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));


    }



}
