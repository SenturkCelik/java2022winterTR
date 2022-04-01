package day30_passByValue;

public class C03_passByValue {

    public static void main(String[] args) {

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main metotta etiket fiyati :" +etiketFiyati);

    }

    private static void yuzdeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;

        System.out.println("%10 indirimli fiyatimiz :" + etiketFiyati);



        }



    }


