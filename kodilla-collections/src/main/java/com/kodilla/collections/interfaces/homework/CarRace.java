package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car skoda = new Skoda(2.3,190, "Skoda Superb");
        doRace(skoda);
        System.out.println();
        Car opel = new Opel(1.5,145,"Opel Corsa");
        doRace(opel);
        System.out.println();
        Car ford = new Ford(1.9, 178,"Ford Mondeo");
        doRace(ford);
        System.out.println();



    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

}
