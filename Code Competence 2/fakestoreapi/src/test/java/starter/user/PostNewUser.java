package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostNewUser {
    protected static String link = "https://fakestoreapi.com/users";

    @Step("I set POST api endpoint")
    public String setPostEndpoint(){return link;}
    @Step("I set the POST HTTP request")
    public void RequestHTTPPOstUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("'id'",(21));
        requestBody.put("email","AAA@gmail.com");
        requestBody.put("username","AAAA");
        requestBody.put("password","aaaaa$");
        requestBody.put("__v",0);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpoint());
    }
    @Step("I should receive success response code 200")
    public void receiveCode200PostNew(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step("I validate the new data of user")
    public void validateNewDataUser(){
        restAssuredThat(response->response.body("id",equalTo(11)));
    }
}
