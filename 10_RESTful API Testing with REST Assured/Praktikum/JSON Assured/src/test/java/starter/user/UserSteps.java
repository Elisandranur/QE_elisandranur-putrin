package starter.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import org.testng.annotations.Test;
import starter.stepdefinition.*;

public class UserSteps {
    @Steps
    GetAll getAll;
    @Steps
    GetAllNegative getAllNegative;
    @Steps
    GET get;
    @Steps
    GetNegative getNegative;
    @Steps
    POSTnew posTnew;
    @Steps
    PostNegative postNegative;
    @Steps
    PUTpositive puTpositive;
    @Steps
    PUTNegative putNegative;
    @Steps
    Delete delete;
    @Steps
    DeleteNegative deleteNegative;

    //GET ALL DATA USER
    @Given("set the GET ALL user data endpoint")
    public void setGETALLEndpoint(){
        getAll.setApiGETALLEndpoint();
    }
    @When("send the HTTP Request GET ALL user")
    public void sendRequestOfGETALL(){
        getAll.sendRequstGETALLHttp();
    }
    @Then("i got verify code 200")
    public void verifiedCode200GETALL(){
        getAll.getResponseCodeGETALL();
    }
    @And("I try to check content of get all by id 1")
    public void checkContentGETALL(){
        getAll.verifyContentGETALL();
    }

    //GET ALL DATA NEGATIVE
    @Given("I set to get all user with parameter endpoint")
    public void setRequestInvalidGETALL(){
        getAllNegative.setInvalidGETALLEndpoint();
    }
    @When("I send that request to get all data user")
    public void sendRequestInvalidGETALL(){
        getAllNegative.sendRequestInvalidGETALL();
    }
    @Then("I receive response code HTTP")
    public void receiveCodeInvalidGETALL(){
        getAllNegative.receiveresponseGETALL();
    }
    @And("I try to check the body")
    public void checkBodyInvalidGETALL(){
        getAllNegative.tryCehckBodyGETALL();
    }

    //GET DATA ID
    @Given("I set GET api endpoint")
    public void setToGetEndpoints(){
        get.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpReq(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttp(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for detail")
    public void receiveValidDataDetailUser(){
        get.validateDateDetailUser();
    }

    //GET DATA NEGATIVE
    @Given("set GET API endpoint link")
    public void setEndpointGetInvalid(){
        getNegative.setEndpoinInvalidGetid();
    }
    @When("I send request with invalid id user")
    public void sendRequestInvalidPOSTHTTP(){
        getNegative.sendInvalidGetHttpRequest();
    }
    @Then("I will get 404 Not Found Response")
    public void response404GETInvalid(){
        getNegative.validateHttpResponseCode404();
    }

    //POST DATA
    @Given("I SET post API endpoint")
    public void setPOSTapi(){
        posTnew.setApiPOSTNewEndpoint();
    }
    @When("I send POST HTTP request")
    public void sendPOSTRequest(){
        posTnew.sendPOSThTTPRequest();
    }
    @Then("I receive valid response code 200")
    public void receiveValidHttpCode(){
        posTnew.receiveResponse200();
    }
    @And("I receive New data user")
    public void receiveNewData(){
        posTnew.validateNewData();
    }

    //POST INVALID REQUIREMENT
    @Given("set the endpoint post invalid")
    public void setEndpointInvalidPOSTUSER(){
        postNegative.setEndpointPOSTNegative();
    }
    @When("I send request for post on existing user id")
    public void sendRequestPOSTINVALID(){
        postNegative.sendRequestInvalidPOST();
    }
    @Then("I will get eror code 404")
    public void getBuildCodeInvalidPOST(){
        postNegative.verifiedCodeBuildPOst();
    }


    //PUT UPDATE DATA test POSITIVE
    @Given("I set PUT api endpoint")
    public void setPutAPI(){
        puTpositive.setPutApiEndpoint();
    }
    @When("I send PUT  HTTP request")
    public void sendHttpRequestPUT(){
        puTpositive.sendPUTHTTPRequest();
    }
    @Then("I receive HTTP code 200")
    public void receive200code(){
        puTpositive.receiveHttp200Code();
    }
    @And("I receive valid data for update user data")
    public void receiveUpdateData(){
        puTpositive.validateUpdateData();
    }

    //PUT update data negative
    @Given("I set PUT endpoint")
    public void setPUT(){putNegative.setPutApiEndpoint();}
    @When("I send PUT  invalid HTTP request")
    public void putInvalidRequest(){putNegative.sendPUTRequest();}
    @Then("I receive HTTP code 404")
    public void receiveCode404(){
        putNegative.receiveHttpCode();
    }
    @And("I receive warning error from HTTP Code")
    public void receiveMessage(){putNegative.validateWarningMessage();}

    //DELETE USER
    @Given("set the delete user endpoint")
    public void setTheDeleteUserEndpoint(){
        delete.setEndpointDelete();
    }
    @When("send the delete request HTTP")
    public void sendRequestDeleteUser(){
        delete.sendRequestDeleteUser();
    }
    @Then("receive code 200 HTTP code")
    public void receiveCodeDelete(){
        delete.getThe200CodeDelete();
    }
    @And("I try to recheck the existed data")
    public void recheckDeletedData(){
        delete.checkDeletedDataUser();
    }

    //DELETE NEGATIVE TEST
    @Given("I set Delete with invalid user endpoint")
    public void deletewithInvalidIDEndpoint(){
        deleteNegative.setDeleteInvalid();
    }
    @When("I send delete negative request")
    public void sendDeleteNegativeRequest(){
        deleteNegative.sendRequestInvalidDelete();
    }
    @Then("I verified with code response HTTP")
    public void verifyCodeDelete(){
        deleteNegative.verifiedHTTPCodedelInval();
    }
}
