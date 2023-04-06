package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class LoginPage extends PageObject{
    private By masukButton(){
        return By.xpath("//*[@id=\"button_signin_home\"]");
    }
    private By emailField(){
        return By.id("email");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By masukLogButton(){
        return By.xpath("//*[@id=\"submit_login\"]");
    }

    @Step
    public void openPage(){open();}

    @Step
    public boolean validateOnLogin(){
        return $(masukButton()).isDisplayed();
    }
    @Step
    public void clickMasukButton(){
        $(masukButton()).click();
    }
    @Step
    public void inputEmail(String email){
         $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickMasukLoginButton(){
        $(masukLogButton()).click();
    }
}
