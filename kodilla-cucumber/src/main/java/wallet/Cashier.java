package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {

        if (amount <= wallet.getBalance()) {
            cashSlot.dispense(amount);
        } else {
            System.out.println("Sorry, amount is over your wallet");
        }
    }
}