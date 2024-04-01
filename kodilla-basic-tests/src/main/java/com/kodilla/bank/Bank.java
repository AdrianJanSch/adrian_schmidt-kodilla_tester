package com.kodilla.bank;

import javax.swing.plaf.IconUIResource;
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
        for (CashMachine item : cashMachines) {
            sum += item.getBalacne();
        }
        return sum;
    }
    public int getWithdrwalBalance(){
        int sum = 0;
        for (CashMachine item : cashMachines) {
            sum += item.getWithdrawalBalacne();
        }
        return sum;
    }
    public int getDepositBalance(){
        int sum = 0;
        for (CashMachine item : cashMachines) {
            sum += item.getDepositBalacne();
        }
        return sum;
    }
    public int getTotalWithdrawalCount(){
        int sum = 0;
        for (CashMachine item : cashMachines) {
            sum += item.getWithdrawalCount();
        }
        return sum;
    }

    public int getTotalDepositCount(){
        int sum = 0;
        for (CashMachine item : cashMachines) {
            sum += item.getDepositCount();
        }
        return sum;
    }

    public double avgWithdrawalBalance(){
        return (double)getWithdrwalBalance() / (double)getTotalWithdrawalCount();

    }
    public double avgDepositBalance(){
        return (double)getDepositBalance() / (double)getTotalDepositCount();
    }

    public void addTransactionToCashMachine(int numberCashMachine, int value){
        if(this.cashMachines.length < numberCashMachine){
            System.out.println("Wrong number of CashMachine!");
            return;
        }
        this.cashMachines[numberCashMachine - 1].addNewTransaction(value);

    }
}


