package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class PaymentReceiptPage extends  PageObject{
    private By bodyy() {
        return By.xpath("/html/body");
    }
    @Step
    public void validateReceiptPage() {
        $(bodyy()).isDisplayed();
    }
}
