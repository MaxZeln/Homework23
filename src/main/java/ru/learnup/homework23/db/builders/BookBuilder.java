package ru.learnup.homework23.db.builders;

import ru.learnup.homework23.db.model.Book;

public class BookBuilder {

    private int id;
    private String title;
    private int author_id;
    private String publishing_year;
    private int pages;
    private int price;

    public BookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withAuthorId(int author_id) {
        this.author_id = author_id;
        return this;
    }

    public BookBuilder withPublishingYear(String publishing_year) {
        this.publishing_year = publishing_year;
        return this;
    }

    public BookBuilder withPages(int pages) {
        this.pages = pages;
        return this;
    }

    public BookBuilder withPrice(int price) {
        this.price = price;
        return this;
    }


    public Book build() {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor_id(author_id);
        book.setPublishing_year(publishing_year);
        book.setPages(pages);
        book.setPrice(price);
        return book;
    }
}
