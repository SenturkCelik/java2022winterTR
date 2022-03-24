package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        //bu cumledeki bosluk disindaki karakter sayisini bulunuz

        System.out.println("space haric karakter sayisi:"+ str.replace("","").length());
        System.out.println("orjinal str karakter sayisi:"+str.length());

        str=str.replace("Bugun","Yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalici degisiklikten sonra:"+str);







    }
}
