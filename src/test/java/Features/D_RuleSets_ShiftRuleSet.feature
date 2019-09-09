Feature: Shift Rule Sets
  From This Feature File User Should Able to Create or Shift Rule Set

  @K_ShiftRuleSet
  Scenario Outline: Create New Shift Rule Set Rule Set
    Given User should be login as a Company Admin
    And User should be on Rule Set Tab
    When User clicks on Create New Shift Rule Set
    Then User should be navigated to New Shift Rule Set page
    And User should be able to enter "<RuleSetName>"
    And User should be able to enter "<MinHrs>" for Before Shift Trade
    And User should be able to enter "<MaxHrs>" for Before Shift Trades
    And User should be able to check Can Receive Trades
    And User should be able to check Can Trade Away Shifts
    And User should be able to check Can Post To Trade Board
    And User should be able to check Trade Board Post Approval Required
    And User should be able to check Can Claim Shift Trade From Trade Board
    And User should be able to check Trade Board Shift Trade Claim Approval Required
    And User should be able to check Can One Way Trade
    And User should be able to check One Way Trade Approval Required
    And User should be able to check Can Two Way Trade
    And User should be able to check Two Way Trade Approval Required
    And User should be able to check Can Block Trade One Way
    And User should be able to check Can Block Trade Two Way
    And User should be able to check One Way Block Trade Approval Required
    And User should be able to check Two Way Block Trade Approval Required
    And User should be able to check Can Request Recurring Shift Trades
    And User should be able to check Recurring Shift Trade Approval Required
    And User should be able to enter Max Shift Overlap For "<SplitShifts>" hours
    And User should be able to enter Max Shift Overlap For "<Day>"
    And User should be able to enter Max "<WeekWorkHrs>"
    And User should be able to enter Max Overtime "<QualifiedHrs>" per Week
    And User should be able to enter Max Work Hours "<InWindow>"
    And User should be able to enter "<WindowHrs>" for Max Work Hours
    And User should be able to enter Max "<Consecutive>" Work Days
    And User should be able to enter Min "<ContinuousRest>" Hours Before First Shift of Day
    And User should be able to check Can Employee Split Shift
    And User should be able to enter Min "<ShiftSegment>" After Split hours
    Then User should be able to click on Add button successfully

    Examples:
      | RuleSetName | MinHrs | MaxHrs | SplitShifts | Day | WeekWorkHrs | QualifiedHrs | InWindow | WindowHrs | Consecutive | ContinuousRest | ShiftSegment |
      | SASTest018  | 48     | 720    | 0.5         | 0.5 | 60          | 60           | 16       | 24        | 6           | 8              | 0.5          |