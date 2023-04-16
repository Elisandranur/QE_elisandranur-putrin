package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String base = "https://fakestoreapi.com";

    @Step("I set the Delete endpoint")
    public String setDeleteUserEndpoint(){return base+"/users/1";}
    @Step("I send HTTP Request for Deleting")
    public void sendHTTPforDeleteUser(){
        SerenityRest.given()
                .delete(setDeleteUserEndpoint());
    }
    @Step("I receive code 200 for success deleting")
    public void receiveCodeForDeleteUser(){
        restAssuredThat(response->response.statusCode(200));
    }
}
