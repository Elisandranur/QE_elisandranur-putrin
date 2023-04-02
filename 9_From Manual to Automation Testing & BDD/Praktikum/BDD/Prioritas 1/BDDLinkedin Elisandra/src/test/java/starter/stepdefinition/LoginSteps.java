package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        login.onTheLoginPage();
    }

    @When("I am enter my username and password correctly")
    public void enterUserAndPassword() {
        login.enterUserAndPassword();
    }

    @And("I click login button")
    public void clickLoginButton() {
        login.clickLoginButton();
    }

    @Then("I am on the main page")
    public void onTheMainPage() {
        login.onTheMainPage();
    }
}