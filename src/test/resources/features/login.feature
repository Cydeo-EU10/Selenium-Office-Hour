Feature: Cydeo practice login function

  Background:
    Given user goes to login page

@wip
  Scenario: positive login test
    When user login with "valid" credentials
    Then user is on the dashboard


  Scenario: negative login test
    When user login with "invalid" credentials
    Then user gets error message

