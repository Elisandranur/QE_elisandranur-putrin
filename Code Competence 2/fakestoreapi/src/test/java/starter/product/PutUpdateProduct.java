package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PutUpdateProduct {
    private String uurrl ="https://fakestoreapi.com";
    @Step("I am set the PUT new product endpoint")
    public String setPUTUpdateProduct(){
        return uurrl + "/products/1";
    }
    @Step("I send the Request for HTTP PUT")
    public void requestUpdateProduct(){
        JSONObject requestNewBody = new JSONObject();
        requestNewBody.put("title", "SALE PRODUCT");
        requestNewBody.put("price", 77.7);
        requestNewBody.put("description","FLASH SALE PRODUCT");
        requestNewBody.put("image","https://i.pravatar.cc");
        requestNewBody.put("category","MOTORCYCLE");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestNewBody.toJSONString())
                .put(setPUTUpdateProduct());
    }
    @Step("I received the success code 201")
    public void receivedcodeUpdateProduct(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I trying to check the new data")
    public void tryCheckUpdateProduct(){
        restAssuredThat(response->response.body("title",equalTo("SALE PRODUCT")));
        restAssuredThat(response->response.body("category",equalTo("MOTORCYCLE")));
    }
}
