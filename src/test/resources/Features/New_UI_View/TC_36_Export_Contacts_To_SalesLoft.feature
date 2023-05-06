  Feature: To validate Export Contact To SalesLoft
  
  @First @Sanity @Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
    
  @First @Sanity @Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button
    
  @First @Sanity @Export
  Scenario: To validate application Export to SalesLoft company details
    When Click on Contact Radio Button
    And Click on Search Button
    And Click on 1st Contact checkbox
		And Click on Contact Bulk Actions Dropdown
		And Click on Contact Export to SalesLoft Option
    And Perform Export Contacts To SalesLoft Window
						
	@First @Sanity @Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options