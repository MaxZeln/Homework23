package ru.learnup.homework23;

import lombok.extern.slf4j.Slf4j;
import ru.learnup.homework23.db.DbHelper;
import ru.learnup.homework23.db.builders.*;
import ru.learnup.homework23.db.model.*;

import java.util.List;


@Slf4j
public class Main {
    public static void main(String[] args) {

        DbHelper helper = new DbHelper();


        Author pushkin = new AuthorBuilder()
                .withName("Alexandr")
                .withSurname("Pushkin")
                .withPatronymic("Sergeevich")
                .build();

        helper.save(pushkin);

        Book evgeniyOnegin = new BookBuilder()
                .withTitle("Evgeniy onegin")
                .withAuthor(pushkin)
                .withPublishingYear("2018")
                .withPrice(300)
                .withPages(224)
                .build();

        helper.save(evgeniyOnegin);

        Book captainsDaughter = new BookBuilder()
                .withTitle("Captain's Daughter")
                .withAuthor(pushkin)
                .withPublishingYear("2018")
                .withPrice(250)
                .withPages(160)
                .build();


        helper.save(captainsDaughter);

        Buyer buyer1 = new BuyerBuilder()
                .withName("Dmitriy")
                .withSurname("Ponomarenko")
                .withPatronymic("Evgenevich")
                .withBirthday("12.05.1993")
                .build();


        Order order1 = new OrderBuilder()
//                .withOrderDetails(order_details1)
                .withBuyer(buyer1)
                .withPurchaseAmount(300)
                .build();

        Order_Details order_details1 = new OrderDetailsBuilder()
                .withOrder(order1)
                .withBookId(evgeniyOnegin)
                .withPrice(evgeniyOnegin.getPrice())
                .withAmount(1)
                .build();

        Order_Details order_details2 = new OrderDetailsBuilder()
                .withOrder(order1)
                .withBookId(captainsDaughter)
                .withPrice(captainsDaughter.getPrice())
                .withAmount(1)
                .build();

        order1.setOrder_details(List.of(
                order_details1));



        helper.save(buyer1);

        helper.save(order1);

        helper.save(order_details1);
        helper.save(order_details2);



//        Order order1 = new Order(buyer1, order_details1);
//        helper.getAllBooksFromOrder(order1);

//        List<Order> all = helper.getAllBooksFromOrder();
//        List<Book> all = helper.findBooks();
//        System.out.println(all);
    }
}
