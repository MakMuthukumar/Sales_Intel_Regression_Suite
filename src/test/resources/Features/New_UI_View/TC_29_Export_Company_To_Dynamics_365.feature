  Feature: To validate Export Company To Dynamics 365
  
   @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username Export Company To Salesforce
    And Enter Valid Password Export Company To Salesforce
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export to Dynamics 365 company details
    Then Click on Company Radio Button
    When Click on Search Button
    And Click on 1st company checkbox
		And Click on Bulk Actions Dropdown
		And Click on Export to Dynamics 365 Option
		And Perform Export Companies To Dynamics 365 Window

	@First @Sanity @Credit_Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options