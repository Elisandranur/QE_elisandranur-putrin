Feature: Posting on home page of linkedin website
  As a user
  I want to post something
  So that I can share my experience

  Scenario: As a user i have to able to post with photo on the main page
    Given I am on the LinkedIn home page
    When I click on the photo icon
    And I select the photo from my device
    And I type This is my newest work experience company in the post text box
    And I click the Post button
    Then the photo with caption should appear on my home page