Feature: User able to log out
  As user
  I want be in home page
  I want to log out from my account

  Scenario: As user, I have be able to log out account
    Given I on the login page
    And I input username
    And I input password
    And I click the login button
    When I on the home page
    And I click stripes button
    And I click logout word
    Then I back to login page