package com.pluralsight.bdd.loyalty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Map;


public class SuperSoothieStpDefinition {

    private DrinkCatalog drinkCtalog = new DrinkCatalog();
    private SuperSmoothieSchema superSmoothieSchema = new SuperSmoothieSchema(drinkCtalog);
    private MorningFreshnessMember michael;

    @Given("the the following drink category")
    public void the_the_following_drink_category(List<Map<String,String>>drinkCateg) {
        drinkCateg.stream().forEach(
                drinkCat -> {
                    String drink = drinkCat.get("Drink");
                    String category = drinkCat.get("Category");
                    Integer points = Integer.parseInt(drinkCat.get("Points"));
                    drinkCtalog.addDrink(drink, category);
                    superSmoothieSchema.setPointCategory(category, points);
                    
                }
        );

    }

    @Given("^(.*) is a Morning Freshness Member$")
    public void michael_is_a_Morning_Freshness_Member(String name) {
        michael = new MorningFreshnessMember(name, superSmoothieSchema);
    }

    @When("^(.*) purchase (\\d+) (.*) drinks")
    public void michael_purchase_Banana_drinks(String name, Integer amount, String drink) {
        michael.orders(amount, drink);

    }

    @Then("He should earn {int} points")
    public void he_should_earn_points(Integer expectedPoint) {
        Assertions.assertThat(michael.getPoints()).isEqualTo(expectedPoint);
    }


}
