package ru.learnup.homework23.db.builders;

import ru.learnup.homework23.db.model.Order_Details;

public class OrderDetailsBuilder {

    private int id;
    private int book_id;
    private int amount;
    private int price;

    public OrderDetailsBuilder withBookId(int book_id) {
        this.book_id = book_id;
        return this;
    }

    public OrderDetailsBuilder withPrice(int price) {
        this.price = price;
        return this;
    }

    public OrderDetailsBuilder withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public Order_Details build() {
        Order_Details order_details = new Order_Details();
        order_details.setAmount(amount);
        order_details.setPrice(price);
        order_details.setBook_id(book_id);
        return order_details;
    }

}
