Feature: Department Feature For Company Admin
  This Department feature deals with the Department functionality of the application

  @W_EditAccrualAccounts
  Scenario: Edit Accrual Accounts For Company Admin
    Given User Should select Acting roles
    When User see the Location Tab
    Then User should click on the Accrual Accounts
    When User is on the Accrual Accounts Screen
    Then User click on the All link text
    And User click on the None link text
    And User check on the Accrual Accounts checkbox
    Then User click on the Update Button to Update Accrual Account
    Then User click on the Update Button to Cancel Accrual Account