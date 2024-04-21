package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void getOrder_Positive() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("111"));
        warehouse.addOrder(new Order("112"));
        warehouse.addOrder(new Order("113"));
        Order expectedOrder = null;
        //when
        expectedOrder= warehouse.getOrder("112");
        //then
        assertEquals("112", expectedOrder.getNumber());
    }
    @Test
    void getOrder_WithException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("111"));
        warehouse.addOrder(new Order("112"));
        warehouse.addOrder(new Order("113"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, ()->  warehouse.getOrder("1" ));
    }


}