Feature: perform payment on prepaid BCA customer
Scenario: payment to prepaid BCA customer
Given user logged in with BCA customer
When customer should have existing prepaid offer and BA
Then user navigate to BA page
Then user click on payment tab
Then user click on new payment button
Then user enters the amount and click on create button
Then payment should be created