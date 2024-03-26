package com.kodilla.inheritance.homework;

public abstract class Shape {
    private int a;

    public Shape(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int SurfaceArea() {
        int result = a * a;
        return result;
    }
    public int Perimeter(){
        int result = a + a + a +a;
        return result;
    }

    public abstract int Result ();

}

