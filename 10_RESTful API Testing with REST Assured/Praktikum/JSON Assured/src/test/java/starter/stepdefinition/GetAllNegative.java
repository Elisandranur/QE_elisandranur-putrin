package starter.stepdefinition;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.getDefaultResponseSpecification;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GetAllNegative {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";
    @Step
    public String setInvalidGETALLEndpoint(){
        return url;
    }
    @Step
    public void sendRequestInvalidGETALL(){
        SerenityRest.given()
                .param("id","all")
                .get(setInvalidGETALLEndpoint());
    }
    @Step
    public void receiveresponseGETALL(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step
    public void tryCehckBodyGETALL(){
        restAssuredThat(response->response.body("'id'[0]", equalTo(null)));
    }
}
