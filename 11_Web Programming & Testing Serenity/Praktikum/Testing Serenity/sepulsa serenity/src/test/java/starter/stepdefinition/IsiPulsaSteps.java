package starter.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.IsiPulsaPage;
import starter.pages.PaymentReceiptPage;

public class IsiPulsaSteps {
    @Steps
    IsiPulsaPage isiPulsaPage;
    @Steps
    PaymentReceiptPage paymentReceiptPage;

    @Given("User already in Isi Pulsa Page")
    public void inpulsaPage(){
        isiPulsaPage.validatePulsaPage();
    }
    @When("I am fill the number")
    public void fillPhoneNumber(){
        isiPulsaPage.fillNumberPhone("08555555555");
    }
    @And("I choose nominal")
    public void nominalchoosen(){
        isiPulsaPage.NominalChoose();
    }
    @And("I am on the Pembayaran Page")
    public void pembayaran(){
        isiPulsaPage.pembayaranpage();
    }
    @And("I choose payment methode Gopay")
    public void gopayMethod(){
        isiPulsaPage.methodPayment();
    }
    @And("I click the Bayar Sekarang Button")
    public void clickBayar(){
        isiPulsaPage.getbuyNOW();
    }
    @Then("I am on the Payment Receipt page")
    public void receiptPage(){
        paymentReceiptPage.validateReceiptPage();
    }
}
