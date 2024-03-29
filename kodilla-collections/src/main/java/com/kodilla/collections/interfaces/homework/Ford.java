package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    private double engine;
    private String name;
    public Ford(double engine, int speed, String name){
        this.engine = engine;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        int increase = (int) (this.speed * 1.10);
        this.speed = (int) increase;
        System.out.println("After increasing the speed by 10% " + this.name + " drives at " + increase + " km/h" );


    }

    @Override
    public void decreaseSpeed() {
        int decrease = this.speed/ 10;
        int decreaseFinal = this.speed - decrease;
        this.speed = (int) decreaseFinal;
        System.out.println("After reduction the speed by 10% " + this.name + " drives at " + decreaseFinal + " km/h" );
    }
}