Feature: Registration Functionality
@sanity
Scenario Outline: Register with valid details
  Given user is on the NewTours registration page
  When user fills personal info "<firstName>", "<lastName>", "<phone>", "<email>"
  And user fills address info "<address>", "<city>", "<state>", "<postalCode>", "<country>"
  And user fills account info "<userName>", "<password>", "<confirmPassword>"
  And user submits the registration form
  Then registration should be successful

Examples:
  |firstName|lastName| phone|email| address|city|state|postalCode|country|userName|password|confirmPassword|
  |Varaprasad|Reddy| 9874651230|vara@wipro.com|Street 3|Hyderabad|Telangana|500032|INDIA| varaprasad1|pass|pass|
