Feature: To validate Search by Revenue

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To Validate search by Million Revenue Filter
    When Click on Revenue Filter
    And Enter Minimum Revenue
    And Enter Maximum Revenue
    And Click on Search Button
    And Click on the First Contact in Search Result
    Then validate the Revenue in Search Result
    And Click on the First Contact in Search Result

  @Reg
  Scenario: To Validate search by Million Revenue Filter
    Then Check Revenue in All Searched Results

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options

