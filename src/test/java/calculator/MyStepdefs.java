package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int val1;
    private int val2;
    private int result;


    @Before
    public void before()
    {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        val1 = arg0;
        val2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = this.calculator.add(val1, val2);
        System.out.println(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @When("I ^ two values")
    public void iPowTwoValues() {
        result = this.calculator.pow(val1, val2);
        System.out.println(result);
    }

    @When("I / two values")
    public void iTwoValues() {
        result = this.calculator.div(val1,val2);
        System.out.println(result);
    }
}
