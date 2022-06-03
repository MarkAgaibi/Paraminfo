@smoke
Feature: User shall be able to click on the sliders in Hero Section of the home page

  Scenario: The First slider shall clickable and navigate to search Nokia phone.
    Given User clicks on first slide
    When User Clicks on Nokia Slider
    Then Nokia product shall be filtered and opened in a new tab


  Scenario: The First slider shall clickable and navigate to search iphone 6.
    Given User clicks on Second slide
    When User Clicks on iPhone image Slider
    Then iPhone 6 product shall be filtered and opened in a new tab