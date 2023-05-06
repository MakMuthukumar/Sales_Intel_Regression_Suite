  Feature: To Validate Export Companies And Check The Details In File Center
  
   @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export Companies And Check The Details In File Center
    When Click on Company Radio Button
    And Click On Industry Dropdown Right Button
    And Select The Any One Of The Industry List
    And Click on Search Button
    And Get The Machine Verified Details
    And Click on Machine Verified field
    And Click On Export All Companies Button
    And Click On CSV Option
    And Get The Input From the Text Field
    And Click On Submit Button 
    And Wait Fot Few Minutes To Update The Data
    And Click on Welcome Label Dropdown Arrow
    And Click on File Center Label
    Then Validate The Job Name For Companies
		And Validate The Data Type For Companies
		And Validate The Number Of Records For Companies
		And Validate The Status For Companies
		
	@First @Sanity @Credit_Export
  Scenario: To download the Export Companies From File Center
  	When Click On Companies Export CSV Icon to Download CSV File
  	 	
  @First @Sanity @Credit_Export
  Scenario: Logout the application
  	When Click On Close Button On Export CSV
    And Click On Setting Options
    Then Click On Logout Options
    
    
    