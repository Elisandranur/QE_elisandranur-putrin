package starter.posting;

import net.thucydides.core.annotations.Step;

public class Posting {
    @Step("I am on the LinkedIn home page")
    public void onTheHomePage() {
        System.out.println("Saya berada di beranda Linkedin");
    }

    @Step("I click on the photo icon")
    public void clickIconPhoto() {
        System.out.println("Saya mengeklik ikon untuk menugunggah foto");
    }

    @Step("I select the photo from my device")
    public void selectPhotos() {
        System.out.println("Saya sedang memilih foto untuk diunggah");
    }

    @Step("I type This is my newest work experience company in the post text box")
    public void writeCaptionPhoto() {
        System.out.println("Saya sedang mengetik caption untuk foto");
    }
    @Step("I click the Post button")
    public void clickUploadButton() {
        System.out.println("Saya mengeklik tombol untuk mengunggah");
    }
    @Step("the photo with caption should appear on my home page")
    public void postShowUp() {
        System.out.println("Unggahan saya terlihat pada home page");
    }
}