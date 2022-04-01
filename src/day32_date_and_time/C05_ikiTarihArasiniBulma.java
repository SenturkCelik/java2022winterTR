package day32_date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(2005,06,25);
        System.out.println(Period.between(dogumGunu,bugun));

        // FIXME: 2022-03-31
    }
}
