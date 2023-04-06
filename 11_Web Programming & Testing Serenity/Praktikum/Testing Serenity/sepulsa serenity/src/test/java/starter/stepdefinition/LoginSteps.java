package starter.stepdefinition;

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

    @Given("I am on the home page")
    public void onLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLogin();
    }
    @When("I click masuk button")
    public void clickButtonMasuk(){
        loginPage.clickMasukButton();
    }
    @And("I input valid email")
    public void inputEmailRight(){
        loginPage.inputEmail("enararia@gmail.com");
    }
    @And("I input valid password")
    public void inputRightPassword(){
        loginPage.inputPassword("SepulsaElisandra77.");
    }
    @And("I click masuk button again")
    public void clickLoginButton(){
        loginPage.clickMasukLoginButton();
    }
    @Then("I am on the home page with an account")
    public void onHomePage(){
        homePage.validateOnHomePage();
    }

}
