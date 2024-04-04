package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.*;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.*;
import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi());
        cars.add(new AlfaRomeo());
        cars.add(new Citroen());
        cars.add(new Mazda());
        cars.add(new Skoda());
        cars.add(new Mercedes());
        Audi audi = new Audi();

        for (Car car : cars) {
            CarUtils.describeCar(car);

        }
        cars.remove(3);
        cars.remove(audi);

        for (Car car1 : cars) {
            CarUtils.describeCar(car1);

           }
        System.out.println(cars.size());
    }
}
