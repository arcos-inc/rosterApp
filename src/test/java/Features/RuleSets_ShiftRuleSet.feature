@Template

Feature: Template
  This is a Template Feature File used to create other Feature File, just create a copy of this Template and Rename it.

  Background: Login Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario Outline: Create New Paid Time Off Rule Set
    Given User should be login as a Company Admin
    And User should be on Rule Set Tab
    When User clicks on Create New Shift Rule Set
    Then User should be navigated to New Shift Rule Set page
    And User should be able to enter <RuleSetName>
    And User should be able to enter <MinHrs> for Before Shift Trade
    And User should be able to enter <MaxHrs> for Before Shift Trade
    And User should be able to check Trade Board Post Approval Required
    And User should be able to check Trade Board Shift Trade Claim Approval Required
    And User should be able to check Trade Board Overtime Claim Approval Required
    And User should be able to check One Way Trade Approval Required
    And User should be able to check Two Way Trade Approval Required
    And User should be able to check One Way Block Trade Approval Required
    And User should be able to check Two Way Block Trade Approval Required
    And User should be able to check Recurring Shift Trade Approval Required
    And User should be able to check Can Receive An Open Shift Matching Original Shift Start/End
    And User should be able to enter Max Shift <Overlap> hours
    And User should be able to enter Max Shift Overlap For <SplitShifts> hours
    And User should be able to enter Max Shift Overlap For <Day>
    And User should be able to enter Max <WeekWorkHrs>
    And User should be able to enter Max Overtime <QualifiedHrs> per Week
    And User should be able to enter Max Work Hours <InWindow>
    And User should be able to enter <WindowHrs> for Max Work Hours
    And User should be able to enter Max <Consecutive> Work Days
    And User should be able to enter Min <ContinuousRest> Hours Before First Shift of Day
    And User should be able to enter Min <ShiftSegment> After Split hours
    And User should be able to enter Max <TimesShiftCanBeSplit> Can Be Split
    And User should be able to enter If Automatically Handling Breaks Put <BreakWithSegment> Longer Than hrs
    And User should be able to check Supervisor Must Assign Reason For Overtime
    And User should be able to check Supervisor Can Post Overtime Shifts To Bid Board
    And User should be able to check Eligible For Overtime
    And User should be able to check Supervisor Can Override Adding Hours To OT Bank When Assigning
    And User should be able to check Can Sign Up For Overtime
    And User should be able to enter User Max Weeks Advance <SignUpForOT>
    And User should be able to check Supervisor Can Act For Employee
    And User should be able to check Supervisor Can Override Rules
    And User should be able to check Supervisor Can Unassign Shift
    And User should be able to check Follow Airline Rules For Overtime
    And User should be able to check Allow Employee To View Description
    And User should be able to check Can Supervisor View Hrs
    And User should be able to check Can Schedule Viewer View Hrs
    Then User should be able to click on Add button successfully

    Examples:
      | RuleSetName | MinHrs | MaxHrs | Overlap | SplitShifts | Day | WeekWorkHrs | QualifiedHrs | InWindow | WindowHrs | Consecutive | ContinuousRest | ShiftSegment | TimesShiftCanBeSplit | BreakWithSegment | SignUpForOT |
      | COPSHoliday | 48     | 720    | 0.5     | 0.5         | 0.5 | 60          | 60           | 16       | 24        | 6           | 8              | 0.5          | 20                   | 4.99             | 9           |