package workshop2;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;//87.9
        System.out.println(sayi3);

        int sayi4=(int)(sayi1/sayi2);
        System.out.println(sayi4);
                                //deger double ,variable int
                                //yani variable daha dar so java bunu otomatik olarak yapmaz
        // sorumlulugu ustlenmemizi ister
        //sag tarafa yazdigimiz (int) sorumluluk bende demek

        int sayi5=140;
        byte sayi6=(byte)sayi5;
        System.out.println(sayi6);

        sayi5=129;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);

        sayi5=44;
        sayi6=(byte)sayi5;
        System.out.println(sayi6);





    }
}
