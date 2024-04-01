package com.kodilla.bank;

public class CashMachine {
    private int[] transactions;


    public CashMachine() {
        this.transactions = new int[0];

    }

    public int getBalacne() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getDepositBalacne() {
        int sum = 0;
//        for (int i = 0; i < this.transactions.length; i++) {         <------//Przykład, dla rozwiązania niżej
//            int item = this.transactions[i];
//            if (item > 0)
//                sum += item;
//        }
        for (int item : this.transactions){
            if(item > 0)
                sum += item;
        }
        return sum;
    }

    public int getWithdrawalBalacne() {
        int sum = 0;
//        for (int i = 0; i < this.transactions.length; i++) {
//            if (this.transactions[i] < 0)
//                sum += this.transactions[i];
//        }
        for(int item : this.transactions)
            if (item < 0)
                sum+= item;
        return sum * (-1);
    }

    public int getTransactionsCount() {
        return this.transactions.length;
    }
    public int getWithdrawalCount() {
        int count = 0;
        for (int item : this.transactions){
            if(item < 0)
                count += 1;
        }
        return count;
    }
    public int getDepositCount() {
        int count = 0;
        for (int item : this.transactions){
            if(item > 0)
                count += 1;
        }
        return count;
    }
    public void addNewTransaction(int value){
        int [] newTab = new int[transactions.length + 1];
        System.arraycopy(this.transactions, 0, newTab, 0, this.transactions.length);
        newTab [newTab.length - 1] = value;
        this.transactions = newTab;
    }



}