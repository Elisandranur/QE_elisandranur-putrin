package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import topUpUser.TopupUser;

public class TopupUserSteps {
    @Steps
    TopupUser topupUser;

    @Given("I am on Sepulsa Home page")
    public void i_am_on_sepulsa_home_page() {
        topupUser.sepulsaA();
    }

    @When("I click on Masuk button")
    public void i_click_on_masuk_button(){
        topupUser.sepulsaB();
    }

    @And("I fill with valid email and password")
    public void i_fill_with_valid_email_and_password() {
        topupUser.sepulsaC();
    }
    @And("I click on Masuk button again")
    public void i_click_on_masuk_button_again()

    {
        topupUser.sepulsaD();
    }

    @Then("I should be on Sepulsa dashboard")
    public void i_should_be_on_sepulsa_dashboard()
    {
        topupUser.sepulsaE();
    }
    @When("I am click the pulsa or phone icon")
    public void i_am_click_the_pulsa_or_phone_icon()
     {
        topupUser.sepulsaF();
    }

    @And("I am input my Phone number")
    public void i_am_input_my_phone_number()
    {
        topupUser.sepulsaG();
    }
    @And("I am select the nominal of the credit")
    public void i_am_select_the_nominal_of_the_credit()
    {
        topupUser.sepulsaH();
    }
    @And("I use to select payment method")
    public void i_use_to_select_payment_method(){
        topupUser.sepulsaI();
    }
    @And("I have complete the payment process")
    public void i_have_complete_the_payment_process() {
        topupUser.sepulsaJ();
    }
    @Then("I should receive a successful top up pop up message")
    public void i_should_receive_a_successful_top_up_pop_up_message(){
        topupUser.sepulsaK();
    }
}