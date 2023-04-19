Feature: Registration page


#  @wip
  Scenario: check registration page
    Given user go to registration page
    When user enter valid data
    Then user able to see the message


    #data table
#  @wip
  Scenario: provide data in feature file
    Given user go to registration page
    When user enter data
      | Tom           |
      | Hanks         |
      | tomHanks      |
      | tom@hanks.com |
      | 123654789     |
      | 571-000-0000  |
      | 1             |
      | 02/12/2014    |
      | 2             |
      | 4             |
    Then user able to see the message

    @wip
    # provide data in example -- parametrizing
  Scenario Outline: provide data in example
    Given user go to registration page
    When user enter firstname "<firstName>"
    And user enter lastname "<lastName>"
    And user enter username "<userName>"
    And user enter email "<email>"
    Then user able to see the message
    Examples:
      | firstName | lastName | userName | email         |
      | Tom       | Hanks    | tomHanks | tom@hanks.com |
      | Tom       | Hanks    | tomHanks | tom@hanks.com |
      | Mike      | Panse    | mikeP    | mike@pans.com |





