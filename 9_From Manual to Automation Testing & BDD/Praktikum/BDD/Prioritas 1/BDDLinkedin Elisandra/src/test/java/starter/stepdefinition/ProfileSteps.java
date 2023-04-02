package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;
import starter.profile.Profile;

public class ProfileSteps {
    @Steps
    Profile profile;

    @Given("I am on the home page of linkedin")
    public void onTheHomePageLinkedin() {
        profile.onTheHomePageLinkedin();
    }

    @And("I want to edit my linkedin profile")
    public void editLinkedinProfile() {
        profile.editLinkedinProfile();
    }
    @When("I go to left side of home page")
    public void gotoLeftsideHomePage() {
        profile.gotoLeftsideHomePage();
    }

    @And("I click on my name profile")
    public void clickOnMyName() {
        profile.clickOnMyName();
    }

    @Then("I am on my profile page")
    public void onMyProfilePage() {
        profile.onMyProfilePage();
    }
}
