package ru.learnup.homework23.db.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table
@Getter
@Setter
public class Order_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
}
