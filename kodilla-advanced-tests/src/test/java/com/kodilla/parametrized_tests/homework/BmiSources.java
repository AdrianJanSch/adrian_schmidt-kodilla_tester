package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;
public class BmiSources {

    static Stream<Arguments> provideValueForTesting() {
        return Stream.of(
                Arguments.of(1.76, 49.9, "Underweight"),
                Arguments.of(1.99, 57.8, "Very severely underweight"),
                Arguments.of(1.88, 90.0, "Overweight")

        );
    }

}
