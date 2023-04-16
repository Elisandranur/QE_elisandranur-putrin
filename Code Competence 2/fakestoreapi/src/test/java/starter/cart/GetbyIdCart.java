package starter.cart;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetbyIdCart {
    protected static String urrll = "https://fakestoreapi.com";
    @Step("I set GET cart endpoint")
    public String setEndpointIdcart(){
        return urrll +"/carts/1";
    }
    @Step("I send HTTP request for GET the Cart")
    public void sendRequestIDCart(){
        SerenityRest.given()
                .get(setEndpointIdcart());
    }
    @Step("I receive code build 200")
    public void  codeBuildGetIdCart(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I verify that Cart can be accessed")
    public void verifyIdCartAccessed(){
        restAssuredThat(response->response.body("'id'", equalTo(1)));
    }
}
