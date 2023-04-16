package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteUser;
import starter.user.GetAll;
import starter.user.PostNewUser;
import starter.user.PutUpdate;

public class UserSteps {
    @Steps
    GetAll getAll;
    @Steps
    PostNewUser postNewUser;
    @Steps
    PutUpdate putUpdate;
    @Steps
    DeleteUser deleteUser;

    //GET ALL USER/
    @Given("I set GET all api endpoint")
    public void setEndpointofGet() {
        getAll.setApiEndpoint();
    }

    @When("I send GET all HTTP Request")
    public void setHTTPGet() {
        getAll.sendRequestHTTP();
    }

    @And("I receive Valid HTTP response 200")
    public void receiveHTTPResponse() {
        getAll.validResponse200();
    }

    @Then("I receive valid data detail user")
    public void receiveGetDataUser() {
        getAll.validateDataUser();
    }

    //POST NEW DATA USER//
    @Given("I set POST api endpoint")
    public void setPOSTUserEndpoint() {
        postNewUser.setPostEndpoint();
    }

    @When("I set the POST HTTP request")
    public void setRequestPOSTUser() {
        postNewUser.RequestHTTPPOstUser();
    }

    @And("I should receive success response code 200")
    public void receivePostUser200() {
        postNewUser.receiveCode200PostNew();
    }

    @Then("I validate the new data of user")
    public void validatePostUser() {
        postNewUser.validateNewDataUser();
    }

    //PUT UPDATE DATA USER//
    @Given("I set the Api PUT ENDPOINT")
    public void setPUTUpdateEndpoint() {
        putUpdate.setPUTUpdateUser();
    }
    @When("I send HTTP Request to PUT")
    public void setRequestPUTUpdateUser() {
        putUpdate.setRequestPutUpdateUser();
    }
    @Then("I receive response code 200")
    public void receiveUpdatePutResponse200(){
        putUpdate.receiveResponseUpdateUser();
    }
    @And("I try to validate the update data user")
    public void validateUpdateUser(){
        putUpdate.tryValidateUpdateUser();
    }

    //DELETE USER//
    @Given("I set the Delete endpoint")
    public void setDeleteUserEndpoint(){
        deleteUser.setDeleteUserEndpoint();
    }
    @When("I send HTTP Request for Deleting")
    public void setRequestDeleteUser(){
        deleteUser.sendHTTPforDeleteUser();
    }
    @Then("I receive code 200 for success deleting")
    public void receiveDeleteUserCode200(){
        deleteUser.receiveCodeForDeleteUser();
    }
}