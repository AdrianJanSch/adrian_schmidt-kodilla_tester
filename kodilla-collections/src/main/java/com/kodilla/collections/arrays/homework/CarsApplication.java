package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;


public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[16];
        for (int i = 1; i < cars.length; i++)
            cars[i] = drawCar();
        for (int i = 0; i < cars.length; i++)
        CarUtils.describeCar(drawCar());



        }

    private static Car drawCar() {
        int drawCarKind = RANDOM.nextInt(15);

        if (drawCarKind == 1)
            return new AlfaRomeo();
        else if (drawCarKind == 2)
            return new Audi();
        else if (drawCarKind == 3)
            return new BMW();
        else if (drawCarKind == 4)
            return new Citroen();
        else if (drawCarKind == 5)
            return new Fiat();
        else if (drawCarKind == 6)
            return new Honda();
        else if (drawCarKind == 7)
            return new Jaguar();
        else if (drawCarKind == 8)
            return new Jeep();
        else if (drawCarKind == 9)
            return new Mazda();
        else if (drawCarKind == 10)
            return new Seat();
        else if (drawCarKind == 11)
            return new Volkswagen();
        else if (drawCarKind == 12)
            return new Ford();
        else if (drawCarKind == 13)
            return new Opel();
        else if (drawCarKind == 14)
            return new Seat();
        else
            return new Mercedes();

    }

}

