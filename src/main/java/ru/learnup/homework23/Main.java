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

//        helper.save(pushkin);

        Book evgeniyOnegin = new BookBuilder()
                .withTitle("Evgeniy onegin")
                .withAuthorId(pushkin.getId())
                .withPublishingYear("2018")
                .withPrice(300)
                .withPages(224)
                .build();

//        helper.save(evgeniyOnegin);

        Book captainsDaughter = new BookBuilder()
                .withTitle("Captain's Daughter")
                .withAuthorId(pushkin.getId())
                .withPublishingYear("2018")
                .withPrice(250)
                .withPages(160)
                .build();

//        helper.save(captainsDaughter);

        Buyer buyer1 = new BuyerBuilder()
                .withName("Dmitriy")
                .withSurname("Ponomarenko")
                .withPatronymic("Evgenevich")
                .withBirthday("12.05.1993")
                .build();

//        helper.save(buyer1);

        Order_Details order_details1 = new OrderDetailsBuilder()
                .withBookId(evgeniyOnegin.getId())
                .withPrice(evgeniyOnegin.getPrice())
                .withAmount(1)
                .build();

        Order_Details order_details2 = new OrderDetailsBuilder()
                .withBookId(captainsDaughter.getId())
                .withPrice(captainsDaughter.getPrice())
                .withAmount(1)
                .build();

//        helper.save(order_details1);
//        helper.save(order_details2);

//        Order order1 = new OrderBuilder()
////                .withId(order_details1.getId())
////                .withOrderDetails(order_details1)
//                .withOrderDetailsId(order_details1.getId())
//                .withBuyerId(buyer1.getId())
//                .withPurchaseAmount(300)
//                .build();

        Order order1 = new Order(buyer1, order_details1);

//        helper.save(order1);

//        helper.getAllBooksFromOrder(order1);

        List<Order> all = helper.getAllBooksFromOrder();
        System.out.println(all);
    }
}
