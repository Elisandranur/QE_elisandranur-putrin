package starter.stepdefinition;

import net.thucydides.core.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.contains;

public class GET {
    protected static String url = "https://jsonplaceholder.typicode.com/posts?id=4";
    @Step("I set GET api endpoint")
    public String setApiEndpoint(){
        return url;
    }
    @Step ("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for detail")
    public void validateDateDetailUser(){
        restAssuredThat(response -> response.body("'id'[0]",equalTo(4)));
        restAssuredThat(response -> response.body("'title'",contains("eum et est occaecati")));
    }
}
