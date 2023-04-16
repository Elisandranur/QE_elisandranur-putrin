package starter.cart;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetShortListCart {
    protected String shortlink = "https://fakestoreapi.com";
    @Step("I set for GET cart endpoint")
    public String setGETsHORTLISTCart(){
        return shortlink ;
    }
    @Step("I set the limit desc for GET the cart")
    public void setLimitDescCart(){
        SerenityRest.given()
                .param("sort","desc")
                .get(setGETsHORTLISTCart());
    }
    @Step("I receive 200 code response")
    public void getCodeResponseShortCart(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I got the carts with limit I set")
    public void gotcartWithShort(){
        System.out.println("I Got list of everi desc cart");
    }
}
