  Feature: To Validate Application Preview The Bulk Contacts 
  
   @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To Validate Application Preview The Bulk Contacts 
    When Click on Contact Radio Button
    And Click on Search Button
    And Click on Contact Machine Verified field
    And Get The Crdit Available Count
    And Click on Select All CheckBox
    And Click on Contact Bulk Actions Dropdown
		And Click on Contact preview Option
		And Click On Submit Button 
		Then Validate the Crdit Available Count Details
		
	@First @Sanity @Credit_Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
    