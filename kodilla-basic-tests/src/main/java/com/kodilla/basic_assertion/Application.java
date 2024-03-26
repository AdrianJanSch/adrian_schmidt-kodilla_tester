package com.kodilla.basic_assertion;

import java.nio.channels.CancelledKeyException;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator1 = new Calculator();
        int a1 = 10;
        int b1 = 7;
        int subtractResult = calculator.subtract(a1, b1);
        correct = ResultChecker.assertEquals(3, subtractResult);
        if (correct){
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a1 + " i " + b1);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a1 + " i " + b1);

        }
        Calculator calculator2 = new Calculator();
        double a2 = 5;
        double b2 = 2;
        double exponentiationResult = calculator.exponentiation(a2, b2);
         correct = ResultChecker.assertEquals1(25,exponentiationResult,a+b);
         if (correct){
             System.out.println("Metoda subtract działa poprawnie dla liczb " + a2 + " i " + b2);
         } else {
             System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a2 + " i " + b2);
         }
    }
}
