package az.et.part01.lesson03.class_code;

import java.util.Arrays;
import java.util.List;

public class SearchApp {
    public static void main(String[] args) {
        // CRUD ->
        // CREATE
        // READ/RETRIEVE
        // UPDATE
        // DELETE
        List<Book> books = Arrays.asList(
                new Book("Java1", "Bloch"),
                new Book("Java2", "Bloch"),
                new Book("Java3", "Bloch")
        );

        // linear search
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals("Java3")) {
                System.out.println(books.get(i));
            }
        }
        // complexity: O(n)=n

    }
}
