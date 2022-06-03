@smoke

Feature: F05_hoverCategories | user could hover categories and select sub category

  Scenario: User could hover categories
    When User hover category
    And Select Subcategory
    Then Check that the Text is the same
