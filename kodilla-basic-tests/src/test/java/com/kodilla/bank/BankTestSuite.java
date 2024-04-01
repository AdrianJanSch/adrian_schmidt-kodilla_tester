package com.kodilla.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void testBank_getTotalBalance_AfterCreate(){
        Bank bank = new Bank(3);
        assertEquals(0,bank.getTotalBalance());
    }

    @Test
    public void testBank_getTotalBalance_After9Transactions(){
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1,100);
        bank.addTransactionToCashMachine(1,50);
        bank.addTransactionToCashMachine(1,100);
        bank.addTransactionToCashMachine(2,-100);
        bank.addTransactionToCashMachine(2,200);
        bank.addTransactionToCashMachine(2,-10);
        bank.addTransactionToCashMachine(3,100);
        bank.addTransactionToCashMachine(3,100);
        bank.addTransactionToCashMachine(3,100);
        assertEquals(640,bank.getTotalBalance());
    }
    @Test
    public void testBank_getWithdrwalBalance_After9Transactions() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(1, 50);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(2, -100);
        bank.addTransactionToCashMachine(2, 200);
        bank.addTransactionToCashMachine(2, -10);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        assertEquals(110, bank.getWithdrwalBalance());
    }

    @Test
    public void testBank_getDepositBalance_After9Transactions() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(1, 50);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(2, -100);
        bank.addTransactionToCashMachine(2, 200);
        bank.addTransactionToCashMachine(2, -10);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        assertEquals( 750, bank.getDepositBalance());
    }
    @Test
    public void testBank_getWithdrwalCount_After9Transactions() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(1, 50);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(2, -100);
        bank.addTransactionToCashMachine(2, 200);
        bank.addTransactionToCashMachine(2, -10);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        assertEquals(2, bank.getTotalWithdrawalCount());
    }

    @Test
    public void testBank_getDepositCount_After9Transactions() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(1, 50);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(2, -100);
        bank.addTransactionToCashMachine(2, 200);
        bank.addTransactionToCashMachine(2, -10);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        assertEquals( 7, bank.getTotalDepositCount());
    }

    @Test
    public void testBank_avgWithdrawalBalance_After9Transactions() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(1, 50);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(2, -100);
        bank.addTransactionToCashMachine(2, 200);
        bank.addTransactionToCashMachine(2, -10);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        assertEquals( 55, bank.avgWithdrawalBalance(),0.2);
    }
    @Test
    public void testBank_avgDepositBalance_After9Transactions() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(1, 50);
        bank.addTransactionToCashMachine(1, 100);
        bank.addTransactionToCashMachine(2, -100);
        bank.addTransactionToCashMachine(2, 200);
        bank.addTransactionToCashMachine(2, -10);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        bank.addTransactionToCashMachine(3, 100);
        assertEquals(107, bank.avgDepositBalance(), 0.2);
    }

    @Test
    public void testBank_addTransactionToCashMachine_WrongNumberOfCashMachine() {
        Bank bank = new Bank(3);
        bank.addTransactionToCashMachine(4, 100);
        assertEquals(0, bank.getTotalBalance());
    }


}
