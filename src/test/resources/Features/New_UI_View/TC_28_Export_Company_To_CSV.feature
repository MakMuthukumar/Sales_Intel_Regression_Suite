  Feature: To validate Export Company To CSV
  
   @First @Sanity @Credit_Export
 	 Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button
    
  @First @Sanity @Credit_Export
  Scenario: To validate application Export to CSV company Human Verified details
    Then Click on Company Radio Button
    When Click on Search Button
    And Click on Human Verified field
    And Click on 1st company checkbox
    And Click on Bulk Actions Dropdown
		And Click on Export to CSV Option
		And Enter The Company CSV Exort Details
		And Click On Submit Button
		
#	@First @Sanity @Credit_Export
  #Scenario: To validate application Export to CSV company Machine Verified details
    #When Click on Machine Verified field
    #And Click on 1st company checkbox
    #And Click on Bulk Actions Dropdown
#		And Click on Export to CSV Option
#		And Enter The Company CSV Exort Details
#		And Click On Submit Button
		
	@First @Sanity @Credit_Export
  Scenario: To validate application Export to CSV contact Human Verified details
   	When  Click on Contact Radio Button
    And Click on Search Button
    And Click on Contact Human Verified field
    And Click on 1st Contact checkbox
		And Click on Contact CSV Bulk Actions Dropdown
		And Click on Contact Export to CSV Option
		And Enter The Contact CSV Exort Details
		And Click On Submit Button
		
#	@First @Sanity @Credit_Export
  #Scenario: To validate application Export to CSV contact Machine Verified details
  #	When Click on Machine Verified field
   #	And Click on 1st Contact checkbox
#		And Click on Contact Bulk Actions Dropdown
#		And Click on Contact Export to CSV Option
#		And Enter The Contact CSV Exort Details
#		And Click On Submit Button
		
	@First @Sanity @Credit_Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
  
  
    