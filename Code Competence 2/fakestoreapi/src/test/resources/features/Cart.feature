Feature: CART of product
  As admin I should able to see users cart
  So that I can edit or delete any cart

  Scenario: GET single cart by id
    Given I set GET cart endpoint
    When I send HTTP request for GET the Cart
    Then I receive code build 200
    And I verify that Cart can be accessed

  Scenario: GET carts with limit number
    Given I set for GET cart endpoint
    When I set the limit desc for GET the cart
    Then I receive 200 code response
    And I got the carts with limit I set

  Scenario: Short Result by Desc GET Cart
    Given I set GET api endpoint for limit view
    When I send request with Limit Get
    Then I receive the cart list with desc
    And I got verified code success 200

  Scenario: PUT new add product for any cart
    Given Set the cart PUT api endpoint
    When I send request PUT to add product cart
    Then I receive Http response 200
    And I try to access that cart update