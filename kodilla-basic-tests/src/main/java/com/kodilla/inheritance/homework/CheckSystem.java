package com.kodilla.inheritance.homework;

public class CheckSystem {
    public static void main(String [] args){
        OperatingSystem system = new OperatingSystem(2023);
        OldSystem system1 = new OldSystem(2010);
        system1.turnOn();
        system1.turnOff();
        FreshSystem system2 = new FreshSystem(2024);
        system2.turnOn();
        system2.turnOff();
    }
}
