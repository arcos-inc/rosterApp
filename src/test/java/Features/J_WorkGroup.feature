Feature: Work Group Tab
  This feature file is used to create New Work Group

  @ZJ_CreateWorkGroup
  Scenario: Create New Work Group
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    Then User should click on Create New Work Group
    And User should enter work group "SAS003"
    And User should enter work group description "Test Work Group Description"
    And User should select the Seniority Rule
    And User should select the Shift Rule Set
    And User should select the PTO Rule Set
    And User should select the UTO Rule Set
    And User should select the VTO Slot Rule Set
    And User should select the Add Button

  @ZK_EditWorkGroup
  Scenario: Edit New Work Group
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    Then User should click on Edit Work Group
    And User should enter work group "SAS006"
    And User should enter work group description "Test Work Group Description"
    And User should select the Seniority Rule
    And User should select the Shift Rule Set
    And User should select the PTO Rule Set
    And User should select the UTO Rule Set
    And User should select the VTO Slot Rule Set
    And User should select the Update Button
    And User should select the Cancel Button

  @ZL_HideInactiveWorkGroups
  Scenario: Hide Inactive Work Group
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    Then User should click on Hide Inactive Work Group
