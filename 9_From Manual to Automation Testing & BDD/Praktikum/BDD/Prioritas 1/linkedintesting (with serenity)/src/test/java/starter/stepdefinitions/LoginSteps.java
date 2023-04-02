package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid username")
    public void inputValidUserName() {
        loginPage.inputUserName("enararia@gmail.com");
    }
    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("PasswordAkun11");
    }
    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage() {
        homePage.validateOnHomePage();
    }
}