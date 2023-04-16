package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PutUpdate {
    protected String trl = "https://fakestoreapi.com";

    @Step("I set the Api PUT ENDPOINT")
    public String setPUTUpdateUser(){
        return trl + "/users/1";
    }
    @Step("I send HTTP Request to PUT")
    public void setRequestPutUpdateUser(){
        JSONObject requestNewBody = new JSONObject();
        requestNewBody.put("email","AAA@gmail.com");
        requestNewBody.put("username","AAAA");
        requestNewBody.put("password","aaaaa$");
        requestNewBody.put("__v",0);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestNewBody.toJSONString())
                .put(setPUTUpdateUser());
    }
    @Step("I receive response code 200")
    public void receiveResponseUpdateUser(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step("I try to validate the update data user")
    public void tryValidateUpdateUser(){
        restAssuredThat(response->response.body("email",equalTo("AAA@gmail.com")));
        restAssuredThat(response->response.body("username",equalTo("AAAA")));
        restAssuredThat(response->response.body("password",equalTo("aaaaa$")));
    }
}
