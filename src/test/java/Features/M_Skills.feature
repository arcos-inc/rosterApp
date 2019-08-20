Feature: Skill Feature For Company Admin
  This Skill feature deals with the Skill functionality of the application

  @Q_AddSkill
  Scenario: Add Skill For Company Admin
    Given User Should select Acting roles
    When User see the Skills Tab
    Then User should click on Skills Tab
    When User is on the Skills Screen
    Then User click on the Create New Skill
    When User is on the New Skill Screen
    And User enter the code "AB-09"
    And User enter the description "Accounting"
    And User enter the third party code "E78TUN"
    Then User click on the Add Button

  @R_EditSkill
  Scenario: Edit Skill For Company Admin
    Given User is on the Skills Screen
    Then User click on the Edit Link Text
    When User is on the New Skill Screen
    And User enter the code "GRP-597"
    And User enter the description "Finance"
    And User enter the third party code "UVF79N"
    Then User click on the Update Button to Update Skill

  @S_FilterSkills
  Scenario: Filter Skills For Company Admin
    Given User Should select Acting roles
    When User see the Skills Tab
    Then User should click on Skills Tab
    When User is on the Skills Screen
    And User select Active Skills from dropdown
    Then User click on the Filter Button

  @T_FilterSkills
  Scenario: Filter Skills For Company Admin
    Given User is on the Skills Screen
    And User select Inactive Skills from dropdown
    Then User click on the Filter Button
