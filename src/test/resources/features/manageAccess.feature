@ManageAccessScenarios
Feature: Manage Access Scenarios

  Background:
    Given I enter "adminuser"
    And I enter "adminpassword"
    And I click on "Login" button
    When I click on "Manage Access" button

  @IN-13
  Scenario: Verify admin should see a form in Manage Access page with following fields
    Then Verify fields are displayed
      | Firstname |
      | Lastname  |
      | Email     |
      | Role      |
      | Batch     |

  @IN-14
  Scenario: Verify added new user should be displayed on the table in Manage Access page.
    Then Verify button "Add User" is displayed

  @IN-15
  Scenario: Verify there is an option to filter out the users
    Then Verify filter selection is enable

  @IN-16
  Scenario:Verify each user on Manage Access page should have following options Edit, Delete, Reset password
    When I click on "Action" button
    Then Verify dropdown items are displayed
    |Edit|
    |Delete|
    |button|

  @IN-17
  Scenario:Verify there should be a "Show all" button that will reset the view and display all users from the filtered view
    Then verify button "show all" is enabled




