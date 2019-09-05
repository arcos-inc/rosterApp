Feature: Employee Tab
  This feature file is used to create New Employee under any particular Work Group

  @ZZQ_EmployeeTab
  Scenario: Create New Employee
    Given User should select acting role as Location Admin
    When User see the Employee Tab
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
    Given User Should select Acting roles as Loc Admin
    When User is on the Employees Screen
    Then User should click on the Filter Dropdown to select all employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZZS_FilterActiveEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
    Given User Should select Acting roles as Loc Admin
    When User is on the Employees Screen
    Then User should click on the Filter Dropdown to select Active employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZZT_FilterInactiveEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
    Given User Should select Acting roles as Loc Admin
    When User is on the Employees Screen
    Then User should click on the Filter Dropdown to select Inactive employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"
