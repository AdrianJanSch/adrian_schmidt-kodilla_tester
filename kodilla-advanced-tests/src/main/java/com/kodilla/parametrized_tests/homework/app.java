package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Set;

public class app {
    public static void main(String[] args)  {
       Person person = new Person(1.76, 49.9);
       Person person1 = new Person(1.99, 57.8);
       Person person2 = new Person(1.88, 90.0);
        System.out.println(person.getBMI());
        System.out.println(person1.getBMI());
        System.out.println(person2.getBMI());



    }
}
