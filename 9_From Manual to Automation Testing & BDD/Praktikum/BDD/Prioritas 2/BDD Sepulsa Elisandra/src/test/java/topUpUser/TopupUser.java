package topUpUser;

import net.thucydides.core.annotations.Step;

public class TopupUser {
    @Step("I am on Sepulsa Home page")
    public void sepulsaA() {
        System.out.println("I am on Sepulsa Home page");
    }

    @Step("I click on Masuk button")
    public void sepulsaB() {
        System.out.println("I click on Masuk button");
    }

    @Step("I fill with valid email and password")
    public void sepulsaC() {
        System.out.println("I input my email and the right password");
    }

    @Step("I click on Masuk button again")
    public void sepulsaD() {
        System.out.println("I click the button to next step");
    }
    @Step("I should be on Sepulsa dashboard")
    public void sepulsaE() {
        System.out.println("I am on the Dashboard of sepulsa");
    }
    @Step("I am click the pulsa or phone icon")
    public void sepulsaF() {
        System.out.println("I choose to click the top up icon ");
    }
    @Step("I am input my Phone number")
    public void sepulsaG() {
        System.out.println("I input my phone number");
    }
    @Step("I am select the nominal of the credit")
    public void sepulsaH() {
        System.out.println("I fill the nominal to top up");
    }
    @Step("I use to select payment method")
    public void sepulsaI() {
        System.out.println("I choose payment methode with debit card");
    }
    @Step("I have complete the payment process")
    public void sepulsaJ() {
        System.out.println("I am chose the payment with my debit bank account number");
    }
    @Step("I should receive a successful top up pop up message")
    public void sepulsaK() {
        System.out.println("I receive a successful top up pop up message");
    }
}