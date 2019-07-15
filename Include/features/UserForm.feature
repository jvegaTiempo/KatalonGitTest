#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@fillUserForm
Feature: Fill User Form
  Test the User Form functionality

  @smoke
  Scenario: Test the User Form functionality of EA application
    Given I navigate to the User Form page
    And I select a Title
    And I type Initial and First Name and Middle Name
    And I select a Gender
    And I select Languages Known
    Then I click Save button