package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }
//    @ParameterizedTest
//    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
//    public void shouldCalculateStringLengthWithoutSpaces1(String input, int expected) {
//        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
//    }
}

