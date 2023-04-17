package starter.stepdefinition;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class DeleteNegative {
    protected String base = "https://jsonplaceholder.typicode.com";
    @Step
    public String setDeleteInvalid(){
        return base + "/posts";
    }
    @Step
    public void sendRequestInvalidDelete(){
        SerenityRest.given()
                .param("id",100)
                .delete(setDeleteInvalid());
    }
    @Step
    public void verifiedHTTPCodedelInval(){
        restAssuredThat(response->response.statusCode(404));
    }
}
