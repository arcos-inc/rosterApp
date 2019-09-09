Feature: UTO Rule Sets
  This feature file is used to create New UTO Rule Sets

  @M_UTORuleSet
  Scenario Outline: Create New UTO Rule Set
    Given User should be login as a Company Admin
    When User clicks on Create New UTO Rule Set
    Then User should be navigated to New UTO Rule Set page
    And User should be able to enter UTO "<ruleSetName>"
    And User should be able to enter "<minHrs>" Before Shift Start UTO Request
    And User should be able to enter "<maxHrs>" Before UTO Request
    And User should be able to enter "<maxOccurrences>" in Window
    And User should be able to enter "<windowForOccurrences>" days
    And User should be able to check Count Same Day Occurrences As One
    Then User should be able to click Add button

    Examples:
      | ruleSetName        | minHrs | maxHrs | maxOccurrences | windowForOccurrences |
      | SAS12 Std UTO Rules | 2.00   | 168.00 | 0              | 365                  |