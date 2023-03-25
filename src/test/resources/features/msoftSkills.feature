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

  @IN-6b
  Scenario: As a user I should be able to edit or delete the question I have added
    When I click on "Soft skills" button
    And I click on "Enter new question" button
    And I fill in "Is this Paul's Soft skills question?" text
    And I click on "Enter" button
    When I click on "Edit" button
    And I fill in "This is new Paul Soft skills question." text
    And I click on "Checked" button
    Then Verify "This is new Paul Soft skills question." text is displayed
    When I click on "Delete" button
    Then Verify no "This is new Paul Soft skills question." question is in the question list
