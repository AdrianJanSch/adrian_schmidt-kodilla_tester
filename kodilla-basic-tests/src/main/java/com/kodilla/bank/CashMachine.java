package com.kodilla.bank;

import java.util.ArrayList;

public class CashMachine {
    private int[] values;
    private int size;
    private int saldo;
    private int transaction;
    private int slado;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];

    }

    public int saldo() {
        saldo = 0;
        return this.saldo;
    }

    public void deposit(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
        this.saldo = this.saldo + value;
    }

    public void withdrawal(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
        this.saldo = this.saldo - value;
    }

    public int[] getValues() {
        return values;

    }
    public int showTransaction(){
        this.transaction = values.length;
        return this.transaction;
    }
    public int getSaldo(){
        return saldo;
    }

}