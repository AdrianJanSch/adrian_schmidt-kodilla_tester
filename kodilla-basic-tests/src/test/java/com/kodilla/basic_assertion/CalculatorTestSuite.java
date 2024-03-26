package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 7;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(3, subtractResult);
    }
    @Test
    public void testExponentiation(){
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 2;
        double exponentiationResult = calculator.exponentiation(a,b);
        assertEquals(25,exponentiationResult,0.1);

    }
   @Test
    public void testExponentiationMinusZero(){
        Calculator calculator = new Calculator();
        double a = -2;
        double b = 2;
        double exponentiationResult = calculator.exponentiation(a,b);
        assertEquals(4,exponentiationResult,0);

    }
  @Test
    public void testExponentiationZero(){
        Calculator calculator = new Calculator();
        double a = 0;
        double b = 2;
        double exponentiationResult = calculator.exponentiation(a,b);
        assertEquals(0,exponentiationResult,0);

    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 3;
        double divisionResult = calculator.divison(a,b);
        assertEquals(3.333, divisionResult,0.001);
    }
}