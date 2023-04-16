package starter.product;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetbyId {
    protected static String urrl = "https://fakestoreapi.com/products/1";

    @Step("I am set the GET product endpoint")
    public String getProductId(){
        return urrl;
    }
    @Step("I send request for GET product by id")
    public void requestGetProductId(){
        SerenityRest.given()
                .get(getProductId());
    }
    @Step("I receive validate code 200")
    public void receive200GetProductId(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
