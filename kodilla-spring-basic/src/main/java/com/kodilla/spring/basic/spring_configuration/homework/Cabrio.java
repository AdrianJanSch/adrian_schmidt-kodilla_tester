package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cabrio implements Car{
    private boolean lights;
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;
    }
    @Override
    public String getCarType() {
        return "Cabrio";
    }
    @Override
    public void setLights(boolean lights) {
        this.lights = lights;
    }
}
