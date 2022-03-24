package Workshop;

public class ElifHoca_pratik6 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.


    public static void main(String[] args) {

        String cumle= "Java ogrenmek123 Cok guzel@ ";
        cumle=cumle.replace("123", "");
        cumle=cumle.replace("@", "");
        cumle=cumle.replace("C","c");

        System.out.println(cumle);


    }










}
