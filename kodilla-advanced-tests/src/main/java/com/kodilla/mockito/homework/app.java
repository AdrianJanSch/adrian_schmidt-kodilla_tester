package com.kodilla.mockito.homework;

import java.time.LocalDate;
import java.util.Locale;

public class app {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Order order1 = new Order(199.99, "AS1789",LocalDate.now());
        Order order3 = new Order(199.98, "AS178w",LocalDate.now());

        shop.addOrder(order1);

        shop.addOrder(order3);


//        shop.searchOrder(13.05,14.05);
//        System.out.println(shop.searchOrder(19.05,14.05));
//
//        shop.searchOrderprice(190.00,200.00);
        System.out.println(shop.searchOrderprice(200.00,201.00));

        System.out.println(shop.howManyOrders());
        shop.sumOrdersValue();

    }
}
