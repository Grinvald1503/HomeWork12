package HomeWork7;

import java.util.Objects;

public class Author {
    private String name;
    private String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;

    }

    public String getName() {
        return this.name;
    }
    public String getSurName() {
        return this.surName;
    }

    @Override
    public String toString() {
        return "Имя автора " + this.name + ", фамилия автора " + this.surName;
    }
    @Override
    public boolean equals(Object author) {

        if (author == null || this.getClass() !=author.getClass()) {
            return false;
        }
        Author author2 = (Author) author;
        return surName.equals(author2.surName) && name.equals(author2.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(surName);
    }

}


