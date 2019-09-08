Feature: Employee Tab
  This feature file is used to create New Employee under any particular Work Group

  @ZZQ_EmployeeTab
  Scenario: Create New Employee
#    Given User should select acting role as Location Admin
    Given User see the Employee Tab
    Then User should select the Work Group from the DropDown
    And User should click on Create Employee link
    And User should enter the employee First Name
    And User should enter the employee Last Name
    And User should enter the employee User Name
    And User should enter the employee Password "test12345"
    And User should enter the employee Email Address "sastestemployeef@mailinator.com"
    And User should enter the employee Number
    And User should enter the CellPhone Number "0123456789"
    And User should select the employee Phone Carrier
    And User should select the employee Hair Date
    And User should select the Skill Set
    And User should select the Work Group
    And User should select the Job Title
    And User should select the Shift Rule Set from the DropDown
    And User should select the PTO Rule Set from the DropDown
    And User should select the UTO Rule Set from the DropDown
    And User should select the VTO Slot Rule Set form the DropDown
    And User should select the Trade Work Group
    And User should enter Employee Note "SAS Test Employee Notes"
    And User should click on Create Button

  @ZZR_FilterAllEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    Then User should click on the Filter Dropdown to select all employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZZS_FilterActiveEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    Then User should click on the Filter Dropdown to select Active employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZZT_FilterInactiveEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    Then User should click on the Filter Dropdown to select Inactive employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZZU_CreateNotes
  Scenario: Create Notes For Location Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Add Notes Text Link
    Then User should be on the Notes for Employee Screen
    And User click on the Create new note Text link
    And User add note "Employee is on work"
    And User click on the OK Button to save note
    Then User click on the Cancel button to return on the Edit Employee Screen
    Then User click on the Cancel button to return on the Edit Employee Screen

  @ZZV_AddNotes
  Scenario: Add Filter Feature For Company Admin to filter Employee
    Given User is on the Employees Screen
    When User should click on the Notes
    Then User should be on the Notes for Employee Screen
    And User click on the checkbox
    And User click on the Update Button to save update
    Then User click on the Cancel button to return on the Edit Employee Screen

  @ZZW_EditOvertimeBank
  Scenario: Edit Overtime Bank Feature For Location Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Overtime Bank Text Link
    Then User should be on the Edit Overtime Bank for Employee Screen
    And User Select the Adjustment Date
    And User enter the hours "1.00"
    And User enter the comments "The following hours increases"
    And User click on the Apply and Return button

  @ZZX_EditSkills
  Scenario: Edit Skills Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Skills Link Text
    Then User is on the Edit Skills Screen
    And User check on the checkboxes to update skills
    And User click on the Update button to update Skills

  @ZZY_EditQualifications
  Scenario: Edit Qualifications Feature For Location Admin under Employees tab
    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Qualifications Link Text
    Then User is on the Edit Qualifications Screen
    When User click on the Add New Qualification Link Text
    Then User is on the Add Qualification Screen
    And User click on the Code Dropdown to select the code
    And User click on the Add Button to add Qualification

  @ZZZ_EditNewQualifications
  Scenario: Edit New Qualifications Feature For Location Admin under Employees tab
    Given User is on the Edit Qualifications Screen
    When User click on the Edit New Qualification Link Text
    Then User is on the Edit Qualification Screen
    And User click on the remove button to remove Qualification
    And User click on the Employees tab
    And User is on the Employees Screen Again
    When User should click on the Edit Employee

  @ZZZA_EditTradeWorkGroups
  Scenario: Edit Trade Work Groups Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Trade Work Groups Link Text
    Then User is on the Edit Trade Work Groups Screen
    When User select from the Available group
    And User click on the Update button to update Trade Work Group

  @ZZZB_EditPayRate
  Scenario: Edit Pay Rate Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Pay Rate Link Text
    Then User is on the Edit Pay Rate Screen
    When User enter the Pay Rate "2.00"
    And User click on the Update button to update Pay Rate

  @ZZZC_EditJobTitle
  Scenario: Edit Job Title Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Job Title Link Text
    Then User is on the Edit Job Title Screen
    When User select Job Title from the dropdown
    And User click on the Update button to update Job Title

  @ZZZD_EditEmployeeStatus
  Scenario: Edit Employee Status Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Employee Status Link Text
    Then User is on the Edit Employee Status Screen
    When User select Employee Status from the dropdown
    And User click on the Update button to update Employee Status

  @ZZZE_EditEmployeeCostCenter
  Scenario: Edit Employee Cost Center Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Employee Cost Center Link Text
    Then User is on the Edit Employee Cost Center Screen
    When User select Employee Cost Center from the dropdown
    And User click on the Update button to update Employee Cost Center
    Then User click on the Cancel button to return on the Edit Employee Screen

  @ZZZF_EditCross-TrainedDepartments
  Scenario: Edit Cross-Trained Departments Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Cross-Trained Departments Link Text
    Then User is on the View Cross-Trained Departments Screen
    And User click on the Done button to update Cross-Trained Departments

  @ZZZG_ViewDependabilityHistory
  Scenario: View Dependability History Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the View Dependability History Link Text
    Then User is on the View Dependability History Screen
    And User click on the Done button to update View Dependability History

  @ZZZH_EditEmployeeScheduleAvailability
  Scenario: Edit Employee Schedule Availability Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Employee Schedule Availability Link Text
    Then User is on the Availability Patterns Screen
    And User click on the View Link Text
    And User click on the Return Button
    And User click on the Done button to return on the Edit Employee Screen

  @ZZZI_EditRuleSets
  Scenario: Edit Rule Sets Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee
    Then User should be on Edit Employee Screen
    When User should click on the Edit Rule Sets Link Text
    Then User is on the Edit Rule Sets Screen
    And User select Shift Rule Set
    And User select PTO Rule Set
    And User select UTO Rule Set
    And User select VTO Slot Rule Set
    And User select Dependability Rule Set
    And User click on the Update button to Update Rule Sets
    Then User click on the Cancel button to return on the Edit Employee Screen

  @ZZZJ_TerminateEmployee
  Scenario: Terminate Employee Feature For Location Admin under Employees tab
#    Given User Should select Acting roles as Loc Admin
    Given User is on the Employees Screen
    When User should click on the Edit Employee to terminate
    Then User should be on Edit Employee Screen
    When User should click on the Terminate Employee Link Text
    Then User is on the Terminate Employee Screen
    And User select the status of the employee termination
    And User click on the Terminate Button

