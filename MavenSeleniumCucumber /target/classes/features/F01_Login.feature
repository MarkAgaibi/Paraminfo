@smoke

Feature: user shall login successfully to the system with valid username and password

  Scenario: User shall be able to login to system with Valid username and Password

    Given User shall be navigated to login page
    When user entre a valid username
    And user enter a valid password
    And user click on login button
    Then User shall login in to the system successfully
    And My Account tab shall be displayed