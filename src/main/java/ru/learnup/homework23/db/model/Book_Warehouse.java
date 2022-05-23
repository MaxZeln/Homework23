package ru.learnup.homework23.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Book_Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int books_amount;

    @OneToMany
    private List<Book> books;

    @Override
    public String toString() {
        return "Book_Warehouse{" +
//                "id=" + id +
                ", books_amount=" + books_amount +
                ", books=" + books +
                '}';
    }
}