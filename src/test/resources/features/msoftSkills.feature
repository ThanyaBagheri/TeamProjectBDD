Feature: Coding Page Scenarios
  Background:
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button

@IN-5b
Scenario: As a user I need an option in dashboards like "Coding" and "Soft Skills" Question content should accept letter , number and any special characters.
When I click on "Soft Skills" button
And I click on "Enter new question" button
And I enter "this is my questions"
  Then I click on "enter" button
