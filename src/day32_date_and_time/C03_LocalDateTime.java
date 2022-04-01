package day32_date_and_time;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihsaat= LocalDateTime.now();
        System.out.println(tarihsaat.plusYears(3).plusMonths(2).plusWeeks(2));

    }
}
