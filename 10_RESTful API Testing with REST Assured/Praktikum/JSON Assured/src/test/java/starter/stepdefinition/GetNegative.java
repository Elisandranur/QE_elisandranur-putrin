package starter.stepdefinition;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.contains;
public class GetNegative {
    protected static String url = "https://jsonplaceholder.typicode.com";
    @Step
    public String setEndpoinInvalidGetid(){
        return url + "/posts/199999";
    }
    @Step
    public void sendInvalidGetHttpRequest() {
        SerenityRest.given().get(setEndpoinInvalidGetid());
    }
    @Step
    public void validateHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
