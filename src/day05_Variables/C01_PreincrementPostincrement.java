package day05_Variables;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println("pre-incrementten once" + sayi);

        System.out.println("pre-incrementten sonra "+ ++sayi);
        System.out.println(sayi);

        System.out.println("post-increment satirinda "+ sayi++);

        System.out.println("post increment satirindan sonra"+ sayi);

    }
}
