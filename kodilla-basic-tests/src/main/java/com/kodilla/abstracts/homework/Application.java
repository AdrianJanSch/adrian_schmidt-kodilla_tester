package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape perimetr = new PerimeterOfSquare();
        ShapeProcessor processor = new ShapeProcessor();
        processor.process(perimetr);

        Shape square = new Square();
        ShapeProcessor processor1 = new ShapeProcessor();
        processor.process(square);

    }
}
