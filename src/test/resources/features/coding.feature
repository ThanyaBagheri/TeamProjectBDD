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
    And I fill in "Is this Paul's Coding question?" text
    And I click on "Enter" button
    When I click on "Edit" button
    And I fill in "This is new Paul Coding question." text
    And I click on "Checked" button
    Then Verify "This is new Paul Coding question." text is displayed
    When I click on "Delete" button
    Then Verify no "This is new Paul Coding question." question is in the question list

  @IN-8
  Scenario Outline: As a user I should be able to search with criteria that has no more than 40 characters
    When I click on "<Dashboard>" button
    Then Verify at least one question displayed
    When I click on "Enter new question" button
    And I fill in "<Text>" text
    And I click on "Enter" button
    And I fill in "<criteria>" in Search criteria field
    And I click on "Search" button
    Then verify all question displayed contains "<criteria>"
    Examples:
      | Dashboard   | criteria | Text                                 |
      | Coding      | paul     | Is this Paul's Coding question?      |
      | Soft skills | paul     | Is this Paul's Soft skills question? |



