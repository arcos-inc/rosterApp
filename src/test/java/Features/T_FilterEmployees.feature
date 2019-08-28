Feature: Filter Feature For Company Admin
  This Filter feature deals with the Filter functionality of the application

  @ZG_FilterAllEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
    Given User Should select Acting roles as Loc Admin
    When User is on the Employees Screen
    Then User should click on the Filter Dropdown to select all employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZH_FilterActiveEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
    Given User Should select Acting roles as Loc Admin
    When User is on the Employees Screen
    Then User should click on the Filter Dropdown to select Active employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"

  @ZI_FilterInactiveEmployees
  Scenario: Add Filter Feature For Company Admin to filter Employee
    Given User Should select Acting roles as Loc Admin
    When User is on the Employees Screen
    Then User should click on the Filter Dropdown to select Inactive employees
    And User should click on the Workgroup Dropdown
#    And User enter the Employee Name "Azfar"