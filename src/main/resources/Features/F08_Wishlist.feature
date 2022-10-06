@smoke
  Feature: WishList
    Scenario: user clicks on wishlist btn of HTC One M8 Android L 5.0 Lollipop
      Given user clicks wish list button of htc
      Then success added to wishlist message is displayed
      And Background color equals to "rgba(75, 176, 122, 1)"



    Scenario: Check the wishlist items count
      Given user clicks wish list button of htc
      When success added to wishlist message is displayed
      And user waits till success message disappear
      Then user clicks on wishlist button on top right corner
      And Check the Qty of wishlist item > 0






#    user clicks on wishlist button on top right corner