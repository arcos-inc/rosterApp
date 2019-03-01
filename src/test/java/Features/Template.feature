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