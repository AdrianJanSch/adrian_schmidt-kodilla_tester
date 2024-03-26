package com.kodilla.inheritance.homework;

public class FreshSystem extends OperatingSystem {

    public FreshSystem(int data){
        super(data);
    }
    @Override
    public void turnOn(){
        System.out.println("This system is new, so he will start working in 5 second");
    }
    @Override
    public void turnOff(){
        System.out.println("System just shut down");
    }

}
