package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Shape;

public class Square extends Shape {
    public Square(){
        super(4);
    }


    @Override
    public int math() {
        int result = super.getA() * super.getA();
        return result;
    }
}
