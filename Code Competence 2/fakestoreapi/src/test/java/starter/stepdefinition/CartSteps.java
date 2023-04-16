package starter.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.cart.GetShortListCart;
import starter.cart.GetWithLimitCart;
import starter.cart.GetbyIdCart;
import starter.cart.PutProductCart;
import starter.product.*;
public class CartSteps {
    @Steps
    GetbyIdCart getbyIdCart;
    @Steps
    GetWithLimitCart getWithLimitCart;
    @Steps
    GetShortListCart getShortListCart;
    @Steps
    PutProductCart putProductCart;

    //GET CART BY ID//
    @Given("I set GET cart endpoint")
    public void setGetCartIdEnpoint(){
        getbyIdCart.setEndpointIdcart();
    }
    @When("I send HTTP request for GET the Cart")
    public void sendRequestGetIdCart(){
        getbyIdCart.sendRequestIDCart();
    }
    @Then("I receive code build 200")
    public void receiveCodeGetCartId(){
        getbyIdCart.codeBuildGetIdCart();
    }
    @And("I verify that Cart can be accessed")
    public void verifyGetCartId(){
        getbyIdCart.verifyIdCartAccessed();
    }

    // Get cart short by limit number//
    @Given("I set for GET cart endpoint")
    public void setEndpointGetLimit(){
        getWithLimitCart.setEndpointLimitCart();
    }
    @When("I set the limit desc for GET the cart")
    public void setRequestLimitCart(){
        getWithLimitCart.sendTheLimitCartRequest();
    }
    @Then("I receive 200 code response")
    public void receive200CodeCartLimit(){
        getWithLimitCart.verify200LimitCart();
    }
    @And("I got the carts with limit I set")
    public void gotCartWithLimit(){
        getWithLimitCart.receiveCartListLimit();
    }

    // GET SHORT LISTED CART//
    @Given("I set GET api endpoint for limit view")
    public void setGETcartShortList(){
        getShortListCart.setGETsHORTLISTCart();
    }
    @When("I send request with Limit Get")
    public void sendRequestLimitGetCart(){
        getShortListCart.setLimitDescCart();
    }
    @Then("I receive the cart list with desc")
    public void receiveCartList(){
        getShortListCart.getCodeResponseShortCart();
    }
    @And("I got verified code success 200")
    public void verified200GetCartShort(){
        getShortListCart.gotcartWithShort();
    }

    //PUT NEW PRODUCT ON CART//
    @Given("Set the cart PUT api endpoint")
    public void setEndpointPUTNewcart(){
        putProductCart.setEndpointUpdateCART();
    }
    @When("I send request PUT to add product cart")
    public void sendRequestPutNewCart(){
        putProductCart.sendRequestUpdateCART();
    }
    @Then("I receive Http response 200")
    public void receive200PutNewCart(){
        putProductCart.receive200ResponseUpdateCART();
    }
    @And("I try to access that cart update")
    public void accessCartPutUpdate(){
        putProductCart.accessCARTUPDATE();
    }
}
