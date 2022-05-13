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

Feature: Login Rmemeber Me checkbox
  

  @smoke @regression
  
  Scenario: Checking Functionality of login form remember me feature
    Given must be on homepage url "https://demo.applitools.com/"

    When    User clicks on Remember me checkbox
   
    Then Remember Me checkbox must get selected
   @regression
  Scenario: Checking Functionality of Sign up form remember me feature
    Given User must be on homepage

    When    User clicks on Remember me checkbox
   
    Then Remember Me checkbox must get selected
   