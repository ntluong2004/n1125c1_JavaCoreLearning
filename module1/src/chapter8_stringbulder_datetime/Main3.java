package chapter8_stringbulder_datetime;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main3 {
    static void main() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Day: " + localDate.getDayOfMonth());
        System.out.println("Month: " + localDate.getMonth().getValue());
        System.out.println("Year: " + localDate.getYear());
        System.out.println(localDate);

        System.out.println("Previous day is: " + localDate.plusDays(-1));
        System.out.println("Next day is: " + localDate.plusDays(1));
    }
}
