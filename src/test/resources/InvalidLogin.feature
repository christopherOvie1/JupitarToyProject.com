Feature: Invalid Login_Test

  Scenario Outline: Logging in with invalid credentials on jupiter.cloud website

    Given user is on "https://jupiter.cloud.planittesting.com/#/"
    And user click login link
    And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
    When user click on login button
    Then user  should validate the error message "Your login details are incorrect"

    Examples:
      |username|password|
      |  test  |nothappenin |



  Scenario Outline: Logging in with invalid credentials by not ticking on terms of agreement on jupiter2.cloud website

    Given user is on "https://jupiter2.cloud.planittesting.com/#/"
    And user click login link
    And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
    When user click on login button
    Then user  should validate the error message "You must agree to the terms of service"

    Examples:
      |username|password|
      |  test  |nothappenin |

  Scenario Outline: Logging in with invalid credentials by ticking on terms of agreement on jupiter2.cloud website

   Given user is on "https://jupiter2.cloud.planittesting.com/#/"
    And user click login link
    And user attempts to login by entering  "<username>"  and  "<password>" on a pop up window
    And user clicks terms of reference
    When user click on login button
    Then user  should validate the error message "Your login details are incorrect"

    Examples:
      |username|password|
      |  test  |nothappenin |