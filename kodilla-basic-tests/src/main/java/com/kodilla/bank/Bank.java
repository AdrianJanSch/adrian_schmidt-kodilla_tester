package com.kodilla.bank;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class Bank {
    private  CashMachine[] cashMachines;

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
    public void getCashMachine(){
        System.out.println(cashMachines);
    }

   /*public int getTotalWithdrawal(){
        int sum = 0;
        for (CashMachine cashMachine : cashMachines){

        }

    }*/

}


