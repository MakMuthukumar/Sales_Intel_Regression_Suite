Feature: Validate Search by Contact Location

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by States in Contact USA Location
    When Verify Contact Location filter is Displayed
    Then Click on Contact Location Filter
    Then Click on State Combobox for Contact
    Then Enter the Data in State Combobox for Contact
    And Click on Contact Radio Button
    And Click on Search Button
    Then Check CA for California State in Search Result

  @Reg
  Scenario: To validate All Searched Results of California State
    Then Check California State in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Zip Code in USA Contact Location
    When Click On Clear Button
    And Click On Do Not Save Button
    When Verify Contact Location filter is Displayed
    Then Click on Contact Location Filter
    And Click on Zip code under USA for Contact
    And Enter Zip Code in the text field for Contact
#    And Select 100 Miles in the dropdown
    And Click on Search Button
    Then Check CA for California State in Search Result

  @Reg
  Scenario: To validate All Searched Results of California State
    Then Check California State in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Metro Areas in USA Contact Location
    When Click On Clear Button
    And Click On Do Not Save Button
    When Verify Contact Location filter is Displayed
    Then Click on Contact Location Filter
    And Click on Metro Areas under USA for Contact
    And Click on Metro Areas Text Field For Contact
    And Enter Albany GA Metro Area For Contact
    Then Click on Search Button
    Then Check Metro Area in Search Result

  @Reg
  Scenario: To validate All Searched Results of Metro Areas in USA Location
    Then Check Albany GA Metro Area in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Non-USA Contact Location
    When Click On Clear Button
    And Click On Do Not Save Button
    When Verify Contact Location filter is Displayed
    Then Click on Contact Location Filter
    And Click on Country Input Box For Contact
    And Enter Non USA Country Name for Contact
    And Click on Search Button
    Then Check Country in Location in Search Result

  @Reg
  Scenario: To validate All Search results of Non-USA Location
    Then Check Non-USA Location in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Global Location
    When Click On Clear Button
    And Click On Do Not Save Button
    When Verify Contact Location filter is Displayed
    Then Click on Contact Location Filter
    And Click on Country Input Box For Contact
    And Enter Global Country Name For Contact
    And Click on Search Button
    Then Check Global Country in Location in Search Result

  @Reg
  Scenario: To validate All Search Results of Global Location
    Then Check Global Location in All Searched Results

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options
