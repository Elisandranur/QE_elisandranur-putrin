package starter.user;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAll {
    protected static String url = "https://fakestoreapi.com/users?id=1";

    @Step("I set GET all api endpoint")
    public String setApiEndpoint(){
        return url;
    }
    @Step("I send GET all HTTP Request")
    public void sendRequestHTTP(){
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive Valid HTTP response 200")
    public void validResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data detail user")
    public void validateDataUser(){
       restAssuredThat(response->response.body("'id'[0]", equalTo(1)));
       restAssuredThat(response->response.body("'email'[0]", equalTo("john@gmail.com")));
    }
}
