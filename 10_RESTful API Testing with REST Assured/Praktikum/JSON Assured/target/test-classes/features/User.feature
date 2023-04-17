Feature: User Data
  As an admin
  I want to see list of data user
  So that I can create new data user

  Scenario: GET ALL data user
    Given set the GET ALL user data endpoint
    When send the HTTP Request GET ALL user
    Then i got verify code 200
    And I try to check content of get all by id 1

  Scenario: get all data user with parameter method
    Given I set to get all user with parameter endpoint
    When I send that request to get all data user
    Then I receive response code HTTP
    And I try to check the body

  Scenario: GET data as admin able to get detail data user
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail

  Scenario: Get data by over id user number
    Given set GET API endpoint link
    When I send request with invalid id user
    Then I will get 404 Not Found Response

  Scenario: POST new data user
    Given I SET post API endpoint
    Then I receive valid response code 200
    When I send POST HTTP request
    And I receive New data user

  Scenario: POST new user data with some invalid requirement
    Given set the endpoint post invalid
    When I send request for post on existing user id
    Then I will get eror code 404

  Scenario: PUT an update data for existing user
    Given I set PUT api endpoint
    When I send PUT  HTTP request
    Then I receive HTTP code 200
    And I receive valid data for update user data

  Scenario: Test PUT update data with invalid userId
    Given I set PUT endpoint
    When I send PUT  invalid HTTP request
    Then I receive HTTP code 404
    And I receive warning error from HTTP Code

  Scenario: Try Delete User data
    Given set the delete user endpoint
    When send the delete request HTTP
    Then receive code 200 HTTP code
    And I try to recheck the existed data

  Scenario: Try delete with Invalid ID User
    Given I set Delete with invalid user endpoint
    When I send delete negative request
    Then I verified with code response HTTP
