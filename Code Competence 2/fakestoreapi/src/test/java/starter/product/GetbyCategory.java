package starter.product;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetbyCategory {
    protected static String uurl = "https://fakestoreapi.com/products";

    @Step ("Set the GET product endpoint with category")
    public String setEndpointProductCategory(){
        return uurl + "/category/phone";
    }
    @Step("Send the HTTP request for Get product category")
    public void sendRequestProductCate(){
        SerenityRest.given()
                .get(setEndpointProductCategory());
    }
    @Step("Receive HTTP code 200")
    public void getHttpCodeCategoryProd(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
