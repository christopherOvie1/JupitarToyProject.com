Feature: shopping_Test

Scenario Outline: Validate shopping successful

Given user is on "http://jupiter.cloud.planittesting.com/#/"
     And user click shop link
     #Then user is taken to product listing page

#     Then  user confirm choice "stuffedFrog" and "fluffyBunny"
#     And user confirms the price of "stuffedFrog" and "fluffyBunny"
     When user made attempt to shop  by adding "<product1>" and "<product2>" to the cart
#     When user click cart link
#     Then user confirms correct items are added to the cart
#    And user update the number of each item in the cart
#     And user confirms the price is reflected accuratly
#     When user click the checkout button
#     Then user should be in payment page
#     And user attempts payment by entering "<myForename>" "<myEmail>" "<myTelephoneNo>" "<cardNumber>" and "<cardNumber>"
#     When user click submit button on payment details page
#     Then user  validate the successful message Thanks "<myForename>" , your order has been accepted. Your order nuumber is JT1605952047008
    Examples:
       | product1     | product2  |myForename  | myEmail               | myTelephoneNo | cardNumber     |
       |  Stuffed Frog |fluffy Bunny| ovie       | ovie@gmail.com        | 07654323455   |JT1605952047008 |
       |  smiley bear |SMILEY FACE| ovie       | ovie@gmail.com        | 07654323455   |JT1605952047008 |
#





