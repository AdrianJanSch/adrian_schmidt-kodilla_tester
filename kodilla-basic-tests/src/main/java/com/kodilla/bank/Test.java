package com.kodilla.bank;

public class Test {
    public static void main(String[] args) {


        CashMachine cashMachine = new CashMachine();
        cashMachine.deposit(50);
        cashMachine.deposit(199);
        cashMachine.getTransaction();
        cashMachine.deposit(179);
        System.out.println(cashMachine.saldo());
        cashMachine.withdrawal(100);
        cashMachine.withdrawal(327);
        System.out.println(cashMachine.saldo());
        System.out.println(cashMachine.getTransaction());
        cashMachine.showCashMachine();
        cashMachine.deposit(77);
        System.out.println(cashMachine.getTransaction());
        cashMachine.showCashMachine();
        cashMachine.ShowTotalDepositTransaction();
        cashMachine.showWithdrawalTotalTransaction();
        Bank bank = new Bank(0);

        System.out.println(bank.getTotalBalance());
        bank.getCashMachine();





    }
}
