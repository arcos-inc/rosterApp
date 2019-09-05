Feature: Location Tab
  From this Feature user should able to create a New Location

  @B_LocationTab
  Scenario: Add New Location
    Given User Should select Acting roles
    When User see the Location Tab
    Then User should click on Create New Location
    When User gets the New Location Label
    Then User enter the Name
    And User enters "SASAN Test Location Description" Description
    And User select Time Zone
    And User select First day of Week
    And User mark/unmark check on Display Bid Packages
    And User mark check on Display Schedule Builder
    And User mark check on Display Shift Leveling
    And User mark check on Display Alternate Schedule Bidding
    And User mark check on Allow Multiple Shift Edit
    And User select New Employee Work Group
    And User select New Employee Status Code
    And User select New Employee Job Title
    And User click on Add Button

  @L_AddScheduleViewer
  Scenario: Add Schedule Viewer to this Location
#    Given User Should select Acting roles
    Given User see the Location Tab
    Then User should click on Schedule Viewer
    When User is on the Schedule Viewers Screen
    Then User click on the Add Schedule Viewer to this Location
    When User is on the Find New Schedule Viewer Screen
    And User find new schedule by last name "Shah"
    And User click on the Search Button
    And User select the new schedule viewer
    Then User click on the Create button

  @M_RemoveScheduleViewer
  Scenario: Remove Schedule Viewer
    Given User is on the Schedule Viewers Screen
    When User click on the Remove Link Text
    And User click on the OK Button

  @N_AddScheduleViewerToMultipleLocations
  Scenario: Add Schedule Viewer to Multiple Locations
    Given User is on the Schedule Viewers Screen
    Then User click on the Add Schedule Viewer to Multiple Location
    When User is on the Find New Schedule Viewer Screen
    And User find new schedule by last name "Shah"
    And User click on the Search Button
    And User select the new schedule viewer
    Then User click on the Next button
    When User is on the Find New Schedule Viewer Next Screen
    And User select multiple locations
    Then User click on the Create button

  @O_EditAssignment
  Scenario: Edit Assignment
    Given User is on the Schedule Viewers Screen
    When User click on the Edit Assignment link text
    Then User is on the Edit Schedule Viewer Screen
    And User edit locations
    Then User click on the Create button

  @P_EditProfile
  Scenario: Edit Profile
    Given User is on the Schedule Viewers Screen
    When User click on the Edit Profile link text
    Then User is on the Edit Profile Viewer Screen
    And User edit Profile "Asad"
    Then User click on the Update button
    And User click on the Cancel button

  @W_EditAccrualAccounts
  Scenario: Edit Accrual Accounts For Company Admin
#    Given User Should select Acting roles
    Given User see the Location Tab
    Then User should click on the Accrual Accounts
    When User is on the Accrual Accounts Screen
    Then User click on the All link text
    And User click on the None link text
    And User check on the Accrual Accounts checkbox
    Then User click on the Update Button to Update Accrual Account
#    Then User click on the Update Button to Cancel Accrual Account
