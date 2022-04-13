package az.et.part01.lesson04.class_code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BookApp {
    public static void main(String[] args) {
        Book a = new Book("a", "A");
        Book b = new Book("b", "B");
        Book c = new Book("c", "C");
        Book d = new Book("d", "D");

        Book[] books = {a, b, c, d};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        for (Book book : books) {
            System.out.println(book);
        }
        Arrays.stream(books).forEach(System.out::println);

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
//            String title = in.next();
        }

        Arrays.stream(books)
                .filter(isEqualTo("a"))
                .forEach(System.out::println);

    }

    public static Predicate<Book> isEqualTo(String title) {
        return new Predicate<Book>() {
            @Override
            public boolean test(Book p) {
                return title.equalsIgnoreCase("a");
            }
        };
    }

}
