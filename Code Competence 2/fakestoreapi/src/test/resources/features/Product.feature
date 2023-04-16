Feature: Access Product from Shop
  As admin I should able to access product
  So that I can see the update an edit database

  Scenario: Get Product by id
    Given I am set the GET product endpoint
    When I send request for GET product by id
    Then  I receive validate code 200

  Scenario: Get product by short the parameter
    Given I set the short GET product parameter
    When I send the request Get product
    Then I receive 200 to validate scenario

  Scenario: Get the product by it's category
    Given Set the GET product endpoint with category
    When Send the HTTP request for Get product category
    Then Receive HTTP code 200

  Scenario: Update Product using PUT method
    Given I am set the PUT new product endpoint
    When I send the Request for HTTP PUT
    Then I received the success code 201
    And  I trying to check the new data

  Scenario: POST new data of product
    Given I am set the POST new product Api endpoint
    When I send the request for HTTP POST
    Then system send me 200 code success
    And I try to check the new product
