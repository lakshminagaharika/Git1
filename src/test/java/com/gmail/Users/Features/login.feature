Feature: Store login
 
This feature deals with the login functionality.
 
Background:
Given I navigate to login page
 
 
@TC1
Scenario: Login with correct username and correct password
 
#Given I navigate to login page
 
#And I entered username and password
 
When I entered "admin1" and "pass1"
 
And I clicked signin button
 
Then Itas navigated to the HomePage
 
 
@TC2
 
Scenario: Login with correct username and Invalid password
 
 
 
#Given I navigate to login page
 
#And I entered username and Invalid password
 
When I entered "admin1" and "pass1234"
 
And I clicked signin button
 
Then Itas navigated to the Error Message
 
@TC3
Scenario: using DataTable
 
 
 
#Given I navigate to login page
 
#And I entered username and Invalid password
 
When I entered following details
|  username  |  password |
|   admin1   |  pass1 |
 
 
 
And I clicked signin button
 
Then Itas navigated to the HomePage
 
 
 
 
@TC4
Scenario Outline: Login with correct username and correct password
 
 
 
 
#And I entered username and password
 
When I insert "<userName>" and "<passWord>"
 
And I clicked signin button
 
Then Itas navigated to the home page "<expected Result>"
 
 
 
Examples:
 
| userName | passWord | expected Result |
 
| admin1    | pass1  | Login Successfully |
 
| admin2    | admin2  | Login Successfully |
 
| admin3    | admin33| Enter your userName and password correct |
 