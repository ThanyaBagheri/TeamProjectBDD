@HomepageScenarios
Feature: Home Page Scenarios
  Background:
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button

  @IN-1
  Scenario: Verify title of the page is "interview App"
    Then Verify that "Interview App" is the title of the page

  @IN-2
  Scenario: When i sign in as a user i should be able to see only "Sign out" button from nav bar User should not have access to "Manage Access" button
    Then Verify button "Sign out" is displayed

  @IN-3
  Scenario: When I log in as a user there should always be 3 dashboards present.
    Then Verify button "All Topics" is displayed
    Then Verify button "Coding" is displayed
    Then Verify button "Soft Skills" is displayed

  @IN-4
  Scenario: As a user I should have an option to add a statement in Do's and Dont's section
    Then I click on "add do" button


    @IN-5 
    Scenario: As a user I need an option in dashboards like "Coding" and Soft Skills" Question content should accept letter , number and any special characters.
      When I click on "Coding" button
      And I click on "Enter new question" button
      And I enter "this is my questions"
      And I click on "Enter" button
      Then Verify "text" is displayed
