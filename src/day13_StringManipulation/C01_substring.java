package day13_StringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.replace("Java","Mehmet hoca "));
        System.out.println("Mehmet hoca "+ str.substring(5));

        System.out.println(str.substring(9));
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(5,6));

        str="Java";




    }
}
