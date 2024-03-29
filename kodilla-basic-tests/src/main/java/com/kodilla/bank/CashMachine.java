package com.kodilla.bank;

public class CashMachine {
    private int[] cashMachine;
    private int size;
    private int saldo;
    private int transaction;
    private int sumWithdrawal;
    private int sumDeposit;

    public CashMachine() {
        this.cashMachine = new int[this.size];
        this.size = 0;
        this.transaction = 0;
        this.saldo = 0;
        this.sumWithdrawal = 0;
        this.sumDeposit = 0;


    }
    public int saldo() {
        return this.saldo;
    }

    public int deposit(int deposit){
        this.cashMachine = new int[this.size];
        this.transaction++;
        this.size++;
        this.sumDeposit++;
        int i =this.transaction;
        for (i = this.transaction; i<this.size; i++ ){
            this.cashMachine [i] = this.size;
        }
        this.saldo += deposit;
        return deposit;
    }

    public void ShowTotalDepositTransaction(){
        System.out.println(sumDeposit);
    }
    //    public int deposit(int value) {
//        this.size++;
//        int[] newTab = new int[this.size];
//        System.arraycopy(values, 0, newTab, 0, values.length);
//        newTab[this.size - 1] = value;
//        this.values = newTab;
//        this.saldo = this.saldo + value;
//        return this.saldo;
//    }

    public int withdrawal(int withdrawal) {
        this.size++;
        this.transaction++;
        this.sumWithdrawal++;
        this.cashMachine = new int[this.size];
        int i = this.transaction    ;
        for (i = this.transaction; i <this.size; i++){
            this.cashMachine [i] = this.size;
        }
        this.saldo -=  withdrawal;
        return withdrawal;
    }

    public void showWithdrawalTotalTransaction(){
        System.out.println(sumWithdrawal);
    }
    public void showCashMachine() {
        System.out.println(this.size);


    }
    public int getTransaction(){
       return transaction;
    }

      public int getSaldo(){
        return saldo;
    }

}