package starter.cart;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class PutProductCart {
    protected String yurl = "https://fakestoreapi.com";
    @Step("Set the cart PUT api endpoint")
    public String setEndpointUpdateCART(){
        return yurl +"/carts/2";
    }
    @Step("I send request PUT to add product cart")
    public void sendRequestUpdateCART(){
        JSONObject requestNewBody = new JSONObject();
        requestNewBody.put("userId",3);
        requestNewBody.put("date", "2019-12-10");
        requestNewBody.put("products.productId",1);
        requestNewBody.put("products.quantity",3);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestNewBody.toJSONString())
                .put(setEndpointUpdateCART());
    }
    @Step("I receive Http response 200")
    public void receive200ResponseUpdateCART(){
        restAssuredThat(response->response.statusCode(200));
    }
    @Step("I try to access that cart update")
    public void accessCARTUPDATE(){
        restAssuredThat(response->response.body("userId",equalTo(3)));
        restAssuredThat(response->response.body("date",equalTo("2019-12-10")));
    }
}
