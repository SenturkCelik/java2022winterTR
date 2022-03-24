package day04_dataCasting_Increment;

public class J02_AutoWidening {
    public static void main(String[] args) {
        boolean dogruMu=true;
        //String str=dogruMu;

        short sayi1= 44;
        System.out.println(sayi1);

        short sayi2=sayi1;
        System.out.println(sayi2);

        double sayi3=sayi2;

        System.out.println(sayi3);//44.0


    }


}
