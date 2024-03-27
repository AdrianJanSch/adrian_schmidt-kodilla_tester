package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;

    public Shape(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public abstract int math();


}

