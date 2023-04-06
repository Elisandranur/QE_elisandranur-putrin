package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class IsiPulsaPage extends PageObject{
    private By body() {
        return By.xpath("/html/body");
    }
    private By fillNumber(){return By.id("phone_number");}
    private By nominalChoose(){
        return By.xpath("//*[@id=\"Axiata XL Rp5.000\"]");
    }
    private By pembayaranPages(){
        return By.xpath("/html/body");
    }
    private By methodePayment(){
        return By.xpath("//*[@id=\"section-list-payment\"]/div/ul/li[2]");
    }
    private By BayarSekarang(){
        return By.xpath("//*[@id=\"submit_payment\"]");
    }

    @Step
    public void validatePulsaPage() {
        $(body()).isDisplayed();
    }

    @Step
    public void fillNumberPhone(String phoneNumber){
        $(fillNumber()).type(phoneNumber);
    }
    @Step
    public void NominalChoose(){
        $(nominalChoose()).click();
    }
    @Step
    public void pembayaranpage(){
        $(pembayaranPages()).isDisplayed();
    }
    @Step
    public void methodPayment(){
        $(methodePayment()).click();
    }
    @Step
    public void getbuyNOW(){
        $(BayarSekarang()).click();
    }
}
