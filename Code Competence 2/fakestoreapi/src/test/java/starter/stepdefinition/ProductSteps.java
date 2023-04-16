package starter.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.*;

public class ProductSteps {
    @Steps
    GetbyId getbyId;
    @Steps
    GetbyShort getbyShort;
    @Steps
    GetbyCategory getbyCategory;
    @Steps
    PostNewProduct postNewProduct;
    @Steps
    PutUpdateProduct putUpdateProduct;

    //GET PRODUCT BY ID//
    @Given("I am set the GET product endpoint")
    public void setToGetProductId(){
        getbyId.getProductId();
    }
    @When("I send request for GET product by id")
    public void sendRequestGetProductId(){
        getbyId.requestGetProductId();
    }
    @Then("I receive validate code 200")
    public void validateGetproductId(){
        getbyId.receive200GetProductId();
    }

    //GET PRODUCT BY SHORT PARAMETER//
    @Given("I set the short GET product parameter")
    public void setToGetProductShort(){
        getbyShort.setParameterGetEndpoint();
    }
    @When("I send the request Get product")
    public void requestGetProductShort(){
        getbyShort.requestGETShortProduct();
    }
    @Then("I receive 200 to validate scenario")
    public void validateGetproductShort(){
        getbyShort.receiveValidateGetShort();
    }

    //GET PRODUCT CATEGORY//
    @Given("Set the GET product endpoint with category")
    public void setToGetProductCate(){
        getbyCategory.setEndpointProductCategory();
    }
    @When("Send the HTTP request for Get product category")
    public void RequestGetProductCate(){
        getbyCategory.sendRequestProductCate();
    }
    @Then("Receive HTTP code 200")
    public void validateGetproductCate(){
        getbyCategory.getHttpCodeCategoryProd();
    }

    //POST NEW PRODUCT//
    @Given("I am set the POST new product Api endpoint")
    public void setToPostNewProduct(){
        postNewProduct.setPostProductEndpoint();
    }
    @When("I send the request for HTTP POST")
    public void sendRequestPostNewProd(){
        postNewProduct.requestPostNewProduct();
    }
    @Then("system send me 200 code success")
    public void validatePostNewProd(){
        postNewProduct.code200PostProduct();
    }
    @And("I try to check the new product")
    public void checknewPostProduct(){
        postNewProduct.checkNewProduct();
    }

    //PUT UPDATE PRODUCT//
    @Given("I am set the PUT new product endpoint")
    public void setToPUTNewProduct(){
        putUpdateProduct.setPUTUpdateProduct();
    }
    @When("I send the Request for HTTP PUT")
    public void sendRequestPutNewProd(){
        putUpdateProduct.requestUpdateProduct();
    }
    @Then("I received the success code 201")
    public void validatePutUpdateProduct(){
        putUpdateProduct.receivedcodeUpdateProduct();
    }
    @And("I trying to check the new data")
    public void checkNewDataProduct(){
        putUpdateProduct.tryCheckUpdateProduct();
    }
}
