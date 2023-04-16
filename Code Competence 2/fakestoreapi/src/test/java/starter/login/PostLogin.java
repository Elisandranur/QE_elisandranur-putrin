package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostLogin {
    protected String url = "https://fakestoreapi.com";

    @Step("I am set the POST Api for login endpoint")
    public String setPOSTLoginEP(){
        return url + "/auth/login";
    }
    @Step("I send HTTP request POST for login")
    public void sendRequestPostLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTLoginEP());
    }
    @Step("I received success code 200")
    public void receiveCodeforLogin(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step("I received Token for log in")
    public void receivedTokenLogin(){
        System.out.println("I Just The Login Token");
    }
}
