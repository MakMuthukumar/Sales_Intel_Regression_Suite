Feature: To validate Search by Technographics

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url 
  	
  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Any Products in Technographics filter
    When Validate TECHNOGRAPHICS is displayed
    And Click on Products Filter
    And Click on Technographic product text box
    And Enter the product name
    And Click on Company Radio Button
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check Any technographic product in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check Any Product in All search results
    #Then Check Any technographic product in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Search by All Products in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Products Filter
    And Click on All Button in Products
    And Click on Technographic product text box
    And Enter the product name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check All technographic products in Company detail page
    And Click on SalesIntel Logo


  @Reg
  Scenario: To Check All Products in All search results
    #Then Check All technographic products in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Search by None Products in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Products Filter
    And Click on None Button in Products
    And Click on Technographic product text box
    And Enter the product name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check None of the technographic product is displayed in Company detail page
    And Click on SalesIntel Logo


  @Reg
  Scenario: To Check None of the Product in All search results
    #Then Check None of the technographic products in Company detail page of All Searched Results


  @First @Sanity
  Scenario: To validate Search by Any Provider in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Provider Filter
    And Click on Technographic Provider text box
    And Enter the Provider name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check Any technographic Provider in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check Any Provider in All search results
    #Then Check Any technographic Provider in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Search by All Provider in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Provider Filter
    And Click on All Button in Provider
    And Click on Technographic Provider text box
    And Enter the Provider name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check All technographic Providers in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check All Provider in All search results
    #Then Check All technographic Providers in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Search by None Provider in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Provider Filter
    And Click on None Button in Provider
    And Click on Technographic Provider text box
    And Enter the Provider name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check None of the technographic Provider is displayed in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check None of the Provider in All search results
    #Then Check None of the technographic Providers in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Select All Checkbox where Search by Any Category in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Categories Filter
    And Select All Check box for Categories
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check Any technographic Category in Company detail page


  @First @Sanity
  Scenario: To validate Search by Any Category in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Categories Filter
    And Enter the Category name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check Any technographic Provider in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check Any Category in All search results
    #And Check Any technographic Category in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Search by All Category in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Categories Filter
    And Click on All Button in Category
    And Enter the Category name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check All technographic Category in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check All Category in All search results
    #And Check All technographic Category in Company detail page of All Searched Results

  @First @Sanity
  Scenario: To validate Search by None Category in Technographics filter
    When Click on SalesIntel Logo
    And Click On Clear Button
    And Click On Do Not Save Button
    And Validate TECHNOGRAPHICS is displayed
    And Click on Categories Filter
    And Click on None Button in Category
    And Enter the Category name
    And Click on Search Button
    And Click on company name
    And Click on All in Company detail page
    Then Check None of the technographic Category is displayed in Company detail page
    And Click on SalesIntel Logo

  @Reg
  Scenario: To Check None Category in All search results
    #And Check None of the technographic Category in Company detail page of All Searched Results

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
