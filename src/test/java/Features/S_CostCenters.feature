Feature: Qualification Feature For Company Admin
  This Qualification feature deals with the Qualification functionality of the application

  @ZE_CreateCostCenters
  Scenario: Add Cost Centers Feature For Company Admin
    Given User Should select Acting roles
    When User see the Cost Centers Tab
    And User click on the Cost Centers link text
    Then User is on the Cost Centers Screen
    When User should click on the Create New Cost Centers
    Then User is on the New Cost Centers Screen
    And User enter the Cost Center Name "Test Cost Center1"
    And User enter the Cost Center Description "This is a Test Cost Center"
    And User enter the Display Order "001"
#    And User check on the Is Active Checkbox on Cost Center Screen
    Then User click on the Save Button to Add Cost Center
