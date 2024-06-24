package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdWalletSteps {
    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $110 in my wallet")
    public void i_have_deposited_$110_in_my_wallet() {
        wallet.deposit(110);
        assertEquals(110, wallet.getBalance());
    }

    @When("I request $110")
    public void i_request_$110() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 110);

    }
    @Then("$110 should be dispensed")
    public void $110_should_be_dispensed() {
        assertEquals(110, cashSlot.getContents());
    }
}
