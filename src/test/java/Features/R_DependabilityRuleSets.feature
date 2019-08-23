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
    And User enter the Dependability Rule Set Name "TEST RULE SET"
    And User enter the Dependability Rule Set Description "This is a test Dependability Rule Set"
    And User check on the Expire points on a rolling basis
    And User enter the Points valid for "12"
    And User select an option of Seconds
    And User check on the Freeze Points
    Then User click on the Save Button to Add Dependability Rule Set

  @ZA_EditDependabilityRuleSet
  Scenario: Edit Dependability Rule Sets Feature For Company Admin
    Given User Should select Acting roles
    When User see the Rule Sets Tab
    And User click on the Rule Sets link text
    Then User is on the Company Rule Sets Screen
    When User should click on the Edit New Dependability Rule Set
    Then User is on the New Dependability Rule Set Screen
    And User enter the Dependability Rule Set Name "Dummy Dependability Rule Set"
    And User enter the Dependability Rule Set Description "This is a test Dependability Rule Set"
    And User check on the Expire points on a rolling basis
    And User enter the Points valid for "9"
    And User select an option of day
    And User check on the Freeze Points
    And User check on the dependability history
    And User check on the dependability occurances
    And User check on the disciplinary actions
    And User click on the Add new dependability occurance rule
    And User enter Add dependability Name "Test Rule"
    And User check on the Infraction Types
    And User check on the Absent Reasons
    And User check on the Shift Classifications
    And User enter the Points "2"
    And User enter the Min Length of Absence "2"
    And User enter the Max Length of Absence "4"
    And User select an option from dropdown
    And User select an option from dropdown of Max length
    Then User click on the Done Button to Add dependability occurance rule
    And User click on the Save Button to Add Dependability Rule Set