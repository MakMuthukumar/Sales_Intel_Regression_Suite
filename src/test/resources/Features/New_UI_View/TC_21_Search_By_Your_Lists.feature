Feature: To validate Search by Your Lists Filter

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url
  	
  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search By All Company Lists
    When Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Select All Companies List
    And Click on Company Radio Button
    And Click on Search Button
    And Check the search results of Company lists

  @First @Sanity
  Scenario: To validate Search By one Company List
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check One Company list is displayed
    And Select One Company List
    And Click on Search Button
    And Check the search results of Company lists


  @First @Sanity
  Scenario: To validate Search By All Contact Lists
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check Contact list is displayed
    And Select All Contact List
    And Click on Contact Radio Button
    And Click on Search Button
    #And Check the search results of Contact lists
    

  @First @Sanity
  Scenario: To validate Search By one Contact List
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check Contact list is displayed
    And Check One Contact list is displayed
    And Select One Contact List
    And Click on Search Button
    #And Check the search results of Contact lists


  @First @Sanity
  Scenario: To validate Search By All Suppression Lists
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check Suppression list is displayed
    And Select All Suppression List
    And Click on Contact Radio Button
    And Click on Search Button
    And Check the search results of Suppression lists

  @First @Sanity
  Scenario: To validate Search By one Suppression List
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check Suppression list is displayed
    And Check One Suppression list is displayed
    And Select One Suppression List
    And Click on Search Button
    And Check the search results of Suppression lists

  @First @Sanity
  Scenario: To validate Search By All ROD Lists
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check ROD list is displayed
    And Select All ROD List
    And Click on Search Button
    And Check the search results of ROD lists

  @First @Sanity
  Scenario: To validate Search By one ROD Lists
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Your Lists Filter is displayed
    And Click on Your Lists Filter
    And Check ROD list is displayed
    And Select One ROD List
    And Click on Search Button
    And Check the search results of ROD lists


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options