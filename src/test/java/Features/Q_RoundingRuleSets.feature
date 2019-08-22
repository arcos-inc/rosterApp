Feature: Rounding Rule Sets Feature For Company Admin
  This Rule Sets feature deals with the Rounding functionality of the application

  @X_CreateRoundingRuleSet
  Scenario: Add Rounding Rule Sets Feature For Company Admin
    Given User Should select Acting roles
    When User see the Rule Sets Tab
    And User click on the Rule Sets link text
    Then User is on the Company Rule Sets Screen
    When User should click on the Create New Rounding Rule Set
    Then User is on the New Rounding Rule Set Screen
    And User enter the Rule Set Name "Dummy Rule Set"
    And User enter the Grace Minutes Before Start "12"
    And User enter the Grace Minutes After Start "20"
    And User check on the Round All Early In To Schedule
    And User select an option from the Round Early In Direction dropdown
    And User enter the Rule Set Description "This is a test Rounding Rule Set"
    Then User click on the Add Button to Add Rounding Rule Set

  @Y_EditRoundingRuleSet
  Scenario: Edit Rounding Rule Sets Feature For Company Admin
    Given User is on the Company Rule Sets Screen
    When User should click on the Edit Rounding Rule Set
    Then User is on the Edit Rounding Rule Set Screen
    And User enter the Rule Set Name "Dummy Rule Set"
    And User enter the Grace Minutes Before Start "12"
    And User enter the Grace Minutes After Start "20"
    And User check on the Round All Early In To Schedule
    And User select an option from the Round Early In Direction dropdown
    And User enter the Rule Set Description "This is a test Rounding Rule Set"
    Then User click on the Update Button to Add Rounding Rule Set