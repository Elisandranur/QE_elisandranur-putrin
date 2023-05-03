package starter.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By registerLink() {
        return MobileBy.id("textViewLinkRegister");
    }

    private By loginButton() {
        return MobileBy.id("appCompatButtonLogin");
    }

    private By emailField() {
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordField() {
        return MobileBy.id("textInputEditTextPassword");
    }

    private By toastMessage() {
        return MobileBy.id("snackbar_text");
    }

    @Step
    public boolean isOnPage() {
        return waitUntilPresence(loginButton()).isDisplayed();
    }

    @Step
    public void tapRegisterLink() {
        onClick(registerLink());
    }

    @Step
    public void inputEmail(String email) {
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public String getToastMessage() {
        return waitUntilVisible(toastMessage()).getText();
    }
}