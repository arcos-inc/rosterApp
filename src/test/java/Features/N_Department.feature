Feature: Department Feature For Company Admin
  This Department feature deals with the Department functionality of the application

  @U_AddDepartment
  Scenario: Add Department For Company Admin
    Given User Should select Acting roles
    When User see the Departments Tab
    Then User should click on the Departments Tab
    When User is on the Departments Screen
    Then User click on the Create New Department
    When User is on the New Department Screen
    And User enter the Department Name "Finance Department"
    And User enter the Department Description "Deals with the Financial aspect"
    And User check the Allowed for Transfer Bidding checkbox
    And User check the Is Active checkbox
    Then User click on the Save Button

  @V_EditDepartment
  Scenario: Edit Department For Company Admin
    Given User is on the Departments Screen
    Then User click on the Edit Department
    When User is on the Edit Department Screen
    And User enter the Department Name "Account Department"
    And User enter the Department Description "Deals with the account aspect"
    And User check the Allowed for Transfer Bidding checkbox
    And User check the Is Active checkbox
    Then User click on the Save Button
