Feature: Coding Page Scenarios
  Background:
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button

    @IN-6a
    Scenario: As a user I should be able to edit or delete the question I have added
      When I click on "Coding" button
      And I click on "Enter new question" button
      And I fill in "Is this Paul's question?" text
      And I click on "Enter" button
      Then Verify "Delete" button is enabled
      And Verify "Edit" button is enabled
