package day12_stringManipulation;

public class C04_EndWith {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email="mulkiyeayboy@gmail.com";
        String arananMetin="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi girin");

        }else if (email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}
