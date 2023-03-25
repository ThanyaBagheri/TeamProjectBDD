Feature: Coding Page Scenarios
  Background:
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button

  @IN-5
  Scenario: As a user I need an option in dashboards like "Coding" and Soft Skills" Question content should accept letter , number and any special characters.
    When I click on "Coding" button
    And I click on "Enter new question" button
    And I enter "this is my questions"
    And I click on "Enter" button
    Then Verify "text" is displayed

    @IN-6a
    Scenario: As a user I should be able to edit or delete the question I have added
      When I click on "Coding" button
      And I click on "Enter new question" button
      And I fill in "Is this Paul's question?" text
      And I click on "Enter" button
      Then Verify "Delete" button is enabled
      And Verify "Edit" button is enabled
