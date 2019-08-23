Feature: Dependability Rule Sets Feature For Company Admin
  This Rule Sets feature deals with the Dependability functionality of the application

  @Z_CreateDependabilityRuleSet
  Scenario: Add Dependability Rule Sets Feature For Company Admin
    Given User Should select Acting roles
    When User see the Rule Sets Tab
    And User click on the Rule Sets link text
    Then User is on the Company Rule Sets Screen
    When User should click on the Create New Dependability Rule Set
    Then User is on the New Dependability Rule Set Screen
    And User enter the Dependability Rule Set Name "Dummy Dependability Rule Set"
    And User enter the Dependability Rule Set Description "This is a test Dependability Rule Set"
    And User check on the Expire points on a rolling basis
    And User enter the Points valid for "12"
    And User select an option of month
    And User check on the Freeze Points
    Then User click on the Save Button to Add Dependability Rule Set