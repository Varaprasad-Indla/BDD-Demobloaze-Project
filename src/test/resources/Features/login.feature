Feature: Login Functionality

#Background: 
 # Given User is on the login page

#@regression
#Scenario: Verify the login functionality for valid credentials
 # Given User is on the login page
  #When user enters the username
  #And user enters the password
  #And user clicks on the login button
  #Then user is navigated to home page 

#@sanity
#Scenario: Verify the login functionality for invalid credentials
 # Given User is on the login page
  #When user enters the invalid username
  #And user enters the password
  #And user clicks on the login button
  #Then an error message should be displayed

#@sanity
#Scenario Outline: Verify the login functionality for valid credentials using parameter
 # Given User is on the login page
  #When user enters the "<username>" and "<password>"
  #And user clicks on the login button
  #Then user is navigated to home page

  #Examples:
   # | username | password  |
    #| Admin    | admin123  |
    #| Admin    | admin123  |
    #| Admin    | admin123  |
@sanity
Scenario: Login with multiple users
	 Given User is on the login page
	 When user enters credentials
      | username | password  |
      | Admin    | admin123  |  
   And user clicks on the login button	
	Then user is naqvigated to home page