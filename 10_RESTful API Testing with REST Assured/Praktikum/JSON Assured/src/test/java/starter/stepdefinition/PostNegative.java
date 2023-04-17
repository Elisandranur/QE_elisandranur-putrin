package starter.stepdefinition;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class PostNegative {
    protected static String url = "https://jsonplaceholder.typicode.com";
    @Step
    public String setEndpointPOSTNegative(){
        return url +"/posts/1";
    }
    @Step
    public void sendRequestInvalidPOST(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "bukanYa");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setEndpointPOSTNegative());
    }
    @Step
    public void verifiedCodeBuildPOst(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
