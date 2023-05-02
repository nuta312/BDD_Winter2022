@ui
Feature: Text Box functionalities

  @smoke
  Scenario: Fill up the form with all fields.
    Given User is on Text box page
    And User should fill up Full Name field with test data
    And User should fill up Email field with test data
    And User should fill up Current address field with test data
    And User should fill up Permenant address field with test data
    When User click Submit button
    Then User should see entered data

    @Aigerim
  Scenario: Fill up the form using parameters.
    Given User is on Text box page
    And User should fill up Full Name field "Johy Doe"
    And User should fill up Email field "space@elon.com"
    And User should fill up Current address field 123
    And User should fill up Permenant address field 3.32
    When User click Submit button
    Then User should see entered data
