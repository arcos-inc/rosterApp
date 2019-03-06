@RuleSets

Feature: Rule Sets Tab
  From This Feature File User Should Able to Create or Edit the Rule Sets

  Background: Login Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page

  Scenario Outline: Create New Paid Time Off Rule Sets
    Given User should be on Company Rule Set Page
    When User click on Create New Paid Time Off Rule Set
    Then User should redirect to New Paid Time Off Rule Set page
    And User enter the Rule Set <Name>
    And User can check on Request Paid Time Off
    And User can check on Request to Cancel Paid Time Off
    And User can check on Approval Required
    And User should enter <minimumCharacters> for Denial Comment
    And User can Allow Partial Shift Paid Time Off
    And User should enter <smallestUnit> of Paid Time Off
    And User can enter <minimumHours> Before Shift Start Paid Time Off Request Zero mean ignore rule
    And User should enter <maximumHours> Before Paid Time Off Request
    And User can check on Supervisor Can Override Rules
    And User can check on Administrator Can Edit Accrual Balances
    And User can check on Display Current Accrual Balances
    And User should enter <maximumDays> in Advance to Count Against Available
    And User can check on Require Available Balance for Requests
    And User can check on Allow Employee to View Description
    And User should enter Rule Set <description>
    And User should click on Add Button to add new Rule Set

    Examples:
      | Name                | minimumCharacters | smallestUnit | minimumHours | maximumHours | maximumDays | description                                       |
      | SAS Test Rule Set D | 1                 | 3.45         | 12.32        | 1000.23      | 832         | This is a Test Description of SAS Test Rule Set D |
      | SAS Test Rule Set E | 2                 | 5.23         | 34.43        | 2300.29      | 232         | This is a Test Description of SAS Test Rule Set E |
      | SAS Test Rule Set F | 6                 | 2.35         | 54.23        | 3100.32      | 352         | This is a Test Description of SAS Test Rule Set F |


