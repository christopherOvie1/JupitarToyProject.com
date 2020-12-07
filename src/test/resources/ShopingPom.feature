Feature: shopping_Test

Scenario Outline: Validate shopping successful

     Given user is on "https://jupiter.cloud.planittesting.com/#/"
     And user click shop link
     Then user is taken to "shop" page
     When user made attempt to shop  by adding "<product1>" and "<product2>" to the cart
     And user click cart link
     And user validates  "<product1>" and "<product2>"  are present the cart
     And user updates the products "<quantity1>" and "<quantity2>" respectively
     And user clicks check out button
     Then user is taken to "checkout" page
     And user enters the  contact details "<forename>","<email>"  and  "<address>"
     And user enters cardType "<cardType>" and "<cardNumber>"
     When user click the submit button
     Then user validates  transaction is successful

    Examples:
       | product1     | product2   | quantity1 | quantity2 | forename|email              |address      | cardType  | cardNumber          |
       |  Stuffed Frog|fluffy Bunny| 2         | 2         |testa   |testa@gmail.com     | 3 Green st  | Visa      | 1234 5678 1234 5678 |
     ##  |  smiley bear |SMILEY FACE | 2         | 2         |testab  | testab@yahoo.com   |17 Browny rd | Mastercard| 2345 1234 2345  1234|









