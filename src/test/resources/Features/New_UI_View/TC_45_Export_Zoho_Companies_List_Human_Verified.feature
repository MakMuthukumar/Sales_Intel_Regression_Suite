  Feature: To Validate Application Export Zoho Human Verified Companies From List View
  
 	@First @Sanity @Credit_Export1
	Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export1
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
   	Then Click On Login Button
   	
  @First @Sanity @Credit_Export1
  Scenario: To validate SalesIntel application Export Zoho Human Verified Companies From List View
  When Click on Lists View
  And Click on count to Sort the companies list
  And Click on company export link
  And Click on Human verified export icon
  And Click on Zoho Companies From List View
  And Perform the Export companies to Zoho
  And Click On Close Button
  
  @First @Sanity @Credit_Export1
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
    
    