package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;
import java.util.Random;

@Configuration
public class CarConfiguration {

    @Bean
    @Scope("prototype")
    public Car choseCar(LocalDateTime date) {
        Month month = date.getMonth();
        String season = switch (month){
            case DECEMBER, JANUARY,FEBRUARY -> "winter";
            case MARCH, APRIL, MAY -> "spring";
            case JUNE, JULY, AUGUST -> "summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "fall";
        };

        boolean shouldTurnOnLight = date.getHour() < 6 && date.getHour() >= 20;

        Car car = null;
        if (Objects.equals(season, "winter")) {
            car = new SUV();
        }
        if (Objects.equals(season, "fall")) {
            car = new SUV();
        }
        if (Objects.equals(season, "summer")) {
            car = new Cabrio();
        }
        if (Objects.equals(season, "spring")) {
            car = new Sedan();

        } else {
            System.out.println("Please chose correct season");
        }
        car.setLights(shouldTurnOnLight);
        return car;
    }

}
