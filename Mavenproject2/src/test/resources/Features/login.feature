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
@tag

    Feature: Vrify login functionality
  I want to verify all fields on login page

  Scenario Outline: Verify login functionality using different test data
    Given User on login page
    When User enter <username> and <password>
    And User click on login button
    Then User logout home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
