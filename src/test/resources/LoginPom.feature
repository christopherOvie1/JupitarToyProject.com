@login
Feature: Login_Test
   As a customer
   In order to use the application
   I want to login with email and password
Scenario Outline: Logging in with valid credentials

     Given user is on "http://jupiter.cloud.planittesting.com/#/"
     And user click login link
     And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
     When user click on login button
     Then user  "<username>" should be able to confirm login is successful

     Examples:
     |username|password|
     |  test  |letmein |

 Scenario Outline: Logging in with valid credentials by ticking on terms of agreement

   Given user is on "http://jupiter2.cloud.planittesting.com/#/"
   And user click login link
   And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
   And user clicks terms of reference
   When user click on login button
   Then user  "<username>" should be able to confirm login is successful
   And user log out of the application

    Examples:
      |username|password|
     |  test  |letmein |