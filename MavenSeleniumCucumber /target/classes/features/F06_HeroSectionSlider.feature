@smoke
Feature: F06_homeSliders | User shall be able to click on the sliders in Hero Section of the home page

  Scenario: The First slider shall clickable and navigate to search Nokia phone.
    When User clicks on first slide
    Then Nokia product shall be filtered and opened in a new tab


  Scenario: second slider are clickable on home page
    When user clicks on second slider
    Then relative product for second slider is displayed