package starter.product;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetbyShort {
    protected static String urll = "https://fakestoreapi.com/products";

    @Step("I set the short GET product parameter")
    public String setParameterGetEndpoint(){return urll;}
    @Step("I send the request Get product")
    public void requestGETShortProduct(){
        SerenityRest.given()
                .param("sort","desc")
                .get(setParameterGetEndpoint());
    }
    @Step("I receive 200 to validate scenario")
    public void receiveValidateGetShort(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
