package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Date;

public class Sedan implements Car {
    private boolean lights;
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }

    @Override
    public void setLights(boolean lights) {
        this.lights = lights;
    }
}
