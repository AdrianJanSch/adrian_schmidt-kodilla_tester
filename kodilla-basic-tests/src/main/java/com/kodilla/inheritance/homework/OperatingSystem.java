package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int data;
    public OperatingSystem(int data){
        this.data = data;
    }

    public void turnOn(){
        System.out.println("System on");

    }
    public void turnOff(){
        System.out.println("System off");

    }
    public int getOperatingSystem(){
        return data;
    }
}
