Feature: Showing user Profile
  As a user
  I want to see my linkedin profile
  So that I can edit my profile

  Scenario: As a user i have to able edit my profile
    Given I am on the home page of linkedin
    And I want to edit my linkedin profile
    When I go to left side of home page
    And I click on my name profile
    Then I am on my profile page