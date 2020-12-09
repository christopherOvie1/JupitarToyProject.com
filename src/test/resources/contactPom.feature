Feature: contact_Test

  Background:
    Given user is on "https://jupiter.cloud.planittesting.com/#/"

  Scenario Outline: Validate contact message  when mandatory fields are entered

    When user clicks on  contact link
    Then user is taken to "contact" page
    And user enters the  mandatory details "<forename>","<email>"  and  "<message>"
    When user click on submit button
     Then user should be on contact page
    Then user "<forename>" should validate see successMessage

    Examples:
      |forename     |   email           | message     |
      | testa       | testa@gmail.com   |ready        |
      |  testab      | testab@yahoo.com | please call  |

  Scenario: Validate error messages when field are not entered

    When user clicks on  contact link
    Then user is taken to "contact" page
    And user click on submit button
    Then user should validate the following error messages  as  "Forename is required"  , "Email is required" and "Message is required"
    And user also validate the feedback error warning error message "We welcome your feedback - but we won't get it unless you complete the form correctly."



