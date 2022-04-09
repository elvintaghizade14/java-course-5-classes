package az.et.part01.lesson02.class_code.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTimeApp {
    public static void main(String[] args) {
        System.out.println(LocalDate.now() + "\n" +
                LocalTime.now() + "\n" +
                LocalDateTime.now() + "\n" +
                ZonedDateTime.now());
        LocalTime time = LocalTime.now();
    }
}
