package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class ChooseProductPage extends PageObject{
    private By clickMasukButton(){
        return By.xpath("//*[@id=\"button_signin_home\"]");
    }
    private By fillEmailField(){
        return By.id("email");
    }
    private By fillPasswordField(){
        return By.id("password");
    }
    private By masukLogINButton(){
        return By.xpath("//*[@id=\"submit_login\"]");
    }
    private By lainnyaButton(){
        return By.xpath("//*[@id=\"Lainnya\"]");
    }
    private By pulsaButton(){
        return By.xpath("//*[@id=\"product_type_0\"]");
    }

    @Step
    public void openPage(){open();}

    @Step
    public void clickLOGINMasukButton(){
        $(clickMasukButton()).click();
    }
    @Step
    public void inputTheEmail(String email){
        $(fillEmailField()).type(email);
    }
    @Step
    public void inputThePassword(String password){
        $(fillPasswordField()).type(password);
    }
    @Step
    public void clickTheMasukButton(){
        $(masukLogINButton()).click();
    }
    @Step
    public void chooseProductLainnya(){
        $(lainnyaButton()).click();
    }
    @Step
    public void choosePulsa(){
        $(pulsaButton()).click();
    }
}
