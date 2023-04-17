package starter.stepdefinition;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class GetAll {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step
    public String setApiGETALLEndpoint(){
        return url;
    }
    @Step
    public void sendRequstGETALLHttp(){
        SerenityRest.given()
                .get(setApiGETALLEndpoint());
    }
    @Step
    public void getResponseCodeGETALL(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step
    public void verifyContentGETALL(){
        restAssuredThat(response->response.body("'id'[0]", equalTo(1)));
    }
}
