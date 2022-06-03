@smoke

  Feature: User shall be able to search for any Product from the search bar

    Scenario: User shall be able to type and search for specific product by name
      Given User shall be able to search for the word: " Apple"
      When User shall click on Search Button
      Then All Apple Products shall appear in the search result area