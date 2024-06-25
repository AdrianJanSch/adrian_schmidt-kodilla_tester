package wallet;

public class Cashier {
    private final CashSlot cashSlot;
    private String message;

    public Cashier(CashSlot cashSlot) {

        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {

        if(amount > wallet.getBalance()){
            this.message = "You don't have enough money in my wallet";
            return;
        }
        cashSlot.dispense(amount);

        wallet.debit(amount);
    }

    public String getMessage(){
        return this.message;
    }

  }