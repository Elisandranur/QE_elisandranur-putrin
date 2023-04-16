package starter.cart;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetWithLimitCart {
    protected String shortlink = "https://fakestoreapi.com";
    @Step("I set GET api endpoint for limit view")
    public String setEndpointLimitCart(){
        return shortlink +"/carts?limit=3";
    }
    @Step("I send request with Limit Get")
    public void sendTheLimitCartRequest(){
        SerenityRest.given()
                .get(setEndpointLimitCart());
    }
    @Step("I receive the cart list with desc")
    public void receiveCartListLimit(){
        restAssuredThat(response->response.body("'id'[0]",equalTo(1)));
    }
    @Step("I got verified code success 200")
    public void verify200LimitCart(){
        restAssuredThat(response->response.statusCode(200));
    }
}
