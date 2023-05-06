Feature: Validate Search By Job Department

  @First @Sanity
  Scenario: To validate application Search By Job Department section contents
    When Verify Role Section is displayed
    When Verify Job Level is displayed

  @First @Sanity
  Scenario: To validate application Search without Job Level
    Then Click on Search Button

  @First @Sanity
  Scenario: To validate application Search by Finance Job Department
    Then Click On Job Level


  @First @Sanity
  Scenario: To validate application Search by HR Job Department
    Then Click On Job Level

  @First @Sanity
  Scenario: To validate application Search by IT Job Department
    Then Click On Job Level


  @First @Sanity
  Scenario: To validate application Search by Legal Job Department
    Then Click On Job Level


  @First @Sanity
  Scenario: To validate application Search by Marketing Job Department
    Then Click On Job Level


  @First @Sanity
  Scenario: To validate application Search by Operations Job Department
    Then Click On Job Level


  @First @Sanity
  Scenario: To validate application Search by Procurements Job Department
    Then Click On Job Level

  @First @Sanity
  Scenario: To validate application Search by R&D Job Department
    Then Click On Job Level


  @First @Sanity
  Scenario: To validate application Search by Sales Job Department
    Then Click On Job Level