@HomeScenarios
Feature: HomePage Scenarios

  @IN-1
  Scenario: Verify title of page should be "Interview App"
    When I enter "test@yahoo.com"
    When I enter "test123"
    And I click button "Login"
    Then verify the title is "Interview App"