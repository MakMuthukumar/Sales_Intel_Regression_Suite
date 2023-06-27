  Feature: To Validate Application Sales Intel Enrich Intel
  
 	@First @Sanity @Sales_Intel_Enrich_Intel
	Scenario: To validate Salesforce application Launching application
    Given Launch the Sales Force url
  
  @First @Sanity @Sales_Intel_Enrich_Intel
  Scenario: To validate Salesforce application Valid User Username and Valid Password
    When Enter Valid Username in Sales Force 
    And Enter Valid Password in Sales Force
    And Click On Remember me Checkbox
   	And Click On Login Button in Sales Force 
   	And Click On Remember me Later if popup comes
   	
  @First @Sanity @Sales_Intel_Enrich_Intel
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
  	When Click on SalesIntel Tab
    And Enter Valid Username in SalesIntel Tab 
    And Enter Valid Password in SalesIntel Tab
   	Then Click On Login Button
   	
 @First @Sanity @Sales_Intel_Enrich_Intel
  Scenario: To validate SalesIntel application - Selecting multiple contacts
  	When Wait for Page load
  	And Click on Contact Radio Button
  	And Click on Search Button
  	And Select Multiple contact to Add Contact List
  	And Click On Bulk Actions Button
  	And Click On Export Salesforce option
  	And Wait for Page load
  	And Click On Submit Button
   	
  @First @Sanity @Sales_Intel_Enrich_Intel
  Scenario: To validate Salesforce application - adding multiple contacts(First Lead) in leads page
  	When Wait for Page load
  	And Click on Leads Tab
  	And Click on New Button
  	And Enter the First Lead - First Name Input Field
  	And Enter the First Lead - Last Name Input Field
  	And Enter the First Lead - Company Input Field
  	And Enter the First Lead - Phone Input Field
  	And Enter the First Lead - Email Input Field
  	And Click On Save Button
  	
  @First @Sanity @Sales_Intel_Enrich_Intel1
  Scenario: To validate Salesforce application - adding multiple contacts(Second Lead) in leads page
  	When Wait for Page load
  	And Click on Leads Tab
  	And Click on New Button
  	And Enter the Second Lead - First Name Input Field
  	And Enter the Second Lead - Last Name Input Field
  	And Enter the Second Lead - Company Input Field
  	And Enter the Second Lead - Phone Input Field
  	And Enter the Second Lead - Email Input Field
  	And Click On Save Button
  	
  @First @Sanity @Sales_Intel_Enrich_Intel1
  Scenario: To validate Salesforce application - adding multiple contacts(Third Lead) in leads page
 		When Wait for Page load
  	And Click on Leads Tab
  	And Click on New Button
  	And Enter the Third Lead - First Name Input Field
  	And Enter the Third Lead - Last Name Input Field
  	And Enter the Third Lead - Company Input Field
  	And Enter the Third Lead - Phone Input Field
  	And Enter the Third Lead - Email Input Field
  	And Click On Save Button
  	
  @First @Sanity @Sales_Intel_Enrich_Intel1
  Scenario: To validate Salesforce application - adding multiple contacts(Fourth Lead) in leads page
  	When Wait for Page load
  	And Click on Leads Tab
  	And Click on New Button
  	And Enter the Fourth Lead - First Name Input Field
  	And Enter the Fourth Lead - Last Name Input Field
  	And Enter the Fourth Lead - Company Input Field
  	And Enter the Fourth Lead - Phone Input Field
  	And Enter the Fourth Lead - Email Input Field
  	And Click On Save Button
  	
  @First @Sanity @Sales_Intel_Enrich_Intel1
  Scenario: To validate Salesforce application - adding multiple contacts(Fifth Lead) in leads page
  	When Wait for Page load
  	And Click on Leads Tab
  	And Click on New Button
  	And Enter the Fifth Lead - First Name Input Field
  	And Enter the Fifth Lead - Last Name Input Field
  	And Enter the Fifth Lead - Company Input Field
  	And Enter the Fifth Lead - Phone Input Field
  	And Enter the Fifth Lead - Email Input Field
  	And Click On Save Button
  	