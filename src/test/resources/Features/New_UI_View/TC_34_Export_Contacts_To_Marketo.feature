  Feature: To validate Export Contact To Marketo
  
  @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
    
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username Export Company To Salesforce
    And Enter Valid Password Export Company To Salesforce
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export to Marketo company details
    When Click on Contact Radio Button
    And Click on Search Button
    And Click on 1st Contact checkbox
		And Click on Contact Bulk Actions Dropdown
		And Click on Contact Export to Marketo Option
    And Perform Export Contacts To Marketo Window
						
	@First @Sanity @Credit_Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options