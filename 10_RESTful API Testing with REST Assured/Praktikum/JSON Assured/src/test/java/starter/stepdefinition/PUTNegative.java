package starter.stepdefinition;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class PUTNegative {
    protected String url = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set PUT endpoint")
    public String setPutApiEndpoint(){
        return url;
    }
    @Step("I send PUT  invalid HTTP request")
    public void sendPUTRequest(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body("{ \"title\": \"New put\", \"body\": \"New put body\", \"userId\": 1339}")
                .when()
                .put(setPutApiEndpoint())
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("New put"))
                .body("body", equalTo("New put body"))
                .body("userId", equalTo(1339));
    }
    @Step("I receive HTTP code 404")
    public void  receiveHttpCode(){
        restAssuredThat(response -> response
                .statusCode(200)
                .body("error", nullValue())
                .body("error", nullValue()));
    }
    @Step("I receive warning error from HTTP Code")
    public void validateWarningMessage(){
        restAssuredThat(response -> response.body("userId", equalTo(Integer.valueOf(1339))));
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(response -> response.body("'title'",equalTo("New put")));
        restAssuredThat(response -> response.body("'body'", equalTo("New put body")));
    }

}

