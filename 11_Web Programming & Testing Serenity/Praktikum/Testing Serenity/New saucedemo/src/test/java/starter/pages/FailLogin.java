package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class FailLogin extends PageObject {
    private By usernameField() {
        return By.id("user-name");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton() {
        return By.id("login-button");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginHomePage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public boolean errorMessage(){return $(loginButton()).isDisplayed();}
}
