package starter.stepdefinition;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Delete {
    protected String base = "https://jsonplaceholder.typicode.com";
    @Step
    public String setEndpointDelete(){
        return base + "/posts/1";
    }
    @Step
    public void sendRequestDeleteUser(){
        SerenityRest.given()
                .delete(setEndpointDelete());
    }
    @Step
    public void getThe200CodeDelete(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step
    public void checkDeletedDataUser(){
        System.out.println("I Just DELETE the user data id 1");
    }

}
