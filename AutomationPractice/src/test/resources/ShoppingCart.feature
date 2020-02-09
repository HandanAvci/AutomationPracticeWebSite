Feature: Shopping cart

  Scenario: Verify the ability to add items from cart

    Given I am on the home page
    When I add '2. dress' to the shopping cart
    And Go to the shopping cart summary page
    And Check the item in the shopping cart
    Then 2 dress should be in the shopping cart
