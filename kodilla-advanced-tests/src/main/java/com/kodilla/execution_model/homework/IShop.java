package com.kodilla.execution_model.homework;

import java.util.Date;
import java.util.List;

public interface IShop {

    void addOrder (Order order);
    List<Order> getOrders(Date minDate, Date maxDate);

    List<Order> getOrders(double minValue, double maxValue);

    int countAllOrders();

    double sumAllOrdersValue();

}
