package java8_feature2;

import java.time.LocalDate;
import java.util.function.BiConsumer;

public class question_6_part1 {

    public static void main(String[] args) {
        BiConsumer<LocalDate, LocalDate> compareDate = (date1, date2) -> {
            if (date1.isAfter(date2)) {
                System.out.println(date2 + " is before " + date1);
            } else {
                System.out.println(date1 + " is before " + date2);
            }
        };
        LocalDate d1=LocalDate.parse("2005-04-11");
        LocalDate d2=LocalDate.parse("2025-11-09");
compareDate.accept(d1,d2);

    }
}