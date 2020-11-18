@login
Feature: Login_Test

   As a customer
   In order to use the application
   I want to login with email and password
  
Scenario Outline: Logging in with valid credentials

     Given user is on home page
     And user click login link
     When  user attempts to login by entering  "<username>"  and  "<password>"
     Then user  "<username>" should be able to confirm login is successful
     And user log out of the application
     Examples:
     |username|password| 
     |  test  |letmein |               
