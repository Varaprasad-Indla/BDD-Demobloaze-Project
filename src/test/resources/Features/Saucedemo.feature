Feature: End-to-End- SauceDemo
@sanity
Scenario: Standard user completes a purchase successfully
  Given User is on the saucedemo login page
  When user logs in with valid credentials
  And user adds "Sauce Labs Backpack" to the cart
  And user proceeds to checkout
  And user enters checkout information 
  And user completes the purchase
  Then a confirmation message should be displayed