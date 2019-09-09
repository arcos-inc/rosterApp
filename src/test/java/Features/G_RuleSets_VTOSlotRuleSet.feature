Feature: VTO Slot Rule Sets
  This feature file is used to create New VTO Slot Rule Sets

  @N_VTOSlotRuleSet
  Scenario Outline: Create New VTO Slot Rule Set
    Given User should be login as a Company Admin
    When User should be able to click on Create New VTO Slot Rule Set
    Then User should be navigated to New VTO Slot Rule Set page
    And User should be able to enter VTOSlot "<RuleSetName>"
    And User should be able to check Can Claim VTO Slot
    And User should be able to check Can Supervisor Override Rules
    Then User should be able to click Add button

    Examples:
      | RuleSetName             |
      | SAS12 Std VTO Slot Rules |