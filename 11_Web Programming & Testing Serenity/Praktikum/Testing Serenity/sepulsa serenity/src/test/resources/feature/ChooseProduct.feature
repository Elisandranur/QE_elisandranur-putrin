Feature: Able to choose product Pulsa
  As a user I want to buy Pulsa
  So that I should on product list

  Scenario: Able to choose Pulsa product
    Given I am on Home page click Masuk Button
    And I input email
    And I input password
    And I click Masuk button to login
    When I am on the dashboard I click button of Lainnya
    And I am click pulsa button icon
    Then I am on the isi pulsa page