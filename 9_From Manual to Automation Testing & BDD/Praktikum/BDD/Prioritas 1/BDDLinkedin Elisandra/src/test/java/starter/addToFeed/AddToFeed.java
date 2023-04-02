package starter.addToFeed;

import net.thucydides.core.annotations.Step;

public class AddToFeed {
    @Step("I am on the Linked In home page")
    public void onTheLinkedinHomePage() {
        System.out.println("I am on the LINKED IN home page");
    }

    @Step("I go to right page")
    public void iGotoRightCornerPage() {
        System.out.println("I going to right corner of my home page");
    }

    @Step("I click follow some account")
    public void clickFollow() {
        System.out.println("I click Follow to some likedin account");
    }

    @Step("Their post will appear in my feed home page")
    public void appearOnMyFeed() {
        System.out.println("Their post appear in my home page");
    }
}