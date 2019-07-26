Feature: Login Feature For Company Admin
  This login feature deals with the login functionality of the application

  @A_LoginAsCompanyAdmin
  Scenario: Login As a Company Administrator
    Given User is on Application Login Page
#    And I enter the following details for login
#      | username               | password |
#      | shussain@arcos-int.com | Pass@123 |
    When User click on Admin Login DropDown
    And User select role as a Company Admin
    And User should select Admin User
    And User click on login button
    Then User is on Application home page

  @A_LoginAsSupervisor
  Scenario: Login as a Supervisor
    When User click on Admin Login DropDown
    And User select role as a Supervisor
    And User click on login button
    Then User is on Application home page

  @A_LoginAsEmployee
  Scenario: Login as a Employee
    When User click on Admin Login DropDown
    And User select role as a Employee
    And User click on login button
    Then User is on Application home page