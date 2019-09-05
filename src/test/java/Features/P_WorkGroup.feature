Feature: Work Group Tab
  This feature file is used to create New Work Group

  @ZZB_CreateWorkGroup
  Scenario: Create New Work Group
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    Then User should click on Create New Work Group
    And User should enter work group
    And User should enter work group description "Test Work Group Description"
    And User should select the Seniority Rule
    And User should select the Shift Rule Set
    And User should select the PTO Rule Set
    And User should select the UTO Rule Set
    And User should select the VTO Slot Rule Set
    And User should select the Add Button

  @ZZC_EditWorkGroup
  Scenario: Edit New Work Group
#    Given User Should select Acting roles as Loc Admin
#    When User see the Work Group Tab
    Given User is on the Workgroup Page
    When User should click on Edit Work Group
    And User should enter work group
    And User should enter work group description "Test Work Group Description"
    And User should select the Seniority Rule
    And User should select the Shift Rule Set
    And User should select the PTO Rule Set
    And User should select the UTO Rule Set
    And User should select the VTO Slot Rule Set
    And User should select the Update Button
    And User should select the Cancel Button

  @ZZD_HideInactiveWorkGroups
  Scenario: Hide Inactive Work Group
#    Given User Should select Acting roles as Loc Admin
#    When User see the Work Group Tab
    Given User is on the Workgroup Page
    When User should click on Hide Inactive Work Group

  @ZZE_AddSkillsForEmployees
  Scenario: Add Skills For Employees Under Work Groups Tab
#    Given User Should select Acting roles as Loc Admin
#    When User see the Work Group Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Skills For Employees
    When User is on the Add/Remove Skills for Employees
    And User click on the Add Skills Radio Button
    And User select skills
    And User select employees
    Then User click on the Submit button

  @ZZF_RemoveSkillsForEmployees
  Scenario:Remove Skills For Employees Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Skills For Employees
    Then User is on the Add/Remove Skills for Employees
    And User click on the Remove Skills Radio Button
    And User select skills
    And User select employees
    Then User click on the Submit button

  @ZZG_AddQualificationsForEmployees
  Scenario: Add Qualifications For Employees Under Work Groups Tab
#    Given User Should select Acting roles as Loc Admin
#    When User see the Work Group Tab
    Given User is on the Workgroup Page
    When User click on the Add Qualifications For Employees
    Then User is on the Add Qualifications For Employees
    And User select employees
    Then User click on the Update button to add Qualification

  @ZZH_AddTradeWorkGroupsForEmployees
  Scenario: Add Trade Work Groups For Employees Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Trade Work Groups For Employees
    Then User is on the Add/Remove Trade Work Groups For Employees
    And User click on the Add Trade Radio Button
    And User select Date Effective
    And User select Shift Permissions
    And User select employees
    Then User click on the Submit button

  @ZZI_RemoveTradeWorkGroupsForEmployees
  Scenario: Remove Trade Work Groups For Employees Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Add/Remove Trade Work Groups For Employees
    Then User is on the Add/Remove Trade Work Groups For Employees
    And User click on the Remove Trade Radio Button
    And User select Date Effective
    And User select Shift Permissions
    And User select employees
    Then User click on the Submit button

  @ZZJ_ResetOvertimeBank
  Scenario: Reset Overtime Bank Under Work Groups Tab
    Given User is on the Workgroup Page
    When User click on the Reset Overtime Bank
    Then User is on the Reset Overtime Bank
    And User select Date Effective
    And User select employees
    Then User click on the Submit button

  @ZZK_AddSupervisor
  Scenario: Add Supervisor to this Location
    Given User Should select Acting roles as Loc Admin
    When User see the Work Group Tab
    Then User should click on Supervisors Link Text
    When User is on the Supervisors Screen
    Then User click on the Add Supervisor to this Work Group
    When User is on the Find New Supervisor Screen
    And User find new schedule by last name of Supervisor "Shah"
    And User click on the Search Button to Find a New Supervisor
    And User select the new Supervisor
    Then User click on the Create button

  @ZZL_RemoveSupervisor
  Scenario: Remove Supervisor
    Given User is on the Supervisors Screen
    When User click on the Remove Link Text on Supervisor Screen
    And User click on the OK Button on Supervisor Screen

  @ZZM_AddSupervisorToMultipleLocations
  Scenario: Add Supervisor to Multiple Locations
    Given User is on the Supervisors Screen
    Then User click on the Add Supervisor to Multiple Work Groups
    When User is on the Find New Supervisor Screen
    And User find new schedule by last name of Supervisor "Shah"
    And User click on the Search Button to Find a New Supervisor
    And User select the new Supervisor
    Then User click on the Next button on Supervisor Screen
    When User is on the Find New Supervisor Next Screen
    And User select multiple locations on Supervisor Screen
    Then User click on the Create button to add Supervisor

  @ZZN_RemoveSupervisor
  Scenario: Remove Supervisor
    Given User is on the Supervisors Screen
    When User click on the Remove Link Text on Supervisor Screen
    And User click on the OK Button on Supervisor Screen

  @ZZO_EditAssignment
  Scenario: Edit Assignment
    Given User is on the Supervisors Screen
    When User click on the Edit Assignment link text on Supervisor Screen
    Then User is on the Edit Supervisor Screen
    And User edit locations on Supervisor Screen
    Then User click on the Create button to add Supervisor

  @ZZP_EditProfile
  Scenario: Edit Profile
    Given User is on the Supervisors Screen
    When User click on the Edit Profile link text on Supervisor Screen
    Then User is on the Edit Supervisor Profile Screen
    And User edit Profile on Supervisor Screen
    Then User click on the Update button to add Supervisor