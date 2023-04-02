Feature: Sepulsa Login feature until top up feature
  As a user
  I want to login on Sepulsa web app
  So that I can top up pulsa balance

  Scenario: User successfully logged in and top up balance

    Given I am on Sepulsa Home page
    When I click on Masuk button
    And I fill with valid email and password
    And I click on Masuk button again
    Then I should be on Sepulsa dashboard
    When I am click the pulsa or phone icon
    And I am input my Phone number
    And I am select the nominal of the credit
    And I use to select payment method
    And I have complete the payment process
    Then I should receive a successful top up pop up message