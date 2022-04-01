package day32_date_and_time;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);

        int sayi=0;
        for (int i=0;i<100000;i++){
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi); //22:15:14.309795

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem " +(nano2-nano1)+" nano saniyede bitti");

        System.out.println(tm.plusMinutes(1000)); //bin dakika sonra saat kac olacak = 14:59:59.497795



    }
}
