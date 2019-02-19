@EditLocationTab

Feature: EditLocationTab
  From this Feature user should able to edit Existing Location

  Background: Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario: Edit Existing Locations
    When User click on Edit link of an existing location
    Then User should see the edit location window
    And User should edit details and rules
    And User should click on Add button