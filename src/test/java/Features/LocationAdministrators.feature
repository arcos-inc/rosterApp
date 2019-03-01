@LocationAdministrators

Feature: Location Administrators
  This Feature File is used to Add Administrator to this Location or to Multiple Locations

  Background: Login Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario: Add Administrator to Selected Location
    Given User should be on Location Administrator page
    When User click on Add Administrator to this Location
    Then Find New Location Administrator search box will appear
    And User should enter the Registered Administrator name
    And User should press the search button
    Then List of Registered Administrators will display
    And User should select the Administrator
    And User should press the Create Button

  Scenario: Add Administrator to Multiple Locations
    When User click on Add Administrator to Multiple Locations
    Then Find New Location Administrator search box will appear
    And User should enter the Registered Administrator name
    And User should press the search button
    Then List of Registered Administrators will display
    And User should select the Administrator
    And User should press Next Button
    And User should press the Create Button
