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

  @ZP_AddSkillsForEmployees
  Scenario: Add Skills For Employees Under Work Groups Tab
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    Then User click on the Add/Remove Skills For Employees
    When User is on the Add/Remove Skills for Employees
    And User click on the Add Skills Radio Button
    And User select skills
    And User select employees
    Then User click on the Submit button

  @ZQ_RemoveSkillsForEmployees
  Scenario:Remove Skills For Employees Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Skills For Employees
    Then User is on the Add/Remove Skills for Employees
    And User click on the Remove Skills Radio Button
    And User select skills
    And User select employees
    Then User click on the Submit button

  @ZR_AddQualificationsForEmployees
  Scenario: Add Qualifications For Employees Under Work Groups Tab
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    And User is on the Workgroup Page
    When User click on the Add Qualifications For Employees
    Then User is on the Add Qualifications For Employees
    And User select employees
    Then User click on the Update button to add Qualification

  @ZS_AddTradeWorkGroupsForEmployees
  Scenario: Add Trade Work Groups For Employees Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Trade Work Groups For Employees
    Then User is on the Add/Remove Trade Work Groups For Employees
    And User click on the Add Trade Radio Button
    And User select Date Effective
    And User select Shift Permissions
    And User select employees
    Then User click on the Submit button

  @ZT_RemoveTradeWorkGroupsForEmployees
  Scenario: Remove Trade Work Groups For Employees Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Trade Work Groups For Employees
    Then User is on the Add/Remove Trade Work Groups For Employees
    And User click on the Remove Trade Radio Button
    And User select Date Effective
    And User select Shift Permissions
    And User select employees
    Then User click on the Submit button

  @ZU_ResetOvertimeBank
  Scenario: Reset Overtime Bank Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Reset Overtime Bank
    Then User is on the Reset Overtime Bank
    And User select Date Effective
    And User select employees
    Then User click on the Submit button
