package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Shape;

public class ShapeProcessor {
    Square square = new Square();
    PerimeterOfSquare perimeterOfSquare = new PerimeterOfSquare();

    public void process(Shape shape){
        System.out.println("Result for this calculations " + shape.math() );

    }
}
