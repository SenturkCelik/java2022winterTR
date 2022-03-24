package day05_Variables;

public class C03_Modulus {
    public static void main(String[] args) {

        int a=15 %4;
        System.out.println(a);

String c="Hello";
String b="world";
        System.out.println(c+b);
        System.out.println(c+"        "+b);

        String d="Hello IT World";
        int e=2;
        int f=4;
        System.out.println(d+e+f);
        System.out.println(e+f+d);
        System.out.println(d+(e+f));
        System.out.println(d+e*f);

        boolean sonuc1=(5+2==7)&&(4+3!=5);
        System.out.println((5*2!=15)&&(5<7));
        System.out.println((5*2!=15)&& (5>7));

        boolean sonuc2=(5+2==7)||(4+3!=5);
        System.out.println((5*2==15)|| (5>7));






    }

}
