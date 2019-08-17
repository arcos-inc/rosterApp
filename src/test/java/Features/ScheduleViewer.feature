Feature: Schedule Viewer Feature For Company Admin
  This Schedule Viewer feature deals with the schedule viewing functionality of the application

  @L_ScheduleViewer
  Scenario: Add Schedule Viewer to this Location
    Given User Should select Acting roles
    When User see the Location Tab
    Then User should click on Schedule Viewer
    When User is on the Schedule Viewers Screen
    Then User click on the Add Schedule Viewer to this Location
    When User is on the Find New Schedule Viewer Screen
    And User find new schedule by last name "Shah"
    And User click on the Search Button
    And User select the new schedule viewer
    Then User click on the Create button