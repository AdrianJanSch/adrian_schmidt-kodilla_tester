package com.kodilla.bank;

import java.util.ArrayList;

public class Bank {
    private final CashMachine[] cashMachines;

    public Bank(int cashMachinesCount) {
        this.cashMachines = new CashMachine[cashMachinesCount];
        for(int i = 0; i < cashMachinesCount; i++){
            this.cashMachines [i] = new CashMachine();
        }
    }
    public int getTotalBalance(){
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getSaldo();
        }
        return sum;
    }

   /*public int getTotalWithdrawal(){
        int sum = 0;
        for (CashMachine cashMachine : cashMachines){

        }

    }*/

}


