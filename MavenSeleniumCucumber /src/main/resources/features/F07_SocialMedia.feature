@smoke
  Feature: F07_followUs | users could open followUs links

   Scenario: user opens Facebook link
     Given Scroll down to the bottom of the Page till facebook icon
     When Click on facebook icon
     Then User could open facebook page


    Scenario: user opens Twitter link
      Given Scroll down to the bottom of the Page till twitter icon
      When User opens Twitter Link
      Then Twitter page shall be opened in new tab


    Scenario: user opens RSS link
      Given Scroll down to the bottom of the Page till RSS icon
      When User click on RSS icon
      Then User could open RSS Feed page


    Scenario: user opens Youtube link
      Given Scroll down to the bottom of the Page till Youtube icon
      When User click on Youtube icon
      Then User could open Youtube page
