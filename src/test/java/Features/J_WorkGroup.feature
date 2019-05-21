Feature: Work Group Tab
  This feature file is used to create New Work Group

  @J_WorkGroupTab
  Scenario Outline: Create New Work Group
    Given User should select acting role as Location Admin
    When User see the Work Group Tab
    Then User should click on Create New Work Group
    And User should enter work group "<name>"
    And User should enter work group description "<description>"
    And User should select the Seniority Rule
    And User should select the Shift Rule Set
    And User should select the PTO Rule Set
    And User should select the UTO Rule Set
    And User should select the VTO Slot Rule Set
    And User should select the Add Button

    Examples:
      | name   | description                        |
      | SAS002 | SAS001 Test Work Group Description |

