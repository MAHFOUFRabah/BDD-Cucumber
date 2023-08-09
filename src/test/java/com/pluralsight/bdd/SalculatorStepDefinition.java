package com.pluralsight.bdd;

import com.pluralsight.bdd.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class SalculatorStepDefinition {
    Calculator calculator;
    Integer result;

    @Given("I have two number")
    public void i_have_two_number() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer a, Integer b) {
        result = calculator.add(a, b);
    }

    @Then("It should get {int}")
    public void ishoul_get(Integer expectedResult) {
        assertThat(result).isEqualTo(expectedResult);
    }

}
