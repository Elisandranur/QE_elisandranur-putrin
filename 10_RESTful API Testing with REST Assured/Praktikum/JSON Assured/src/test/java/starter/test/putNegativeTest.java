package starter.test;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.anyOf;

public class putNegativeTest {
    @Test
    public void updateUserNegativeTest() {

        // Given
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", equalTo(2));
        requestBody.put("title", equalTo("New put"));
        requestBody.put("body", equalTo("New put body"));
        requestBody.put("userId", equalTo(1339));

        // When
        RestAssured.config = RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation());
        Response response = RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts/1")
                .contentType("application/json")
                .body(requestBody.toString())
                .put();


        // Then
        response.then()
                .statusCode(anyOf(is(400), is(422)));
    }

}
