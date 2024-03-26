package com.kodilla.inheritance.homework;

public class Square extends Shape {
    public Square(){
        super(4);
    }
      @Override
    public int Result(){
        return SurfaceArea();
    }


}
