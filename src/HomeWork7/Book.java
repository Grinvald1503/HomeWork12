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
    @Override
    public String toString() {
        return "Название книги " + this.nameBook + ", год выпуска " + this.yearPublication + ", автор книги: " + this.author;
    }

    @Override
    public boolean equals(Object book) {
        if (book == null || this.getClass() !=book.getClass()) {
            return false;
        }
        Book book2 = (Book) book;


        return nameBook.equals(book2.nameBook) && yearPublication == book2.yearPublication && author.equals(book2.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook);
    }
}

