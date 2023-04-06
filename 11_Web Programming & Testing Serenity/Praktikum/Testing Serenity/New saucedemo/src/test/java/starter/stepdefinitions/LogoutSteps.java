package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.Logout;

public class LogoutSteps {
    @Steps
    Logout logout;
    @Steps
    HomePage homePage;

    @Given("I on the login page")
    public void onTheLoginHall(){
        logout.openPage();
        logout.validateOnTheLoginPage();
    }
    @And("I input username")
    public void inputTheUsernameRight(){
        logout.inputUserName("standard_user");
    }
    @And("I input password")
    public void inputPasswordRight(){
        logout.inputPassword("secret_sauce");
    }
    @And("I click the login button")
    public void clickButtonLogin(){
        logout.clickLoginButton();
    }
    @When("I on the home page")
    public void inTheHomePage(){
        homePage.validateOnHomePage();
    }
    @And("I click stripes button")
    public void clickStripesButton(){
        logout.clickStripButton();
    }
    @And("I click logout word")
    public void clickLogoutWord(){
        logout.clickLogoutButton();
    }
    @Then("I back to login page")
    public void backToLogin(){
        logout.errorMessage();
    }
}
