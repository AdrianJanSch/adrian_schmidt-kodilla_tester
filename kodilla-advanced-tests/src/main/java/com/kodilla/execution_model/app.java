package com.kodilla.execution_model;

public class app {
    public static void main(String[] args) {


        Item item = new Item("STS", 199.99);
        Invoice invoice = new Invoice();

        invoice.addItem(item);

        invoice.getSize();

        System.out.println(invoice.getSize());
    }
}

