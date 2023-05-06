Feature: To validate Search by Rankings

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Rankings Filter and Select All
    When Check Ranking filter is displayed
    And Click on Ranking Filter
    And Click on Select All Check Box for Rankings
    And Click on Contact Radio Button
    And Click on Search Button
    And Check Search Results of Ranking Filter


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
