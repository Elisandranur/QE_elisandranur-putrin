package starter.profile;

import net.thucydides.core.annotations.Step;

public class Profile {
    @Step("I am on the home page of linkedin")
    public void onTheHomePageLinkedin() {
        System.out.println("I am on the Home page of my linkedin");
    }

    @Step("I want to edit my linkedin profile")
    public void editLinkedinProfile() {
        System.out.println("I want to edit my linkedin profile");
    }

    @Step("I go to left side of home page")
    public void gotoLeftsideHomePage() {
        System.out.println("I am going to the left side of my page");
    }

    @Step("I click on my name profile")
    public void clickOnMyName() {
        System.out.println("I click my name under my photo profile");
    }
    @Step("I am on my profile page")
    public void onMyProfilePage() {
        System.out.println("I am on my profile page, and ready to edit my profile");
    }
}
