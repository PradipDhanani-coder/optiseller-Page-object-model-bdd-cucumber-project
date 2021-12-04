Feature: Sign In Functionality
  As a user
  I want to sign in on optiseller website

  Scenario: Verify user should navigate to login page
    Given I am on Optiseller Home page
    When I click on Sign In button
    Then I should be in Sign In page

  Scenario: Verify user should not Sign In with invalid credentials
    Given I am on Optiseller Home page
    And I click on Sign In button
    When I enter email Address "xyz12@gmail.com" on email field
    And I enter password "Acd123456@" on Password field
    And I click Sign In button
    Then System should show an error message

