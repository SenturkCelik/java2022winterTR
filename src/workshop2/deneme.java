package workshop2;

import java.time.LocalDate;
import java.time.ZoneId;

public class deneme {
    public static void main(String[] args) {

        LocalDate trh= LocalDate.now(); // objenin olusturuldugu tarihi atar..
        LocalDate baskatrh=LocalDate.of(1975,01,21);

        System.out.println(trh);
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getDayOfYear());
        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.plusMonths(9).plusDays(10).plusWeeks(22));
        System.out.println(LocalDate.now().isLeapYear()); //false
        System.out.println(LocalDate.now(ZoneId.of("Japan")));
        System.out.println(trh.isAfter(baskatrh)); // true




    }
}
