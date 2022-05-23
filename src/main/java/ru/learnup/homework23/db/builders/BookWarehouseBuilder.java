package ru.learnup.homework23.db.builders;

import ru.learnup.homework23.db.model.Book;
import ru.learnup.homework23.db.model.Book_Warehouse;
import ru.learnup.homework23.db.model.Buyer;

import java.util.List;

public class BookWarehouseBuilder {

    private int id;
    private int books_amount;
    private List<Book> books;

    public BookWarehouseBuilder withBookAmount(int books_amount) {
        this.books_amount = books_amount;
        return this;
    }

    public BookWarehouseBuilder withBooks(List<Book> books) {
        this.books = books;
        return this;
    }

    public Book_Warehouse build() {
        Book_Warehouse book_warehouse = new Book_Warehouse();
        book_warehouse.setBooks_amount(books_amount);
        book_warehouse.setBooks(books);
        return book_warehouse;
    }
}
