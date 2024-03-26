package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem  {
    public OldSystem(int data){
        super(data);
    }
    @Override
    public void turnOn(){
        System.out.println("Old system going to slowly start");
    }
    @Override
    public void turnOff(){
        System.out.println("System should do actualization before turn off");
    }
}
