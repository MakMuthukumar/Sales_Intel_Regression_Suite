Feature: Validate Search by Location

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity @Test
  Scenario: To validate Search by States in USA Location
    When Verify Location filter is Displayed
    Then Click on Location Tab
    Then Click on State Combobox
    Then Enter the Data in State Combobox
    And Click on Contact Radio Button
    And Click on Search Button
    Then Check CA for California State in Search Result

  @Reg @Test
  Scenario: To validate All Searched Results of California State
    #Then Check California State in All Searched Results

  @First @Sanity @Test
  Scenario: To validate Search by Zip Code in USA Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Zip code under USA
    And Enter Zip Code in the text field
#    And Select 100 Miles in the dropdown
    And Click on Search Button
    Then Check CA for California State in Search Result

  @Reg @Test
  Scenario: To validate All Searched Results of California State
    #Then Check California State in All Searched Results

  @First @Sanity @Test @Test
  Scenario: To validate Search by Metro Areas in USA Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    And Click on Metro Areas under USA
    And Click on Metro Areas Text Field
    And Enter Albany GA Metro Area
    Then Click on Search Button
    Then Check Metro Area in Search Result

  @Reg @Test
  Scenario: To validate All Searched Results of Metro Areas in USA Location
  #Then Check Albany GA Metro Area in All Searched Results

  @First @Sanity @Test
  Scenario: To validate Search by Non-USA Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    #And Click on Non USA Radio Button
    And Click on Country Input Box
    And Enter Non USA Country Name
    And Click on Search Button
    Then Check Country in Location in Search Result

  @Reg @Test
  Scenario: To validate All Search results of Non-USA Location
    #Then Check Non-USA Location in All Searched Results

  @First @Sanity @Test
  Scenario: To validate Search by Global Location
    When Click On Clear Button
    And Click On Do Not Save Button
    And Verify Location filter is Displayed
    And Click on Location Filter
    #And Click on Global Radio Button
    And Click on Country Input Box
    And Enter Global Country Name
    And Click on Search Button
    Then Check Global Country in Location in Search Result

  @Reg @Test
  Scenario: To validate All Search Results of Global Location
    #Then Check Global Location in All Searched Results

  @First @Sanity @Test
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options




