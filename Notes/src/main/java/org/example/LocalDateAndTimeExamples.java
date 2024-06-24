package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class LocalDateAndTimeExamples {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2000, 12, 6);

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(6,30,12);
        LocalTime lt3 = LocalTime.parse("16:45:12");

        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt1);
        LocalDateTime ldt3 = LocalDateTime.parse("1994-11-06T23:23:23");

        System.out.println(ld + "\n" + ld1);
        System.out.println(lt1 + "\n" + lt2 + "\n" + lt3);
        System.out.println(ldt + "\n" + ldt2 + "\n" + ldt3);

        // Duration used with time
        // Period used with date
    }
}
