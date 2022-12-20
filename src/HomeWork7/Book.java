package HomeWork7;

import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearPublication;
    private Author author;

    public Book(String nameBook, int yearPublication, Author author) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublication(int year) {

        yearPublication = year;
    }

}

