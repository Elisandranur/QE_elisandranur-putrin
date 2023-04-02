package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.addToFeed.AddToFeed;

public class AddToFeedSteps {
    @Steps
    AddToFeed addToFeed;

    @Given("I am on the Linked In home page")
    public void onTheLinkedinHomePage() {
        addToFeed.onTheLinkedinHomePage();
    }

    @When("I go to right page")
    public void iGotoRightCornerPage() {
        addToFeed.iGotoRightCornerPage();
    }

    @And("I click follow some account")
    public void clickFollow() {
        addToFeed.clickFollow();
    }

    @Then("Their post will appear in my feed home page")
    public void appearOnMyFeed() {
        addToFeed.appearOnMyFeed();
    }
}