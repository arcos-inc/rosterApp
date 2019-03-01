@JobTitleTab_Edit

Feature: Job Title Tab Edit
  This feature is used to edit the existing Job Titles

  Background: Login Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario: Edit Existing Job Title
    Given User should on Job Title Page
    When User click on Edit link of an existing Job Title
    Then User should see the Edit Job Title
    And User should edit existing record
    And User should press update button

