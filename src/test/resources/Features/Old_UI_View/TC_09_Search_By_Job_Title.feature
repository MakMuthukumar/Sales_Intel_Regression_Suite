Feature: Validate Search By Job Title

  @First @Smoke @Reg
  Scenario: To validate application Search By Job Title section contents
    When Verify Role Section is displayed
    When Verify Job Level is displayed

  @First @Smoke @Reg
  Scenario: To validate application Search without Job Title
    Then Click on Search Button

  @First @Smoke @Reg
  Scenario: To validate application Search with Job Title
    Then Click on Search Button