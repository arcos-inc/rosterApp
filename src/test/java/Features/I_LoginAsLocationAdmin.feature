Feature: Login Feature For Location Admin
  This login feature deals with the login functionality of the application

  @I_LoginAsLocationAdmin
  Scenario: Login as a Location Administrator
    Given User is on Application Login Page
    When User click on Admin Login DropDown
    And User select role as a Location Admin
    And User click on the Location
    And User select location
    And User click on login button
    Then User is on Application home page