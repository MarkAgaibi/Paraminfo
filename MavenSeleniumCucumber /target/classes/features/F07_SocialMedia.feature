@smoke
  Feature: F07_followUs | users could open followUs links

   Scenario: user opens Facebook link
     When User opens Facebook Link
     Then Facebook page shall be opened in new tab


    Scenario: user opens Twitter link
      When User opens Twitter Link
      Then Twitter page shall be opened in new tab


    Scenario: user opens RSS link
      When User opens RSS Link
      Then RSS link shall be opened in new tab


    Scenario: user opens Youtube link
      When User opens Youtube Link
      Then Youtube page shall be opened in new tab
