package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wrongLogin {
    @When("user enters wrong username and wrong password")
    public void user_enters_wrong_username_and_wrong_password() {
        System.out.println("Inside Step - user enters wrong password and username");
    }

    @Then("user get error message")
    public void user_get_error_message() {
        System.out.println("Inside Step - user get error message");
    }

}
