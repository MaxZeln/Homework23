package ru.learnup.homework23.db.builders;


import ru.learnup.homework23.db.model.Order;
import ru.learnup.homework23.db.model.Order_Details;

import java.util.List;

public class OrderBuilder {

    private long id;
    private int buyer_id;
    private int purchase_amount;
//    private Order_Details order_details;
    private int order_details_id;


    public OrderBuilder withBuyerId(int buyer_id) {
        this.buyer_id = buyer_id;
        return this;
    }

//    public OrderBuilder withId(int id) {
//        this.id = id;
//        return this;
//    }

    public OrderBuilder withPurchaseAmount(int purchase_amount) {
        this.purchase_amount = purchase_amount;
        return this;
    }

    public OrderBuilder withOrderDetailsId(int order_details_id) {
        this.order_details_id = order_details_id;
        return this;
    }

//    public OrderBuilder withOrderDetails(Order_Details order_details) {
//        this.order_details = order_details;
//        return  this;
//    }


//    public Order build() {
//        Order order = new Order();
//        order.setOrder_details_id(order_details_id);
//        order.setPurchase_amount(purchase_amount);
//        order.setBuyer_id(buyer_id);
//        return order;
//    }
}
