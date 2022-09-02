Feature: Login and register functionality
  As a user, I should be able to register and login using this valid credentials.

  Background:
    Given User is on the login page

  @TestCase1
  Scenario: User should be able to register with valid email and password.
    When User click the register tab
    And User enter an email into the email input box
    And User enter a password into the password input box
    And User re-enter the password into the input box
    And User click the register button
    Then Verify that user can land on homepage

  @TestCase2
  Scenario: User should be able to login with valid email and password.
    When User enter a valid email into the email input box
    And User enter a valid password into the password input box
    And User click the click sign in button
    Then Verify that user can land on homepage

  @TestCase3
  Scenario: User should not be able to login with valid email and invalid password.
    When User enter a valid email into the email input box
    And User enter an invalid password into the password input box
    And User click the click sign in button
    Then Verify that “Invalid username or password.” message can be displayed

  @TestCase4
  Scenario: User should not be able to login with invalid email and valid password.
    When User enter an invalid email into the email input box
    And User enter a valid password into the password input box
    And User click the click sign in button
    Then Verify that “Invalid username or password.” message can be displayed

  @TestCase5
  Scenario: User should not be able to login with invalid email and invalid password.
    When User enter an invalid email into the email input box
    And User enter an invalid password into the password input box
    And User click the click sign in button
    Then Verify that “Invalid username or password.” message can be displayed

  @TestCase6
  Scenario: User should not be able to register with invalid email and valid password.
    When User click the register tab
    And User enter an invalid email into the register email input box
    And User enter a password into the password input box
    And User re-enter the password into the input box
    And User click the register button
    Then Verify that “Invalid email address.” message can be displayed

  @TestCase7
  Scenario: User should not be able to register with already registered email and valid password.
    When User click the register tab
    And User enter the registered email into the register email input box
    And User enter a password into the password input box
    And User re-enter the password into the input box
    And User click the register button
    Then Verify that “Email already exists.” message can be displayed

  @TestCase8
  Scenario Outline: User should be able to login with different credentials.
    When User enter a valid "<email>" into the email input box
    And User enter a valid "<password>" into the password input box
    And User click the click sign in button
    Then Verify that user can land on homepage

    Examples:
      | email                      | password     |
      | yavas.emre@hotmail.com     | Zeynep121784 |
      | emreyavas20@hotmail.com    | ser          |
      | emreyavass001984@gmail.com | 1            |

  @TestCase9
  Scenario: User should not be able to submit invalid email after clicking forgot password link.
    When User click the forgot password link
    And User enter invalid email into the forgot your password email input box
    And User click the submit button
    Then Verify that “Invalid email address.” message can be displayed on forgot your password section

  @TestCase10
  Scenario: User should not be able to submit unregistered email after clicking forgot password link.
    When User click the forgot password link
    And User enter unregistered email into the forgot your password email input box
    And User click the submit button
    Then Verify that “Unregistered email address.” message can be displayed on forgot your password section







