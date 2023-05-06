  Feature: To Validate Application Export Duplicates Companies From List View
  
 	@First @Sanity @Credit_Export1
	Scenario: To validate SalesIntel application Launching application
    Given Launch the url
  
  @First @Sanity @Credit_Export1
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
   	Then Click On Login Button
   	
  @First @Sanity @Credit_Export1
  Scenario: To validate SalesIntel application Export Duplicates Companies From List View
  When Click on Lists View
  And Click on count to Sort the companies list
  And Click on company export link
  And Click on Human verified duplicate export icon
  And Click on Export Original Records From List View
  And Click On Close Button For Duplicates Companies
  
  @First @Sanity @Credit_Export1
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
    
    