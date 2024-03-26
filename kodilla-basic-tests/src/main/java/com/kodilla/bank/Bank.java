package com.kodilla.bank;

import java.util.ArrayList;

public class Bank {
    private int[] atm;
    private int size;
    private int balance;
    private double saldo;

  /*  public Bank() {
        this.size = 0;
        atm = new int[0];

    }

    public void addCashMachine(int id) {
        CashMachine cashMachine = new CashMachine();
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(atm, 0, newTab, 0, atm.length);
        newTab[this.size - 1] = id;

    }

    public int saldo(){
        this. saldo = addCashMachine();
    }

   public int balance() {
        int balance = 0;
        for (int i = 1; i < atm.length; i++) {
            balance = balance + atm
            return balance;

        }
    }*/

    ArrayList<CashMachine> atmList = new ArrayList<CashMachine>();
}
