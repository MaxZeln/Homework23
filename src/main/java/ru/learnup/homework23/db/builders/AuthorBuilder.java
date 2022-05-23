package ru.learnup.homework23.db.builders;

import ru.learnup.homework23.db.model.Author;

public class AuthorBuilder {

    private int id;
    private String name;
    private String surname;
    private String patronymic;


    public AuthorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AuthorBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public AuthorBuilder withPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }



    public Author build() {
        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);
        author.setPatronymic(patronymic);
        return author;
    }
}
