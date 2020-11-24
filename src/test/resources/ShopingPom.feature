Feature: shopping_Test

Scenario Outline: Validate shopping successful

     Given user is on "https://jupiter.cloud.planittesting.com/#/"
     And user click shop link
     Then user is taken to "shop" page
     When user made attempt to shop  by adding "<product1>" and "<product2>" to the cart
     Then user confirms correct items are added to the cart
     And user click cart link


#    And user update the number of each item in the cart

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








