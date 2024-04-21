package com.kodilla.exception.homework;

import java.util.ArrayList;

public class WerehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("271");
        warehouse.addOrder(order1);
        Order order2 = new Order("272");
        warehouse.addOrder(order2);
        Order order3 = new Order("273");
        warehouse.addOrder(order3);
        try {
           Order find = warehouse.getOrder("271");
            System.out.println("Order found");
        }catch (OrderDoesntExistException ex){
            System.out.println("Order not found");
        }
        try {
            Order find = warehouse.getOrder("111");
            System.out.println("Order found");
        }catch (OrderDoesntExistException ex){
            System.out.println("Order not found");
        }
    }
}
