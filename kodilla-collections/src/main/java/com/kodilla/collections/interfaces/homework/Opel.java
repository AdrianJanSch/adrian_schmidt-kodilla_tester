package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Opel implements Car {
    private int speed;
    private double engine;
    private String name;
    private static final Random RANDOM = new Random();

    public Opel() {
        this.engine = RANDOM.nextDouble(3.0);
        this.speed = RANDOM.nextInt(300);
        this.name = "Ford";
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        int increase = (int) (this.speed * 1.10);
        this.speed = (int) increase;
        System.out.println("After increasing the speed by 10% " + this.name + " drives at " + increase + " km/h");


    }

    @Override
    public void decreaseSpeed() {

    }

    @Override
    public String getName() {
        return this.name;
    }
}