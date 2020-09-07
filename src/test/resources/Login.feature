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
Feature: Login

  Scenario: Verifies login functionalies
    Given user launch the application "https://admin-demo.nopcommerce.com"
    And Enter the username "admin@yourstore.com"
    And Enter the password "admin"
    When Click on the login button
    #Then Verifies user logged in successfuly
    #And click on the logot button
    #Then Verifies user logout successfully
    
   Scenario: Verifies login functionalies
    Given user launch the application "https://admin-demo.nopcommerce.com"
    And Enter the username "admin@yourstore.com"
    And Enter the password "admin"
    When Click on the login button
    #Then Verifies user logged in successfuly
    #And click on the logot button
    #Then Verifies user logout successfully
