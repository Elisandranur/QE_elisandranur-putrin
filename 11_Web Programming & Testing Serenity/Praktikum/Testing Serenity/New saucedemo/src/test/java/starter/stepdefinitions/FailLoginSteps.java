package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.FailLogin;
import starter.pages.HomePage;

public class FailLoginSteps {

    @Steps
    FailLogin failLogin;


    @Given("I am on the login home page")
    public void onLoginHomePage() {
        failLogin.openPage();
        failLogin.validateOnLoginHomePage();
    }
    @When("input valid username")
    public void inputInValidUserName() {
        failLogin.inputUserName("locked_out_user");
    }
    @And("input valid password")
    public void inputValidPassword() {
        failLogin.inputPassword("secret_sauce");
    }
    @And("click the login button")
    public void clickLoginButton() {
        failLogin.clickLoginButton();
    }
    @Then("an error message is displayed")
    public void backTheLoginHomePage() {
        failLogin.errorMessage();
    }

}
