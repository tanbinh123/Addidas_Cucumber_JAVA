Feature: Adidas Order Placement Functionality
  Agile Story: As a user, I should be able to place order from the website

  Scenario: Placing a successful order
    Given User is on the Home Page
    When User adds "Sony vaio i5" from "Laptops"
    And User adds "Dell i7 8gb" from "Laptops"
    And User remove "Dell i7 8gb"

