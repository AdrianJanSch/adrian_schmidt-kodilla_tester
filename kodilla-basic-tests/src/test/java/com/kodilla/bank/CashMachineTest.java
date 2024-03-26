package com.kodilla.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTest {

    @Test
    public void Cashmachine(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(50);
        cashMachine.withdrawal(-50);
        int [] values = cashMachine.getValues();
        cashMachine.getValues();
        assertEquals(2, values);
    }
}
