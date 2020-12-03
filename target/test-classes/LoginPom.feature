@login
Feature: Login_Test
   As a customer
   In order to use the application
   I want to login with email and password

Scenario Outline: Logging in with valid credentials on jupiter.cloud website

     Given user is on "https://jupiter.cloud.planittesting.com/#/"
     When user click login link
    Then a pop up window appears
     And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
     When user click on login button
     Then user  "<username>" should be able to confirm login is successful
     And user log out of the application

   Examples:
     |username|password|
     |  test  |letmein |

 Scenario Outline: Logging in with valid credentials by ticking on terms of agreement on jupiter2.cloud website

   Given user is on "https://jupiter2.cloud.planittesting.com/#/"
   When user click login link
   Then a pop up window appears
   And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
   And user clicks terms of reference
   When user click on login button
   Then user  "<username>" should confirm that login is successful
   And user log out of the application

    Examples:
      |username|password|
      |  test  |letmein |


