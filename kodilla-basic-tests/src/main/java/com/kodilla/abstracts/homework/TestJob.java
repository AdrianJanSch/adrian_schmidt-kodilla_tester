package com.kodilla.abstracts.homework;

public class TestJob {
    public static void main(String[] args) {
        Banker banker = new Banker();
        Accountant accountant = new Accountant();
        Chef chef = new Chef();

        Person person = new Person("Adi", 27,accountant);

        person.showResponsibilities();

    }
}
