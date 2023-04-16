Feature: USER feature
  As Admin
  I want be able to get all data user
  So That I can edit or see changes data

  Scenario: Get All data users
    Given I set GET all api endpoint
    When I send GET all HTTP Request
    And I receive Valid HTTP response 200
    Then I receive valid data detail user

  Scenario: POST new data for new user
    Given I set POST api endpoint
    When I set the POST HTTP request
    And I should receive success response code 200
    Then I validate the new data of user

  Scenario: PUT for update data user
    Given I set the Api PUT ENDPOINT
    When I send HTTP Request to PUT
    Then I receive response code 200
    And I try to validate the update data user

  Scenario: DELETE data user exist
    Given I set the Delete endpoint
    When I send HTTP Request for Deleting
    Then I receive code 200 for success deleting