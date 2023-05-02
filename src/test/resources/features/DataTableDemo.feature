@ui
Feature: Data Table demo


  @table
  Scenario: Create new user with following data
    Given user is on Registration page
    And fill up fullName with following fullname
      | john doe   | leo messi  | lebron james  |
      | john1 doe1 | leo1 messi | lebron1 james |
      | john2 doe2 | leo2 messi | lebron2 james |
      | john2 doe2 | leo2 messi | lebron2 james |
    And fill up age with
      | 123 | 312 | 1232 |
    And fill up email with
      | john@gmail.com | leo@messi.com | james@beron.com |