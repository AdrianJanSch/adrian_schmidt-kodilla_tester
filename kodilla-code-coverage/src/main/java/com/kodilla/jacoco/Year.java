package com.kodilla.jacoco;

public class Year {
   private final int value;

    public Year(int year) {
        this.value = year;
    }

    public boolean isLeap() {
        return value %4 == 0;
    }
}