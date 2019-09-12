Feature: Settings Feature For Company Admin
  This Settings feature deals with the Company Settings functionality of the application

  @ZD_EditEmployeeProfileSettings
  Scenario: Edit Employee Profile Settings Feature For Company Admin
#    Given User Should select Acting roles
#    When User see the Settings Tab
#    And User click on the Settings Tab
#    Then User is on the Settings Screen
    Given User see the Settings Tab
    When User click on the Settings Tab
    Then User is on the Settings Screen
    When User should click on the Edit Employee Profile Settings
    Then User is on the Edit Employee Profile Settings Screen
    And User make some changes to profile settings
    Then User click on the Update Button to update Settings

  @ZE_NewAbsentReason
  Scenario: New Absent Reason Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Absent Reasons Link Text
    Then User is on the Edit Absent Reasons Screen
    And User should click on the Create New Absent Reason
    Then User is on the New Absent Reason Screen
    And User enter the Absent Reason Code
    And User enter the Absent Reason Description
    And User enter the Display Order for Absent Reason "1"
    And User click on the Add Button to add Absent Reason
#    And User click on the Cancel Button to return to the Settings Screen

  @ZF_EditAbsentReasons
  Scenario: Edit Absent Reasons Feature For Company Admin
#    Given User is on the Settings Screen
#    When User should click on the Edit Absent Reasons Link Text
#    Then User is on the Edit Absent Reasons Screen
    Given User should click on the Edit Link Text
    Then User is on the Edit Absent Reason Screen
    And User enter the Absent Reason Code
    And User enter the Absent Reason Description
    And User enter the Display Order for Absent Reason "3"
    And User click on the Update Button to Update Absent Reason
    And User click on the Cancel Button to return to the Settings Screen

  @ZG_NewPaidTimeOffReason
  Scenario: New Paid Time Off Reason Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Paid Time Off Reasons Link Text
    Then User is on the Paid Time Off Reasons Screen
    And User should click on the New Paid Time Off Reason Link Text
    Then User is on the New Paid Time Off Reason Screen
    And User enter the Paid Time Reason Code
    And User enter the Paid Time Reason Description
    And User enter the Display Order for Paid Time Reason "1"
    And User click on the Add Button to add Paid Time Reason
#    And User click on the Cancel Button to return to the Settings Screen

  @ZH_EditPaidTimeOffReason
  Scenario: New Paid Time Off Reason Feature For Company Admin
#    Given User is on the Settings Screen
#    When User should click on the Edit Paid Time Off Reasons Link Text
#    Then User is on the Paid Time Off Reasons Screen
    Given User should click on the Edit Paid Time Off Link Text
    Then User is on the Edit Paid Time Off Reason Screen
    And User enter the Paid Time Reason Code
    And User enter the Paid Time Reason Description
    And User enter the Display Order for Paid Time Reason "3"
    And User click on the Update Button to Update Paid Time Reason
    And User click on the Cancel Button to return to the Settings Screen

  @ZI_NewOvertimeReasons
  Scenario: New Overtime Reasons Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Overtime Reasons Link Text
    Then User is on the Overtime Reasons Screen
    And User should click on the New Overtime Reason Link Text
    Then User is on the New Overtime Reason Screen
    And User enter the Paid Time Reason Code
    And User enter the Paid Time Reason Description
    And User enter the Display Order for Overtime Reasons "1"
    And User click on the Add Button to add Overtime Reason
#    And User click on the Cancel Button to return to the Settings Screen

  @ZJ_EditOvertimeReasons
  Scenario: Edit Overtime Reasons Feature For Company Admin
#    Given User is on the Settings Screen
#    When User should click on the Edit Overtime Reasons Link Text
#    Then User is on the Overtime Reasons Screen
    Given User should click on the Edit Overtime Reason Link Text
    Then User is on the Edit Overtime Reason Screen
    And User enter the Paid Time Reason Code
    And User enter the Paid Time Reason Description
    And User enter the Display Order for Overtime Reasons "3"
    And User click on the Update Button to Update Overtime Reason
    And User click on the Cancel Button to return to the Settings Screen

  @ZK_NewUnauthorizedHoursReasons
  Scenario: New Unauthorized Hours Reasons Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Unauthorized Hours Reasons Link Text
    Then User is on the Unauthorized Hours Reasons Screen
    And User should click on the New Unauthorized Hours Reason Link Text
    Then User is on the New Unauthorized Hours Reason Screen
    And User enter the Paid Time Reason Code
    And User enter the Paid Time Reason Description
    And User enter the Display Order for Unauthorized Hours Reason "1"
    And User click on the Add Button to add Unauthorized Hours Reason
#    And User click on the Cancel Button to return to the Settings Screen

  @ZL_EditUnauthorizedHoursReasons
  Scenario: Edit Unauthorized Hours Reasons Feature For Company Admin
#    Given User is on the Settings Screen
#    When User should click on the Edit Unauthorized Hours Reasons Link Text
#    Then User is on the Unauthorized Hours Reasons Screen
    Given User should click on the Edit Unauthorized Hours Link Text
    Then User is on the Edit Unauthorized Hours Reasons Screen
    And User enter the Paid Time Reason Code
    And User enter the Paid Time Reason Description
    And User enter the Display Order for Unauthorized Hours Reason "3"
    And User click on the Update Button to Update Unauthorized Hours Reason
    And User click on the Cancel Button to return to the Settings Screen

  @ZM_EditPasswordPolicy
  Scenario: Edit Password Policy Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Password Policy Link Text
    Then User is on the Edit Password Policy Screen
    And User check on the checkboxes to update Password Policy
    And User click on the Update Button to Update Password Policy

  @ZN_EditCompanyTerminology
  Scenario: Edit Company Terminology Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Company Terminology Link Text
    Then User is on the Edit Company Terminology Screen
    And User enter the Department "Department"
    And User enter the Dependability Point "Dependability Occurance"
    And User enter the Disciplinary Action "Disciplinary Action"
    And User click on the Update Button to Update Company Terminology Settings

  @ZO_EditQuarterDates
  Scenario: Edit Quarter Dates Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Quarter Dates Link Text
    Then User is on the Edit Quarter Dates Screen
    And User select options from dropdown to Edit Quarter Start Dates
    And User click on the Save Button to Save Quarter Dates

    @ZP_AddNewSeniorityRankRule
    Scenario: Add New Seniority Rank Rule Feature For Company Admin
      Given User is on the Settings Screen
      When User should click on the Edit Seniority Rank Link Text
      Then User is on the Seniority Rank Rules Screen
      When User should click on the Add New Seniority Rank Rule Link Text
      Then User is on the New Seniority Rule Screen
      And User enter the Seniority Rule Name "Company Hire Date"
      And User select Main Seniority Rank
      And User click on the Save Button to Save Seniority Rule
#      And User click on the Done Button to Save Seniority Rule

  @ZQ_EditSeniorityRankRule
  Scenario: Edit Seniority Rank Rule Feature For Company Admin
#    Given User is on the Settings Screen
#    When User should click on the Edit Seniority Rank Link Text
#    Then User is on the Seniority Rank Rules Screen
    Given User should click on the Edit Seniority Rank Rule Link Text
    Then User is on the New Seniority Rule Screen
    And User enter the Seniority Rule Name "Company Hire Date"
    And User select Main Seniority Rank
    And User click on the Save Button to Save Seniority Rule
    And User click on the Done Button to Save Seniority Rule

  @ZR_AddNewBreakClassification
  Scenario: Add New Break Classification Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Break Classifications Link Text
    Then User is on the Break Classification Screen
    When User should click on the Add New Break Classification Link Text
    Then User is on the New Break Classification Screen
    And User enter the Break Classification Name "Test Break Classification Name"
    And User enter the Break Classification Description "Test Break Classification Description"
    And User select Locations for Break Classification
    And User click on the Save Button to Save Break Classification
#    And User click on the Done Button to Save Break Classification

  @ZS_EditBreakClassification
  Scenario: Edit Break Classification Feature For Company Admin
#    Given User is on the Settings Screen
#    When User should click on the Edit Break Classifications Link Text
#    Then User is on the Break Classification Screen
    Given User should click on the Edit Break Classification Link Text
    Then User is on the Edit Break Classification Screen
    And User enter the Break Classification Name "Test Break Classification Name"
    And User enter the Break Classification Description "Test Break Classification Description"
    And User select Locations for Break Classification
    And User click on the Save Button to Save Break Classification
    And User click on the Done Button to Save Break Classification

  @ZT_EditDefaultBreakSettings
  Scenario: Edit Default Break Settings Feature For Company Admin
    Given User is on the Settings Screen
    When User should click on the Edit Default Break Settings Link Text
    Then User is on the Edit Default Break Settings Screen
    And User enter the Shift Hours "5"
    And User enter the Break Length "3"
    Then User click on the Update Button to update Break Settings

  @ZU_AddNewAccrualAccount
  Scenario: Add New Accrual Account Feature For Company Admin
    Given User Should select Acting roles
    When User see the Settings Tab
    And User click on the Settings Tab
    Then User is on the Settings Screen
    When User should click on the Edit Accrual Accounts Link Text
    Then User is on the Accrual Accounts Screen For Company Admin
    When User should click on the Create New Accrual Account Link Text
    Then User is on the New Accrual Account Screen
    And User enter the Accrual Account Name ""
    And User enter the Accrual Account Display Order ""
    Then User click on the Add Button to Add Accrual Account