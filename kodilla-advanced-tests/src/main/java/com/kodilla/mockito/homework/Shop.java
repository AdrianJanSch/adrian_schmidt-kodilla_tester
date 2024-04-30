package com.kodilla.mockito.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> shopList = new HashSet<>();

    public void addOrder(Order order) {
        this.shopList.add(order);
    }

    public Set<Order> searchOrder(LocalDate minDate, LocalDate maxDate) {
       return shopList.stream().filter(order -> order.getData().isAfter(minDate))
                .filter(order ->order.getData().isBefore(maxDate) )
                .collect(Collectors.toSet());
    }

    public Set<Order> getShopList() {
        return shopList;
    }

    public Set<Order> searchOrderprice(double v1, double v2) {
       return shopList.stream().filter(order -> order.getPrice() >= v1)
                .filter(order -> order.getPrice()<=v2)
                .collect(Collectors.toSet());

    }

    public int howManyOrders(){
        return shopList.size();
    }

    public void sumOrdersValue(){
     double sum = 0.0;
     for(Order order : shopList)
         sum += order.getPrice();
        System.out.println(sum);
    }
}

