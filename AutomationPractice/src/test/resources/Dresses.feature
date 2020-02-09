Feature: Dresses

  Scenario: Verify the dresses data

    Given User on the home page
    When User open the dresses
    Then Items should be found in the category
    And Dresses should be appear in the results