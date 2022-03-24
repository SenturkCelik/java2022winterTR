package day06_concatenation_opreation;

public class Work_ShopConcatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi3=12345678;
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+sayi2+str2);

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        System.out.println(sayi1+sayi2+str1+str2);
        System.out.println(sayi1+sayi2+str2+str1);
        System.out.println(sayi1+(sayi2+str2));

        Integer.valueOf(""+sayi3);
        System.out.println(""+sayi3 );







    }



}
