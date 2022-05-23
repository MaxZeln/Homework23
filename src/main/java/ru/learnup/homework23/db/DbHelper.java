package ru.learnup.homework23.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.learnup.homework23.db.model.*;


import java.util.List;

public class DbHelper {

    private final SessionFactory sessionFactory;

    public DbHelper() {
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml");

        sessionFactory = configuration.buildSessionFactory();
    }

    public List<Book> findBooks() {
        Session session = sessionFactory.openSession();
        List<Book> books = session.createQuery("from Book", Book.class )
                .list();
        session.close();
        return books;
    }

    public List<Order> getAllBooksFromOrder() {
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
        List<Order> orders = session.createQuery("from Order", Order.class)
                .list();
        session.close();
        return orders;

    }

    public void save(Author author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
    }

    public void save(Book book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
    }

    public void save(Buyer buyer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(buyer);
        transaction.commit();
    }

    public void save(Order_Details order_details) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order_details);
        transaction.commit();
    }

    public void save(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
    }

    public void save(Book_Warehouse book_warehouse) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book_warehouse);
        transaction.commit();
    }


}
