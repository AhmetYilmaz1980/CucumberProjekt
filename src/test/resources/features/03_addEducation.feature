Feature: Add Education Test

  Background:
    Given The user is on the login page
    When The user enters valid credentials email: "hmtylmz@gmail.com" and password: "Ay00001051"
    Then The user should be able to see "Ahmet" on the dashboard
@check
    Scenario: Check Add Education Form Labes
      When The user navigates to tab "Ahmet" and module "My Profile"
      Then The user verifies that the page title "User Profile"
      When The user navigates user profile tabs "Add Education"
      Then The user verifies that the Add Education tab is displayed
      And The user should be able see form labels as follows
        | School or Bootcamp *    |
        | Degree or Certificate * |
        | Study                   |
        | From Date               |
        | To Date                 |
        | Program Description     |