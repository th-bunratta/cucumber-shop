Feature: Buy products
    As a customer
    I want to buy products

Background:
    Given a product Bread with price 20.50 exists
    And the catalogue has Bread with the quantity of 2 in stock
    And a product Jam with price 80.00 exists
    And the catalogue has Jam with the quantity of 1 in stock

Scenario: Buy one product
    When I buy Bread with quantity 2
    Then total should be 41.00

Scenario: Buy multiple products
    When I buy Bread with quantity 2
    And I buy Jam with quantity 1
    Then total should be 121.00


