Feature: To validate search by Keywords

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Keywords
    When Click on Keywords Filter
    And Click on Keywords Input box
    And Enter the Keyword
    And Click on Company Radio Button
    And Click on Search Button
    And Click on First Company Link in Result page
    Then Check searched Keyboard in company detail page
    And Click on SalesIntel Logo


  @Reg
  Scenario: To validate All Search Results of Keywords
    #Then Check Keyword in All Searched Results


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options