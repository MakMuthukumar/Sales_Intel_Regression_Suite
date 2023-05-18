  Feature: To Validate Export Contacts And Check The Details In File Center
  
   @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export Contacts And Check The Details In File Center
  	When Click On Clear Button
    And Click on Contact Radio Button
    And Click On Industry Dropdown Right Button
    And Click On Any One Of The Industry List
    And Click on Search Button
    And Get The Machine Verified Contacts Details
    And Click on Machine Verified field
    And Click On Export All Contacts Button
    And Click On CSV Option
    And Get The Input From the Contacts Text Field
    And Click On Submit Button 
    And Wait Fot Few Minutes To Update The Contact Data
    And Click on Welcome Label Dropdown Arrow
    And Click on File Center Label
    Then Validate The Job Name For Contacts
		And Validate The Data Type For Contacts
		And Validate The Number Of Records For Contacts
		And Validate The Status For Contacts
		
	@First @Sanity @Credit_Export
  Scenario: To download the Export Companies From File Center
  	When Click On Contacts Export CSV Icon to Download CSV File

  	
  @First @Sanity @Credit_Export
  Scenario: Logout the application
  	When Click On Close Button On Export CSV
    When Click On Setting Options
    Then Click On Logout Options
    