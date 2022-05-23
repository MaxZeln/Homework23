package ru.learnup.homework23.db.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn
    @OneToOne
    @Fetch(value = FetchMode.SELECT)
    private Order_Details order_details;

    @JoinColumn
    @OneToOne
    @Fetch(value = FetchMode.SELECT)
    private Buyer buyer;

    @Column(nullable = false)
    private int purchase_amount;

    //    @Column(nullable = false)
    //    private int buyer_id;
    //
    //    @Column(nullable = false)
    //    private int order_details_id;

    public Order(Buyer buyer,Order_Details order_details) {
        this.buyer = buyer;
        this.order_details = order_details;
        purchase_amount = order_details.getPrice();
    }

    public Order() {

    }

}
