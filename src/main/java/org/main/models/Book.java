package org.main.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Book {
    private int id;

    @NotEmpty(message = "title should not be empty")
    private String title;
    @NotEmpty(message = "author should not be empty")
    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+", message = "Author should be in this format:")
    private String author;
    @Min(value= 1, message = "year should  be bigger 0")
    private int year;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
