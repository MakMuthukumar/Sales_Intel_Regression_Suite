  Feature: To validate Export Company To Zoho
  
   @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export to Zoho company details
    Then Click on Company Radio Button
    When Click on Search Button
    And Click on 1st company checkbox
		And Click on Bulk Actions Dropdown
		And Click on Export to Zoho Option
		And Perform Export Companies To Zoho Window

	@First @Sanity @Credit_Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options