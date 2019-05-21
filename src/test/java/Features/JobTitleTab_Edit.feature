Feature: Job Title Tab Edit
  This feature is used to edit the existing Job Titles

  @JobTitleTab_Edit
  Scenario: Edit Existing Job Title
    Given User should on Job Title Page
    When User click on Edit link of an existing Job Title
    Then User should see the Edit Job Title
    And User should edit existing record
    And User should press update button

