Feature: User shall be able to register a new user after filling all the needed data

  Scenario: User shall be able to register after filling the personal details

    Given User tab on register tab
    When Fill all the personal details fields
    And  User Enter Email: "AutomationTesting@gmail.com"
    And User Enter Company Name
    And User Enter Password and Confirm it
    And Click on Register Button
    Then Success Register flash message shall appear
    





