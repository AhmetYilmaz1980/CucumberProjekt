@regression
Feature: Login Test DDF

  Scenario Outline: Login Test With Different Users
    Given The user is on the login page
    When The user enters valid credentials email: "<email>" and password: "<password>"
    Then The user should be able to login
    And The user should be able to see "<user_name>" on the dashboard
    And The username should habe <useernameLenght> characters
    Examples:
      | email             | password   | user_name | useernameLenght |
      | hmtylmz@gmail.com | Ay00001051 | Ahmet     | 5               |
      | rosa@test.com     | Test123456 | Rosa      | 4               |
      | mike@gmail.com    | mike1234   | mike      | 4               |


  Scenario Outline: Login With Map
    Given The user is on the login page
    When The user sould be able to login and verifies success login with following map
      | email    | <email>    |
      | password | <password> |
      | username | <username> |
    Examples:
      | email             | password   | username |
      | hmtylmz@gmail.com | Ay00001051 | Ahmet    |
      | rosa@test.com     | Test123456 | Rosa     |
      | mike@gmail.com    | mike1234   | mike     |


  Scenario Outline: Login With List
    Given The user is on the login page
    When The user schould be able to login and verifies success login with follows
      | <email>    |
      | <password> |
      | <username> |
    Examples:
      | email             | password   | username |
      | hmtylmz@gmail.com | Ay00001051 | Ahmet    |
      | rosa@test.com     | Test123456 | Rosa     |
      | mike@gmail.com    | mike1234   |mike     |
