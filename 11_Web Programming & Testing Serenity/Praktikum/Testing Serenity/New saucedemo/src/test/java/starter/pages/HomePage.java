package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By title() {
        return By.className("title");
    }

    @Step
    public void validateOnHomePage() {
        $(title()).isDisplayed();
    }
}