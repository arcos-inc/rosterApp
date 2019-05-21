Feature: Employee Tab
  This feature file is used to create New Employee under any particular Work Group

  @K_EmployeeTab
  Scenario Outline: Create New Employee
    Given User should select acting role as Location Admin
    When User see the Employee Tab
    Then User should select the Work Group from the DropDown
    And User should click on Create Employee link
    And User should enter the employee First Name "<fname>"
    And User should enter the employee Last Name "<lname>"
    And User should enter the employee User Name "<userName>"
    And User should enter the employee Password "<pass>"
    And User should enter the employee Email Address "<email>"
    And User should enter the employee Number "<num>"
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
    And User should enter Employee Note "<note>"
    And User should click on Create Button

    Examples:
      | fname          | lname | userName        | pass      | email                          | num    | note                    |
      | SAS Employee A | Test  | sasTestEmployee | test12345 | sastestemployee@mailinator.com | SAS002 | SAS Test Employee Notes |

