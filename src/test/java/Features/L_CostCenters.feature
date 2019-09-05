Feature: Cost Centers Feature For Company Admin
  This Cost Centers feature deals with the Cost Centers functionality of the application

  @ZE_CreateCostCenters
  Scenario: Add Cost Centers Feature For Company Admin
    Given User Should select Acting roles
    When User see the Cost Centers Tab
    And User click on the Cost Centers link text
    Then User is on the Cost Centers Screen
    When User should click on the Create New Cost Centers
    Then User is on the New Cost Centers Screen
    And User enter the Cost Center Name
    And User enter the Cost Center Description "This is a Test Cost Center"
    And User enter the Display Order "001"
#    And User check on the Is Active Checkbox on Cost Center Screen
    Then User click on the Save Button to Add Cost Center

  @ZF_EditCostCenters
  Scenario: Edit Cost Centers Feature For Company Admin
    Given User is on the Cost Centers Screen
    When User should click on the Edit Cost Centers
    Then User is on the New Cost Centers Screen
    And User enter the Cost Center Name
    And User enter the Cost Center Description "This is a Test Cost Center"
    And User enter the Display Order "002"
#    And User check on the Is Active Checkbox on Cost Center Screen
    Then User click on the Save Button to Add Cost Center