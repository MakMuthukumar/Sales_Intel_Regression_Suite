  Feature: To Validate Application Export CSV Machine Verified Companies From List View
  
 	@First @Sanity @Add_Company
	Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Add_Company
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
   	Then Click On Login Button
   	
  @First @Sanity @Add_Company
  Scenario: To validate SalesIntel application adding Company file into List View
  	When Click on Lists View
  	And Adding The Multiple Company Entry Into List View
  	
  @First @Sanity @Add_Company
  Scenario: Logout the application
  	When Click On Setting Options
  	Then Click On Logout Options
  	