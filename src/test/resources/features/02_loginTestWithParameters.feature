Feature: Login Test with parameter
@aa
  Scenario: Positive Login Test with parameter
    Given The user is on the login page
    When The user enters valid credentials email: "hmtylmz@gmail.com" and password: "Ay00001051"
    Then The user should be able to login
    And The user should be able to see "Ahmet" on the dashboard
    And The username should habe 5 characters