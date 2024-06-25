package homework_14_4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wallet.CashSlot;
import wallet.Cashier;
import wallet.Wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceSteps {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    @Given("there is $90 in my wallet")
    public void there_is_$_in_my_wallet() {
       wallet.deposit(90);
      assertEquals(90,wallet.getBalance());

    }
    @When("I withdraw $200")
    public void i_withdraw_$() {
        cashier.withdraw(wallet, 200);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        assertEquals("You don't have enough money in my wallet",cashier.getMessage());
    }
}
