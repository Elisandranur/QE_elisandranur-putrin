package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ChooseProductPage;
import starter.pages.IsiPulsaPage;

public class ChooseProductSteps {
    @Steps
    ChooseProductPage chooseProductPage;

    @Steps
    IsiPulsaPage isiPulsaPage;

    @Given("I am on Home page click Masuk Button")
    public void wantToLogin(){
        chooseProductPage.openPage();
        chooseProductPage.clickLOGINMasukButton();
    }
    @And("I input email")
    public void inputRightEmail(){
        chooseProductPage.inputTheEmail("enararia@gmail.com");
    }
    @And("I input password")
    public void inputPasswordRight(){
        chooseProductPage.inputThePassword("SepulsaElisandra77.");
    }
    @And("I click Masuk button to login")
    public void clickButtonToLogin(){
        chooseProductPage.clickTheMasukButton();
    }
    @When("I am on the dashboard I click button of Lainnya")
    public void clickLainnyaButton(){
        chooseProductPage.chooseProductLainnya();
    }
    @And("I am click pulsa button icon")
    public void clickPulsaButton(){
        chooseProductPage.choosePulsa();
    }
    @Then("I am on the isi pulsa page")
    public void onTheIsiPulsa(){
        isiPulsaPage.validatePulsaPage();
    }
}
