Feature: Qualifications Feature For Company Admin
  This Qualification feature deals with the Qualifications functionality of the application

  @ZB_CreateQualifications
  Scenario: Add Qualifications Feature For Company Admin
    Given User Should select Acting roles
    When User see the Qualifications Tab
    And User click on the Qualifications link text
    Then User is on the Qualifications Screen
    When User should click on the Create New Qualification
    Then User is on the New Qualification Screen
    And User enter the Code for New Qualification "001"
    And User enter the Description for New Qualification "This is a test Qualification"
    And User enter the Outside Code for New Qualification "001-AFY"
    And User check on the Is Active Checkbox
    Then User click on the Save Button to Add Qualification

  @ZC_EditQualifications
  Scenario: Edit Qualifications Feature For Company Admin
    Given User is on the Qualifications Screen
    When User should click on the Edit Qualification
    Then User is on the New Qualification Screen
    And User enter the Code for New Qualification "002"
    And User enter the Description for New Qualification "This is a test Qualification"
    And User enter the Outside Code for New Qualification "002-AFY"
    And User check on the Is Active Checkbox
    Then User click on the Save Button to Add Qualification