package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTestSuite {


    @Test
    public void ShouldReturnCarTypeSedan(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarConfiguration carConfiguration = context.getBean(CarConfiguration.class);
        LocalDateTime localDateTime = LocalDateTime.now();
        Car car = carConfiguration.choseCar(localDateTime);
        var car1 = car.getCarType();
        Assertions.assertEquals("Sedan",car1);
    }

    @Test
    public void ShouldntReturnLightTurnOn(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        CarConfiguration carConfiguration = context.getBean(CarConfiguration.class);
        LocalDateTime localDateTime = LocalDateTime.now();
        Car car = carConfiguration.choseCar(localDateTime);
        var car1 = car.hasHeadlightsTurnedOn();
        Assertions.assertEquals(false,car1);
    }
}