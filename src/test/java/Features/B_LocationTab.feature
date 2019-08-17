Feature: Location Tab
  From this Feature user should able to create a New Location

  @B_LocationTab
  Scenario: Add New Location
    Given User Should select Acting roles
    When User see the Location Tab
    Then User should click on Create New Location
    When User gets the New Location Label
    Then User enters "SASANISD" the Name
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




