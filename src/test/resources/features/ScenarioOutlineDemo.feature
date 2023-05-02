@ui
Feature: Scenario Outline Demo


  @outline
  Scenario Outline: Verify user can login with following data
    Given user should login with "<email>"
    And user should see "<message>"
    Then user should get <numbers>
    Examples:
      | email          | message | numbers |
      | test1@test.com | Hello   | 123     |
      | test2@test.com | Bye     | 432     |
      | test3@test.com | Hi      | 645     |
      | test4@test.com | GoodBye | 765     |

