Feature: To validate Search by INTENT

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url
  	
  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Topics
    When Check INTENT is displayed
    And Click on Topics
    And Select Netflix Topic
    And Click on Search Button
    Then Check Searched Topic in Search Result


  @Reg
  Scenario: To Check Searched Topic in All search results
    #Then Check Topic in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Score Threshold
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Topics
    And Select Netflix Topic
    And Check INTENT is displayed
    And Click on Score Threshold Filter
    And Select Minimum Score as 82
    And Click on Search Button
    And Check Searched Topic in Search Result
    Then Check Score in Result

  @Reg
  Scenario: To Check Searched Topic in All search results
    #Then Check Topic in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Topic Threshold
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Topics
    And Select Netflix Topic
    And Select Hulu Topic
    And Click On Topic Threshold
    And Select Minimum Topic Threshold
    And Click on Search Button
    And Check Search result for Topic Threshold

  @Reg
  Scenario: To Check Searched Topic in All search results
    #Then Check Topic in All Searched Results

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
