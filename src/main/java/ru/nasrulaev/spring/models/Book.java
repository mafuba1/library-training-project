package ru.nasrulaev.spring.models;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Book {
    private int id;

    @NotBlank(message = "This field must be filled")
    @Pattern(regexp = "^[A-ZА-Яа-я][a-zа-я]+(?: [A-ZА-Я][a-zа-я]*){0,2}$")
    private String authorName;

    @NotBlank(message = "This field must be filled")
    private String bookName;

    @NotNull(message = "This field must be filled")
    private int publicationYear;

    public Book() {
    }

    public Book(int id, String authorName, String bookName, int publicationYear) {
        this.id = id;
        this.authorName = authorName;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
