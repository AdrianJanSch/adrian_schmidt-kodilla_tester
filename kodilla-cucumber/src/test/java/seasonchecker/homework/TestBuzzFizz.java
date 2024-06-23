package seasonchecker.homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static seasonchecker.homework.FizzBuzzChecker.checkFizzBuzz;
public class TestBuzzFizz {
    private int number1;
    private String res;

    @Given("draw number is 9")
    public void test_number_draw_9() {
        number1 = 9;
    }
    @Given("draw number is 8")
    public void test_number_draw_8() {
        number1 = 8;
    }
    @Given("draw number is 10")
    public void test_number_draw_10() {
        number1 = 10;
    }
    @Given("draw number is 15")
    public void test_number_draw_15() {
        number1 = 15;
    }
    @When("divisible number by 3 or 5")
    public void draw_number_is() {
     this.res = checkFizzBuzz(number1);
    }
    @Then("result is {string}")
    public void result_is_Fizz(String string) {
        assertEquals(string, res);
    }


}
