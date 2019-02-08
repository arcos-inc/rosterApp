@Login

Feature: loginFeature
  This login feature deals with the login functionality of the application

  Scenario: Flow till home page
    Given User is on Application Login Page
    And I enter the following details for login
      | username               | password |
      | shussain@arcos-int.com | Pass@123 |
    And User Should select his login role
    And User click on login button
    Then User is on Application home page
    And User Should select Acting role
    When user should see the Location Tab

  #Scenario: User Tab is Open
   # Then user should see the role management tab
    #And User click on Role Management
    #Then user should see the Add Role button
    #And User click on Add Role button
    #Then user should see the text box to enter role name
    #And User enters "TestRoleName2" in a Text field
    #And Press Save button to add new role
    #And  I just need to see how step looks for Cucumber-Java8




