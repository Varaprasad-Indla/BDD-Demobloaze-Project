Feature: DemoBlaze eCommerce Application

  @Negative
  Scenario: Signup with an already registered username
    Given the user launches the DemoBlaze application
    When the user clicks on the Signup button
    And the user signs up with username "Varaprasad@" and password "Varaprasad@123"


  @Negative
  Scenario: Login with incorrect password
    Given the user launches the DemoBlaze application
    When the user clicks on the Login button
    And enters username "Varaprasad@" and password "WrongPassword123"
    And clicks on the Login button
    And the user should not be logged in

  @Negative
  Scenario: Add to cart without logging in
    Given the user launches the DemoBlaze application
    When navigates to the "Phones" category
    And adds "Iphone 6 32gb" to the cart


  @Negative
  Scenario: Place order with an empty cart
    Given the user launches the DemoBlaze application
    When the user clicks on the Signup button
    And the user signs up with username "Varaprasad@" and password "Varaprasad@123"
    And the user closes the signup popup
    And logs in with the same credentials
    And goes to the cart page
    When places an order with the following details:
      | Name        | Varaprasad       |
      | Country     | India            |
      | City        | Ongole           |
      | Card Number | 4439 5949 9545   |
      | Month       | September        |
      | Year        | 2025             |


 