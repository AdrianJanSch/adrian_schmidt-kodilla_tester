package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BmiSources#provideValueForTesting")
    public void checkBmiIsRun(double height, double weight, String expected){
        //given
        Person person = new Person(height,weight);
        //when

        var result = person.getBMI();
        //then
        assertEquals(expected,result);

    }

}