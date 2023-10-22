package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addItem {

    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("Inside Step - user is on home page");
    }

    @When("user select item")
    public void user_select_item() {
        System.out.println("Inside Step - user select item");
    }

    @And("click on Add to cart button")
    public void click_on_Add_to_cart_button() {
        System.out.println("Inside Step - click on Add to cart button");
    }

    @Then("the item added to the cart")
    public void the_item_added_to_the_cart() {
        System.out.println("Inside Step - the item added to cart");
    }
}
