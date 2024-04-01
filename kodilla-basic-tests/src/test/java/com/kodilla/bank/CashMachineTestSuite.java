package com.kodilla.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void testCashMachine_GetBalance_AfterCreated(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0,cashMachine.getBalacne());
    }

    @Test
    public void testCashMachine_GetBalance_After3Transactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNewTransaction(100);
        cashMachine.addNewTransaction(200);
        cashMachine.addNewTransaction(300);
        assertEquals(600,cashMachine.getBalacne());
    }

    @Test
    public void testCashMachine_GetCount_After3Transactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNewTransaction(100);
        cashMachine.addNewTransaction(200);
        cashMachine.addNewTransaction(300);
        assertEquals(3, cashMachine.getTransactionsCount());
    }

    @Test
    public void testCashMachine_GetDepositBalance_After3Transactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNewTransaction(100);
        cashMachine.addNewTransaction(200);
        cashMachine.addNewTransaction(-100);
        assertEquals(300, cashMachine.getDepositBalacne());
    }

    @Test
    public void testCashMachine_GetWithdrawalBalance_After3Transactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNewTransaction(100);
        cashMachine.addNewTransaction(200);
        cashMachine.addNewTransaction(-100);
        assertEquals(100, cashMachine.getWithdrawalBalacne());
    }

    @Test
    public void testCashMachine_GetDepositCount_After3Transactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNewTransaction(100);
        cashMachine.addNewTransaction(200);
        cashMachine.addNewTransaction(-100);
        assertEquals(2, cashMachine.getDepositCount());
    }

    @Test
    public void testCashMachine_GetWithdrawalCount_After3Transactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addNewTransaction(100);
        cashMachine.addNewTransaction(200);
        cashMachine.addNewTransaction(-100);
        assertEquals(1, cashMachine.getWithdrawalCount());
    }


}
