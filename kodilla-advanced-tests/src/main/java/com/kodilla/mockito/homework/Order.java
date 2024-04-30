package com.kodilla.mockito.homework;

import java.time.LocalDate;

public class Order {

    private double price;
    private String login;
    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public Order(double price, String login, LocalDate data) {
        this.price = price;
        this.login = login;
        this.data = data;
    }

    public double getPrice() {
        return price;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return
                "Order data: " +
                "price is " + price + " PLN"+
                ", login is " + login  +
                ", data is " + data
                ;
    }
}


