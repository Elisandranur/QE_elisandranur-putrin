package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.posting.Posting;

public class PostingSteps {
    @Steps
    Posting posting;

    @Given("I am on the LinkedIn home page")
    public void onTheHomePage() {
        posting.onTheHomePage();
    }

    @When("I click on the photo icon")
    public void clickIconPhoto() {
        posting.clickIconPhoto();
    }

    @And("I select the photo from my device")
    public void selectPhotos() {
        posting.selectPhotos();
    }
    @And("I type This is my newest work experience company in the post text box")
    public void writeCaptionPhoto() {
        posting.writeCaptionPhoto();
    }
    @And("I click the Post button")
    public void clickUploadButton() {
        posting.clickUploadButton();
    }

    @Then("the photo with caption should appear on my home page")
    public void postShowUp() {
        posting.postShowUp();
    }
}
