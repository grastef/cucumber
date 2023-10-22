Feature: feature to test addItem functionality

  Scenario: Check addItem is successful
    Given user is on home page
    When user select item
    And click on Add to cart button
    Then the item added to the cart


