Feature: Login on Linkedin to see Home Page
  As a user
  I want to see my main page
  So that I can upload new status about my achievement

  Scenario: As a user i have to able to success login
    Given I am on the login page
    When I am enter my username and password correctly
    And I click login button
    Then I am on the main page