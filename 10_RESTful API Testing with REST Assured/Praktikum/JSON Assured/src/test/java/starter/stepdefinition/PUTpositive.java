package starter.stepdefinition;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class PUTpositive {
    protected String url = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set PUT api endpoint")
    public String setPutApiEndpoint(){
        return url;
    }
    @Step("I send PUT  HTTP request")
    public void sendPUTHTTPRequest(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body("{ \"title\": \"New put\", \"body\": \"New put body\", \"userId\": 1}")
                .when()
                .put(setPutApiEndpoint())
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("New put"))
                .body("body", equalTo("New put body"))
                .body("userId", equalTo(1));
    }
    @Step("I receive HTTP code 200")
    public void  receiveHttp200Code(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for update user data")
    public void validateUpdateData(){
        restAssuredThat(response -> response.body("userId", equalTo(Integer.valueOf(1))));
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(response -> response.body("'title'",equalTo("New put")));
        restAssuredThat(response -> response.body("'body'", equalTo("New put body")));
    }
}
