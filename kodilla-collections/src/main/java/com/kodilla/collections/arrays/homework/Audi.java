package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.Objects;
import java.util.Random;

public class Audi implements Car {
    private int speed;
    private double engine;
    private String name;
    private static final Random RANDOM = new Random();

    public Audi() {
        this.engine = 1.5;// RANDOM.nextDouble(3.0);
        this.speed =10;// RANDOM.nextInt(300);
        this.name = "Audi";
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
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed && Double.compare(engine, audi.engine) == 0 && Objects.equals(name, audi.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, engine, name);
    }
}