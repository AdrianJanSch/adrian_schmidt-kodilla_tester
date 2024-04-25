package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Struct;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"02_ww", "WW_20", "Ww_20", "adi", "jacek_29"})
    public void shouldUseSpecialUsername(String input) {
        assertTrue(userValidator.validateUsername(input));

    }

    @ParameterizedTest
    @ValueSource(strings = {"02_ww%", "WW_20:", "adi#", "ja"})
    public void useWrongUsername(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest(name ="when userName is {0} than return {1}")
    @CsvSource(value = {"02_ww, true", "adi@, false"})
    public void xxx(String input,boolean expectedResult){
        var result = userValidator.validateUsername(input);
        assertEquals(expectedResult,result);

    }

    @ParameterizedTest
    @CsvSource(value = {"www@www.pl, true","AwAw@www:pl, false","null, false"})
    public void useCorrectAndWrongEmail(String input, boolean expectedResult){
        var result = userValidator.validateEmail(input);
        assertEquals(expectedResult,result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringEmpty(String text){
        assertFalse(userValidator.validateEmail(text));
    }


}