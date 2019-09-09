Feature: Job Title Tab
  From this Feature user should able to Add New Job Titles

  @J_JobTitleTab
  Scenario: Add New Job Title
    Given User is on Job Titles Tab
    When User click on create new Job Title
    Then User should see the New Job Title Window
    And User should enter the Short Description "SAS24"
    And User should enter the Description "SAS24 This is the Test Description"
    And User should select the Department
    And User click on Add Job Title button
