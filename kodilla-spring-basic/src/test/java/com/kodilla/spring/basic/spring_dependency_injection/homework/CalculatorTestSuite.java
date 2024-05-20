package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Display bean = context.getBean(Display.class);
        double value = 0.0;
        Double display = bean.display(value);
        Assertions.assertEquals(0.0,display,0.0);
    }

    @Test
    public void shouldReturnCorrectResultAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double add = bean.add(10.0, 10.0);
        Assertions.assertEquals(20.0,add);
    }

    @Test
    public void shouldReturnCorrectResultSubtract(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double subtract = bean.subtract(10.0, 10.0);
        Assertions.assertEquals(0.0,subtract);
    }

    @Test
    public void shouldReturnCorrectResultMultiply(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double multiply = bean.multiply(10.0, 10.0);
        Assertions.assertEquals(100.0,multiply);
    }
    @Test
    public void shouldReturnCorrectResultDivide(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double divide = bean.divide(10.0, 10.0);
        Assertions.assertEquals(1.0,divide);
    }

}
