Feature: Validate Search By Contact Email

  @First @Sanity
  Scenario: To validate application Search By Contact Email
    When Verify Individual section is displayed
    When Verify Contact Email is displayed

  @First @Sanity
  Scenario: To validate application Search without Contact Email Address
    Then Click on Search Button

  @First @Sanity
  Scenario: To validate application Search by Invalid Email Address
    Then Click on Contact Email Button
    When Enter Invalid Contact Email Address
    Then Click on Search Button
    And Verify Error Message is displayed When search with Invalid Email Address

  @First @Sanity
  Scenario: To validate application Search by Valid Contact Email Address
    When Clear the Text in Contact Email Field
    When Enter Contact Email Address
    Then Click on Search Button
    And Clear the Text in Contact Email Field
