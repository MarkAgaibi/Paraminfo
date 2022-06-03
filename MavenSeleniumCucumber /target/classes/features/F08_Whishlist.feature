Feature: F08_hoverCategories | User could hover categories and select sub category

  Scenario: The user can add success message is visible after adding product to wishlist.
    When User can press to add an item to the WishList
    Then A message shall appear after success message
