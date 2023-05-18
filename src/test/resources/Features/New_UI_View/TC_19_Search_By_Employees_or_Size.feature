Feature: To validate Search by Employees or Size

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url
  	
  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To Validate Employees or Size Filter
    When Click on Employee Size Filter
    And Enter Minimum Employee Size
    And Enter Maximum Employee Size
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on the First Contact in Search Result by Employees
    Then validate the Employee Size in Search Result
    And Click on the First Contact in Search Result by Employees

  @Reg
  Scenario: To Validate Company size in All search results
    #Then Check Employee or Size in All Searched Results


  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options