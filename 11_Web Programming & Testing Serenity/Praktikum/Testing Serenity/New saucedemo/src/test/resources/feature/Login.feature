Feature: User be able to login
  As user
  I want to see home page
  So that I can buy product

  Scenario: As user, I have be able to success login
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the home page