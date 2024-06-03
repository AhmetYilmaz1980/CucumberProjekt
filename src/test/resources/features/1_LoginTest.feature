@regression
Feature: Login Tests

  # User Story = Feature
  # Test Case = Scenario:
  # Test Steps = Given, When, Then etc...

  #Background:
   # Given The user is on the login page

  @selim @login @smoke
  Scenario: Positive Login Test as Selim
  Given The user is on the login page
    When The user enters valid credentials for Selim
    Then The user should be able to login

  @login @rosa @smoke
  Scenario: Positive Login Test as Rosa
    Given The user is on the login page
    When The user enters valid credentials email: "rosa@test.com" and password: "Test123456"
    Then The user should be able to login

  @login @mike
  Scenario: Positive Login Test as Mike
    Given The user is on the login page
    When The user enters valid credentials email: "mike@gmail.com" and password: "mike1234"
    Then The user should be able to login