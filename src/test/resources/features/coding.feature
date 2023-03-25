Feature: Coding Page Scenarios
  Background:
    Given I enter "Username"
    And I enter "Password"
    And I click on "Login" button

  @IN-5a
  Scenario: As a user I need an option in dashboards like "Coding" and Soft Skills" Question content should accept letter , number and any special characters.
    When I click on "Coding" button
    And I click on "Enter new question" button
    And I enter "this is my questions"


    @IN-6a
    Scenario: As a user I should be able to edit or delete the question I have added
      When I click on "Coding" button
      And I click on "Enter new question" button
      And I fill in "Is this Paul's question?" text
      And I click on "Enter" button
#      Then Verify "Is this Paul's question?" text is displayed
      When I click on "Edit" button
      And I fill in "This is new Paul question." text
      And I click on "Checked" button
      Then Verify "This is new Paul question." text is displayed
      When I click on "Delete" button
      Then Verify no "This is new Paul question." question is in the question list



