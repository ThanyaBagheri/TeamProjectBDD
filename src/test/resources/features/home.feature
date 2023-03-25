@HomepageScenarios
Feature: Home Page Scenarios

  @IN-1
  Scenario: Verify title of the page is "interview App"
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button
    Then Verify that "Interview App" is the title of the page

  @IN-2
  Scenario: When i sign in as a user i should be able to see only "Sign out" button from nav bar User should not have access to "Manage Access" button
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button
    Then Verify button "Sign out" is displayed

  @IN-3
  Scenario: When I log in as a user there should always be 3 dashboards present.
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button
    Then Verify button "All Topics" is displayed
    Then Verify button "Coding" is displayed
    Then Verify button "Soft Skills" is displayed

  @IN-4
  Scenario: As a user I should have an option to add a statement in Do's and Dont's section
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button
    Then I click on "add do" button

  @IN-10
  Scenario: When admin logs in "Manage Access" button should be visible
    Given I enter "adminuser"
    And I enter "adminpassword"
    And I click on "Login" button
    Then Verify button "Manage Access" is displayed

  @IN-11
  Scenario: Admin should be able to edit or delete an Do or Don't item in Interview section
    Given I enter "adminuser"
    And I enter "adminpassword"
    And I click on "Login" button
    Then I click on "add do" button
    And I enter "new do" in do section
    And I click on "Enter" button
    Then Verify button "edit" is enabled
    Then Verify button "delete" is enabled


  @IN-12
  Scenario: Admin should have an ability to add a new dashboard. When a new dashboard is created, regular user should be able to see it on their end
    Given I enter "adminuser"
    And I enter "adminpassword"
    And I click on "Login" button




