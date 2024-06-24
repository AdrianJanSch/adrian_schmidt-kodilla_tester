package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondWalletSteps {
    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $100 in my wallet")
    public void i_have_deposited_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance());
    }

    @When("I request $101")
    public void i_request_$101() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 101);

    }
     @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }
}
