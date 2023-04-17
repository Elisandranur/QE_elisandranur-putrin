package starter.stepdefinition;
import org.json.simple.JSONObject;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class POSTnew {
    protected static String urrl = "https://jsonplaceholder.typicode.com/posts";
    @Step("I SET post API endpoint")
    public String setApiPOSTNewEndpoint(){
        return urrl;
    }

    @Step("I send POST HTTP request")
    public void sendPOSThTTPRequest(){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\"id\": 101, \"title\": \"New post\", \"body\": \"New post body\", \"userId\": 1}")
                .when()
                .post(setApiPOSTNewEndpoint())
                .then()
                .statusCode(201)
                .body("id", equalTo(101))
                .body("title", equalTo("New post"))
                .body("body", equalTo("New post body"))
                .body("userId", equalTo(1));
    }
    @Step("I receive valid response code 200")
    public void receiveResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive New data user")
    public void validateNewData(){
        restAssuredThat(response -> response.body("userId", equalTo(Integer.valueOf(1))));
        restAssuredThat(response -> response.body("id", equalTo(101)));
        restAssuredThat(response -> response.body("'title'",equalTo("New post")));
        restAssuredThat(response -> response.body("'body'", equalTo("New post body")));
    }
}
