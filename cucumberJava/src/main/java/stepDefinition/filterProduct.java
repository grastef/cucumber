package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filterProduct {

    @When("user select dropdown filter")
    public void user_select_dropdown_filter() {
        System.out.println("Inside Step - user select dropdown filter");
    }

    @And("click on selected dropdown")
    public void click_on_selected_dropdown() {
        System.out.println("Inside Step - click on selected dropdown");
    }

    @Then("the item ordered by choosen filter")
    public void the_item_ordered_by_choosen_filter() {
        System.out.println("Inside Step - the item ordered by choosen filter");
    }

}
