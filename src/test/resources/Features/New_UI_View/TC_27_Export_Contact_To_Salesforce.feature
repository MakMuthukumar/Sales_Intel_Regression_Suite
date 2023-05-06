  Feature: To validate Export Contact To Salesforce 
  
  @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
    
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username Export Company To Salesforce
    And Enter Valid Password Export Company To Salesforce
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export to Salesforce company details
    When Click on Contact Radio Button
    And Click on Search Button
    And Get The Monthly license credits count 
    And Get The Share Credits count
    And Click on 1st Contact checkbox
		And Click on Contact Bulk Actions Dropdown
		And Click on Contact Export to Salesforce Option
		And Click on Export As Lead Option
    And Perform Export Contacts To Salesforce Window
    And Validate the Monthly license credits count
		And Validate the Share Credits count for Export to Salesforce
						
	@First @Sanity @Credit_Export
  Scenario: Logout the application
  	When Click on Cancel, If the Cancel button is present
    And Click On Setting Options
    Then Click On Logout Options