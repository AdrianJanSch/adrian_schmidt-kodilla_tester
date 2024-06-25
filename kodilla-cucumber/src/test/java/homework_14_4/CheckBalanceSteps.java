package homework_14_4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wallet.CashSlot;
import wallet.Cashier;
import wallet.Wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBalanceSteps {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

//    private int actualBalance = 100;


    @Given("there is {int} in my {string}")
    public void there_is_$_in_my_wallet2(Integer int1, String string1) {
        wallet.deposit(int1);

    }
    @When("I check the balance of my {string} {int}")
    public void i_check_the_balance_of_my_wallet(String string1,Integer balance) {
        assertEquals(balance,wallet.getBalance());
    }
    @Then("I should see that the {string} is {int}")
    public void i_should_see_that_the_balance_is_$2(String string1, Integer int1) {
        assertEquals("Actual balance is " + int1,wallet.getActualBalance());
    }
}
