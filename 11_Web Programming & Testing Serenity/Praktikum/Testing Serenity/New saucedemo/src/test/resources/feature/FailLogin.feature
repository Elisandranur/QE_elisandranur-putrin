Feature: Login functionality
  As a user
  If I fill the wrong username and password
  I won't be able to get in to the homepage

  Scenario: Login with invalid credentials
    Given I am on the login home page
    When input valid username
    And input valid password
    And click the login button
    Then an error message is displayed

