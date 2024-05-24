package com.kodilla.spring.basic.spring_configuration.homework;
import java.sql.Time;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class SUV implements Car{

    private boolean lights;
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public void setLights(boolean lights) {
        this.lights = lights;
    }
}
