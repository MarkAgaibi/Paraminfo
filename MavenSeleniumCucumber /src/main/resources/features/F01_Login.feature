@smoke

Feature: user shall login successfully to the system with valid username and password

  Scenario: User shall be able to login to system with Valid username and Password
    Given User shall be navigated to Home page
    When user entre a valid Email and valid Password: "testing@automation.com" and "P@ssw0rd"
    And user click on login button
    Then User shall login in to the system successfully
