Feature: Login Functionality Test
 @list
  Scenario: Login With List
    Given The user is on the login page
    When The user schould be able to login and verifies success login with follows
      | rosa@test.com |
      | Test123456    |
      | Rosa          |

   @method
   Scenario: Login With Map
     Given The user is on the login page
     When The user sould be able to login and verifies success login with following map
       | email    | mike@gmail.com |
       | password | mike1234       |
       | username | mike           |