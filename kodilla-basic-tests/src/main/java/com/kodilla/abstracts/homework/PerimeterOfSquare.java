package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Shape;

public class PerimeterOfSquare extends Shape {

    public PerimeterOfSquare() {

        super(2);
    }

    @Override
    public int math() {
        int result = super.getA() + super.getA() + super.getA() + super.getA();
        return result;
    }


}
