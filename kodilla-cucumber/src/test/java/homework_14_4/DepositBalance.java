package homework_14_4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wallet.CashSlot;
import wallet.Cashier;
import wallet.Wallet;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepositBalance {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    @Given("there is 100 in my wallet")
    public void there_is_$_in_my_wallet1() {
        wallet.deposit(100);
    }
    @When("I deposit 90")
    public void i_deposit() {
        wallet.deposit(90);
    }
    @Then("Should the balance is 190")
    public void should_the_balance_is1() {
        assertEquals(190,wallet.getBalance());
    }
    @Then("I should see that the balance is 190")
    public void should_the_balance_is2() {
        assertEquals("Actual balance is " + 190, wallet.getActualBalance());
    }

}
