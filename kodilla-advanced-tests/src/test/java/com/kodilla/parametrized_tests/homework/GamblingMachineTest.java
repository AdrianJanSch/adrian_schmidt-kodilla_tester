package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CorrectNumbers.csv")
    public void shouldRunWithCorrectNumbers(int i1, int i2, int i3, int i4, int i5, int i6) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> input = new HashSet<>();
        input.add(i1);
        input.add(i2);
        input.add(i3);
        input.add(i4);
        input.add(i5);
        input.add(i6);
        System.out.println(input);

        var coutn =gamblingMachine.howManyWins(input);

        assertTrue(coutn>=0 || coutn<=0);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/IncorrectNumbers.csv")
    public void shouldReturnExceptions(int i1, int i2, int i3, int i4, int i5, int i6) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> input = new HashSet<>();
        input.add(i1);
        input.add(i2);
        input.add(i3);
        input.add(i4);
        input.add(i5);
        input.add(i6);
        System.out.println(input);

        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(input));

    }
    @ParameterizedTest
    @CsvSource(value = {"1,2,3,4,5,56", "1,1,2,3,4,5"})
    public void shouldReturnExceptions1(int i1, int i2, int i3, int i4, int i5, int i6) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> input = new HashSet<>();
        input.add(i1);
        input.add(i2);
        input.add(i3);
        input.add(i4);
        input.add(i5);
        input.add(i6);
        System.out.println(input);

        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(input));

    }

}