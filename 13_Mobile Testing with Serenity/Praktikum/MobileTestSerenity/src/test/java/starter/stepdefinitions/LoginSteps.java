package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.LoginScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;

    @Given("user on login page")
    public void androidUserOnLandingScreen() {
        boolean actual = loginScreen.isOnPage();
        Assert.assertTrue(actual);
    }

    @When("user input valid username")
    public void androidUserInputUnregisteredEmail() {
        String email = "elisandra" + "@gmail.com";
        loginScreen.inputEmail(email);
    }

    @And("user input invalid password")
    public void androidUserInputPassword() {
        loginScreen.inputPassword("password");
    }

    @And("user click login button")
    public void androidUserTapLoginButton() {
        loginScreen.tapLoginButton();
    }

    @Then("user see error message Wrong Email or Password")
    public void androidUserSeeMessage() {
        String expectedErrorMessage = "Wrong Email or Password";
        String actualErrorMessage = loginScreen.getToastMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}