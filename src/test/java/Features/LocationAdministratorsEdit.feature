@LocationAdministratorsEdit

Feature: Location Administrators Edit
  This Feature File is used to Edit Administrator to selected Location

  Background: Login Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario: Location Administrator - Edit Profile
    Given User should be on Location Administrator page
    And User clicks on Edit Profile
    Then User should navigate to Edit Administrator page with Profile info and permissions
    And User should be able to edit existing admin first name
    And User should be able to check Supervisor View
    And User should be able to check Supervisor Change
    And User should be able to check Employee View
    And User should be able to check Employee Change
    And User should be able to check Co-Workers View
    And User should be able to edit Username
    And User should be able to edit Password
    And User should be able to check Change password on Next Login
    And User should be able to edit Email Address
    And User should be able to edit Employee Number
    And User should be able to select Phone Carrier from the dropdown
    And User should be able to select Hire Date from calendar
    And User should be able to Choose File for Profile Picture