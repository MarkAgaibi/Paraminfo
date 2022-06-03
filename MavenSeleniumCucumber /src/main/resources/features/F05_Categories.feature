@smoke

Feature: F05_hoverCategories | user could hover categories and select sub category

  Scenario: User could hover categories
    Given User hover category
    When Select Subcategory
    Then Check that the subCategory URL will be opened
