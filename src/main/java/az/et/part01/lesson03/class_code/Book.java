package az.et.part01.lesson03.class_code;

import com.google.common.base.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s'}", title, author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book that = (Book) o;
        return Objects.equal(this.title, that.title)
                && Objects.equal(this.author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title, author);
    }
}
