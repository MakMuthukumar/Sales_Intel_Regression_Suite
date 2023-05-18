Feature: To validate SalesIntel Tab

  @First1 @Sanity1
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url
    
 @First1 @Sanity1
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First1 @Sanity1
  Scenario: To Validate Search Box with Company Name in SalesIntel Tab
    When Check Search Box is displayed in SalesIntel Tab
    And Click on Search Box in SalesIntel Tab
    And Enter Company Name in the Search Box
    And Click on Search Button in The SalesIntel Tab
    And Click on Companies Tab
    And Validate the Searched Company Name In Search Result

  @First1 @Sanity1
  Scenario: To Validate Search Box with Company Domain in SalesIntel Tab
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Search Box is displayed in SalesIntel Tab
    And Click on Search Box in SalesIntel Tab
    And Enter Company Domain in the Search Box
    And Click on Search Button in The SalesIntel Tab
    And Click on Companies Tab
    And Validate the Searched Company Domain In Search Result

  @First1 @Sanity1
  Scenario: To Validate Recommended Lists in SalesIntel Tab
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Recommended List is displayed in SalesIntel Tab
    And Click on first Recommended List
    Then Validate Search Results for Recommended List


  @First1 @Sanity1
  Scenario: To Validate Saved Searches in SalesIntel Tab
  	When Click on Back To Search Result
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on View all Saved Searches
    And Click On SalesIntel Tab
    And Check Saved Searches are displayed in SalesIntel Tab
    And Click on the First Saved Search in SI tab
    Then Validate Search Result for Saved Searches


  @First1 @Sanity1
  Scenario: To validate application scroll Down
    When Click On Clear Button
    And Move the SalesIntel Website Screen Down

  @First1 @Sanity1
  Scenario: To validate application Upload a file
    When Click On Browse Button
    And Upload File From Local Directory
    And Select Contact List Option For Data enrichment
    And Click on Next button
    And Enter List Name For Data Enrichment
    And Click on Next button
    And Click On Save List under Data Enrichment
    And Click on Close Button
    Then Check the Added List in the List Tab

  @First1 @Sanity1
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options