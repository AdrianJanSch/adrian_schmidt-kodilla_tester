package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private List<Order> orders;

    public Warehouse() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
         List <Order> list = orders
                .stream()
                .filter(ord -> ord.getNumber().equals(number))
                .collect(Collectors.toList());

         if(list.size() > 0){
             return list.get(0);
         }
         throw new OrderDoesntExistException();
    }
}
