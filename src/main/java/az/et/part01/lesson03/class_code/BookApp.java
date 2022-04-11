package az.et.part01.lesson03.class_code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Bloch");
        Book book2 = new Book("Java", "Bloch");
        Book book3 = new Book("Java", "Bloch");

        boolean equals1_2 = book1.equals(book2);

        Book[] books = {book1, book2, book3};
        Book book4 = new Book("Java", "Joshua");

        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book4)) {
                System.out.println(true);
            }
        }
        System.out.println(false);

        List<Book> books2 = new ArrayList<>();
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        for (int i = 0; i < books.length; i++) {
            if (books2.get(i).equals(book4)) {
                System.out.println(true);
            }
        }
        System.out.println(false);

        books2.stream()
                .filter(book -> book.equals(book4))
                .forEach(book -> System.out.println(true));

        for (int i = 0; i < books2.size(); i++) {
            System.out.println(books2.get(i));
        }

        for (Book book : books2) {
            System.out.println(book);
        }

        books2.forEach(new Consumer<Book>() {
            @Override
            public void accept(Book book) {
                System.out.println(book);
            }
        });

        books2.forEach(book -> System.out.println(book));

        books2.forEach(System.out::println);

        // Map -> key->value
        // map -> manipulate data

        books2.stream()
                .map(Book::getAuthor)
                .forEach(System.out::println);

    }

    class BookPrinter implements Consumer<Book> {
        @Override
        public void accept(Book book) {
            System.out.println(book);
        }
    }

}
