package az.et.part01.lesson03.class_code;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamMathApp {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 100);
            if (random % 2 == 0) {
                System.out.print(random + " ");
            }
        }

        System.out.println("\n");

        IntStream
                .range(0, 100)
                .filter(i -> i % 2 == 0)
                .forEach(even -> System.out.print(even + " "));

    }
}
