package starter.product;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class PostNewProduct {
    protected static String linkk = "https://fakestoreapi.com/products";

    @Step("I am set the POST new product Api endpoint")
    public String setPostProductEndpoint(){return linkk;}
    @Step("I send the request for HTTP POST")
    public void requestPostNewProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5);
        requestBody.put("description","lorem ipsum set");
        requestBody.put("image","https://i.pravatar.cc");
        requestBody.put("category","electronic");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toJSONString())
                .post(setPostProductEndpoint());
    }
    @Step("system send me 200 code success")
    public void code200PostProduct(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step("I try to check the new product")
    public void checkNewProduct(){
        restAssuredThat(response->response.body("id",equalTo(21)));
    }
}
