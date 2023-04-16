package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.PostInvelidLogin;
import starter.login.PostLogin;

public class LoginSteps {
    @Steps
    PostLogin postLogin;
    @Steps
    PostInvelidLogin postInvelidLogin;


//VALID LOGIN//
    @Given("I am set the POST Api for login endpoint")
    public void setPOSTLoginEndpoint(){
        postLogin.setPOSTLoginEP();
    }
    @When("I send HTTP request POST for login")
    public void httpRequestPostLogin(){
        postLogin.sendRequestPostLogin();
    }
    @Then("I received success code 200")
    public void receive200CodePostLogin(){
        postLogin.receiveCodeforLogin();
    }
    @And("I received Token for log in")
    public void receivedLogin(){
        postLogin.receivedTokenLogin();
    }

    //INVALID LOGIN//
    @Given("I set POST API LOGIN endpoint")
    public void setPostInvalid(){
        postInvelidLogin.setPOSTInvalidLoginEP();
    }
    @When("I send the Rrquest on HTTP")
    public void sendRequestInvalid(){
        postInvelidLogin.sendRequestPostINVALIDLogin();
    }
    @Then("I receive error Code 401")
    public void receive401Login(){
        postInvelidLogin.receiveCode401forLogin();
    }
    @And("I get the response for Invalid")
    public void responseInvalid(){
        postInvelidLogin.receivedWarningLogin();
    }
}
