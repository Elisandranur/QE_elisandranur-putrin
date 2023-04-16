Feature: LOGIN for admin fakestoreapi
  As Admin I should able to login
  So that I can access all data easily

  Scenario: POST valid username and password to Login
    Given I am set the POST Api for login endpoint
    When I send HTTP request POST for login
    Then I received success code 200
    And I received Token for log in

  Scenario: POST INVALID password and Valid Username
    Given I set POST API LOGIN endpoint
    When I send the Rrquest on HTTP
    Then  I receive error Code 401
    And I get the response for Invalid