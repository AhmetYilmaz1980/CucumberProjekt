@login
Feature: Login Test

  @loginSelim
  Scenario: Positive Login Test as a Selim
    Given The user in on the login page
    When The user enters valid credentials for Selim
    Then The user should be able to login

  @loginRosa
  Scenario: Positive Login Test as a Rosa
    Given The user in on the login page
    When The user enters valid credentials for Rosa
    Then The user should be able to login