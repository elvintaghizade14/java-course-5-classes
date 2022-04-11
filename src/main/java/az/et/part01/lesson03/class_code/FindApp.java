package az.et.part01.lesson03.class_code;

import java.util.List;
import java.util.Optional;

public class FindApp {
    public static List<Book> books;

    public static void main(String[] args) {
        Book book1 = new Book("Java1", "Bloch1");
        Book book2 = new Book("Java2", "Bloch2");
        Book book3 = new Book("Java3", "Bloch3");
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Book book = findByTitle("Java");
//        try {
//            System.out.println(book.getAuthor());
//        } catch (Exception e) {
//
//        }
//        if (book != null) {
//
//        }
        Optional<Book> bookByBloch = findByAuthor("Bloch");
        if (bookByBloch.isPresent()) {
            System.out.println(bookByBloch.get().getTitle());
        }
        bookByBloch.ifPresent(b -> System.out.println(b.getTitle()));

        String result = findByAuthor("Bloch")
                .map(b -> b.getTitle())
                .orElse("Book not found");
    }

    private static Book findByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
//        throw new RuntimeException("Book not found");
        return null;
    }

    private static Optional<Book> findByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
