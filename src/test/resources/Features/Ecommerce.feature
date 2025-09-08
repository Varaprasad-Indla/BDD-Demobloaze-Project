Feature: DemoBlaze eCommerce Application
  @Sanity
  Scenario: Complete purchase flow from signup to logout
    Given the user launches the DemoBlaze application
    When the user clicks on the Signup button
    And the user signs up with username "Varaprasad@" and password "Varaprasad@123"
    And the user closes the signup popup
    And logs in with the same credentials
    When navigates to the "Phones" category
    And adds "Iphone 6 32gb" to the cart
    When navigates to the "Laptops" category
    And adds "MacBook air" to the cart
    When navigates to the "Monitors" category
    And adds "Apple monitor 24" to the cart
    And goes to the cart page
    When places an order with the following details:
      | Name        | Varaprasad       |
      | Country     | India            |
      | City        | Ongole           |
      | Card Number | 4439 5949 9545   |
      | Month       | September        |
      | Year        | 2025             |
    Then the order should be placed successfully
    And the user logs out
