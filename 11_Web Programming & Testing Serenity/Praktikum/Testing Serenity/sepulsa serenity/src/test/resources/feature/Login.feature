Feature: User able to login
  As user
  I want to have active account
  So that I can buy product

  Scenario: I have be able to success login
    Given I am on the home page
    When I click masuk button
    And I input valid email
    And I input valid password
    And I click masuk button again
    Then I am on the home page with an account