@JobTitleTab

Feature: Job Title Tab
  From this Feature user should able to Add New Job Titles

  Background: Login Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario: Add New Job Title
    Given User is on Job Titles Tab
    When User click on create new Job Title
    Then User should see the New Job Title Window
    And User should enter the Short Description "SAS1"
    And User should enter the Description "SAS1 This is the Test Description"
    And User should select the Department
    And User click on Add Job Title button
