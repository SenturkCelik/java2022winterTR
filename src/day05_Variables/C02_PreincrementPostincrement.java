package day05_Variables;

public class C02_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2= sayi1++;
        System.out.println(sayi1+","+ sayi2 +","+ sayi3);

        sayi3=++sayi1;
        System.out.println(sayi1+","+ sayi2+","+sayi3);
        System.out.println(--sayi2);



    }
}
