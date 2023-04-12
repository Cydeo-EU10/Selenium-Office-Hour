Feature: Cydeo practice login function

  Scenario: positive login test
    Given user goes to login page
    When user login with valid credentials
    Then user is on the dashboard
