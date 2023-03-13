@smoke

Feature: User Shall be able to navigate to Saudi Arabia Home Page to validate the site localization.

// Validate the site localization
  Scenario: User shall be able to Navigate to Saudi Arabia Home Page and to Check the Prices in SR.
    Given User navigated to Home page of Saudi Arabia with the URL as: ""
    When User click on English Language button
    Then Site changes into the new English display.
    
 
 // Validate the Package Currencies in the Arabic site. 
   Scenario: User shall be able to Navigate to Saudi Arabia Home Page to validate the Pakage Currency in Arabic Language
    Given User navigated to Home page of Saudi Arabia with the URL as: "https://subscribe.stctv.com/sa-en"
    When User click on Arabic Language button
    Then Package currencies shall be display in Arabic Language.
    
    
 // Validate the Package Currencies in the English site. 
   Scenario: User shall be able to Navigate to Saudi Arabia Home Page to validate the Pakage Currency in Arabic Language
    Given User navigated to Home page of Saudi Arabia with the URL as: "https://subscribe.stctv.com/sa-ar"
    When User click on Arabic Language button
    Then Package currencies shall be display in English Language.
    
    
 // Validate the Package Price in the English site. 
   Scenario: User shall be able to Navigate to Saudi Arabia Home Page to validate the Pakage Currency in Arabic Language
    Given User navigated to Home page of Saudi Arabia with the URL as: "https://subscribe.stctv.com/sa-ar"
    When User click on English Language button
    Then Package currencies shall be display in English Language with the correct amount for Saudi Arabia country.
    
    
  // Validate the Package Price in the Arabic site. 
   Scenario: User shall be able to Navigate to Saudi Arabia Home Page to validate the Pakage Currency in Arabic Language
    Given User navigated to Home page of Saudi Arabia with the URL as: "https://subscribe.stctv.com/sa-en"
    When User click on English Language button
    Then Package currencies shall be display in Arabic Language with the correct amount for Saudi Arabia country.
