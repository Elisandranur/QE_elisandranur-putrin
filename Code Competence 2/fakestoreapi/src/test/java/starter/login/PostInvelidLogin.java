package starter.login;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class PostInvelidLogin {
    protected String url = "https://fakestoreapi.com";
    @Step("I set POST API LOGIN endpoint")
    public String setPOSTInvalidLoginEP(){
        return url + "/auth/login";
    }
    @Step("I send the Rrquest on HTTP")
    public void sendRequestPostINVALIDLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "bukanYa");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTInvalidLoginEP());
    }
    @Step("I receive error Code 401")
    public void receiveCode401forLogin(){
        restAssuredThat(response->response.statusCode(401));
    }
    @Step("I get the response for Invalid")
    public void receivedWarningLogin(){
        System.out.println("I Just Cannot get Token");
        restAssuredThat(response->response.extract());
    }
}
