Feature: To validate Credit Deduction

  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url

  @First @Sanity @Credit_Export
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username Export Company To Salesforce
    And Enter Valid Password Export Company To Salesforce
    Then Click On Login Button

  @First @Sanity @Credit_Export
  Scenario: To validate Credit Deduction for contact Reveal
    When Click on Contact Radio Button
    When Click on Search Button
    And Clcik on Machine verified Radio button
    And Get the credit count before reveal
    And Find non revealed contact and click on Reveal button
    And Validate the Credit after revealing the contact
  
   @First @Sanity @Credit_Export
  	Scenario: To validate Credit Deduction for Monthly license credits contact Reveal
  	When Get The Monthly license credits count 
  	And Validate the Monthly license credits count
  	
  	@First @Sanity @Credit_Export
  	Scenario: To validate Credit Deduction for Share Credits contact Reveal
  	When Get The Share Credits count
  	And Validate the Share Credits count

  @First @Sanity @Credit_Export
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options