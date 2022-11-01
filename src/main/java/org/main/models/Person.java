package org.main.models;

import javax.validation.constraints.*;

public class Person {

    private int id;
    @NotEmpty(message = "name should not be empty")
    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+ [А-Я][а-я]+", message = "Your name should be in this format: Familiya, Ima, Othectvo")
    private String name;
    @Min(value = 1900, message = "data of birthday should  be bigger or equals")
    private int dob;

    public Person() {

    }

    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
