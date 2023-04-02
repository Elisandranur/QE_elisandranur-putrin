package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on the login page")
    public void onTheLoginPage() {
        System.out.println("I am on the login page");
    }

    @Step("I enter my username and password correctly")
    public void enterUserAndPassword() {
        System.out.println("I enter my username and password correctly");
    }

    @Step("I click login button")
    public void clickLoginButton() {
        System.out.println("I click login button");
    }

    @Step("I am on the main page")
    public void onTheMainPage() {
        System.out.println("I am on the main page");
    }
}