@ui
Feature: Pojo practice


  @pojo
  Scenario: Fill up the form positive
    Given user is on Text box page
    And fill up all fields with following data
      | fullName  | email         | currentAddress   | permanentAddress |
      | John Doe  | john@doe.com  | Wall Street 222  | JBR 212          |
      | John1 Doe | john1@doe.com | Wall Street 2221 | JBR 2121         |
      | John2 Doe | john2@doe.com | Wall Street 2222 | JBR 2122         |
      | John3 Doe | john3@doe.com | Wall Street 2223 | JBR 2123         |
      | John4 Doe | john4@doe.com | Wall Street 2224 | JBR 2124         |
      | John5 Doe | john5@doe.com | Wall Street 2225 | JBR 2125         |