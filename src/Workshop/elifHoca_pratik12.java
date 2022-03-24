package Workshop;

public class elifHoca_pratik12 {

    /*
    Bir string icindeki tum karakterleri en fazla bir kez yazdiran parametreli bir methot yaziniz.
    test data:
    input "aaabbbccccddddaaa"  output:abcd
     */

    public static void main(String[] args) {
        
        String harfler = "aaabbbccccddddaaa";
        birKereYazdir(harfler);

    }

    private static void birKereYazdir(String str) {
        String sonuc="";
        for (int i=0;i<=str.length()-1;i++){  //int i=0;i<str.length();i++  bu sekilde de oluyor
            if(!sonuc.contains(str.substring(i,i+1))){
                sonuc += str.substring(i,i+1);
            }}
        System.out.println(sonuc);
    }
}
