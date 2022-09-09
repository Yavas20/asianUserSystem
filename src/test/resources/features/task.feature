@Tasks
Feature: Login functionality with valid and invalid credentials

  Background: User is on the homepage
    Given : User is on the homepage

    @Task1
    Scenario: User can login with valid email and valid password
      When User enters a valid email into the email input box
      And User enters a valid password into the password input box
      And User clicks the submit button
      Then User should be able to login successfully

  @Task2
  Scenario: User can not login with invalid email and valid password
    When User enters a invalid email into the email input box
    And User enters a valid password into the password input box
    And User clicks the submit button
    Then "Invalid username or password." error message can be displayed on the login part

  @Task3
  Scenario: User can not login with valid email and invalid password
    When User enters a valid email into the email input box
    And User enters a invalid password into the password input box
    And User clicks the submit button
    Then "Invalid username or password." error message can be displayed on the login part

  @Task4
  Scenario: User can not login with invalid email and invalid password
    When User enters a invalid email into the email input box
    And User enters a invalid password into the password input box
    And User clicks the submit button
    Then "Invalid username or password." error message can be displayed on the login part

  @Task5
  Scenario: User can not login with null email and null password
    When User doesn't enter email into the email input box
    And User doesn't enter password into the password input box
    And User clicks the submit button
    Then "Invalid username or password." error message can be displayed on the login part

  @Task6
  Scenario: User can not login with null email and valid password
    When User doesn't enter email into the email input box
    And User enters a valid password into the password input box
    And User clicks the submit button
    Then "Invalid username or password." error message can be displayed on the login part

  @Task7
  Scenario: User can not login with valid email and null password
    When User enters a valid email into the email input box
    And User doesn't enter password into the password input box
    And User clicks the submit button
    Then "Invalid username or password." error message can be displayed on the login part

  @Task8
  Scenario: User can see the email receive message after clicking forgot password link and then providing valid email
    When User clicks the forgot password link
    And User enters valid email into the forgot password section email input box
    And User clicks the the forgot password section submit button
    Then "You should receive an email shortly with further instructions." message can be displayed on the part

  @Task9
  Scenario: User can not see the email receive message after clicking forgot password link and then providing invalid email
    When User clicks the forgot password link
    And User enters invalid email into the forgot password section email input box
    And User clicks the the forgot password section submit button
    Then "You should receive an email shortly with further instructions." message can not be displayed on the part

  @Task10
  Scenario: User can not see the email receive message after clicking forgot password link and then providing unregistered email
    When User clicks the forgot password link
    And User enters unregistered email into the forgot password section email input box
    And User clicks the the forgot password section submit button
    Then "You should receive an email shortly with further instructions." message can not be displayed on the part

  @Task11
  Scenario: User can not see the email receive message after clicking forgot password link and then not providing email
    When User clicks the forgot password link
    And User does not enter email into the forgot password section email input box
    And User clicks the the forgot password section submit button
    Then "Please specify username." error message can be displayed on the part











