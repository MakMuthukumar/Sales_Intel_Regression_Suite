Feature: Validate Search By Company

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  Given Launch the url
  
  @First @Sanity @Test
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

  @First @Sanity @Test
  Scenario: To validate application Search without Company Name
    Then Click on Company Radio Button
    When Click on Search Button
#    When Click On Company Tab
#    And Click on Company Search Button

  @First @Sanity @Test
  Scenario: To validate application Search by Valid Company Name
    And Click On Clear Button
    And Click On Do Not Save Button
    When Click On Company
    #And Click On Company Input Text Field
    And Enter Valid Company Name
    And Click on Search Button
    And Validate Company Search Result

  @First @Sanity @Test
  Scenario: To validate application add multiple Company into New Company List
    And Click On Clear Button
    And Click On Do Not Save Button
    When Click On Company
    And Enter Valid Company Name
    And Click on Search Button
    And Validate Company Search Result
    And Select Multiple Company to Add Company List
    And Append Company details into the List
    And Click On Add all to List
    And Click On Create New Company List
    When Enter New Company List
    And Click On Create New Company List Save Button

#  @First @Smoke @Reg
#  Scenario: To validate application Company into the Company List
#    When Click On List Tab
#    Then Select Preview Button
##    And Compare Contact details into the List

  @First @Sanity @Test
  Scenario: To validate application add multiple Company into Existing Company List
    Then Click On SalesIntel Tab
#    When Click On List Tab
#    When Click On Company Tab
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click On Company
    And Enter Valid Company Name
    And Click on Search Button
    And Validate Company Search Result
    And Select Multiple Company to Add Company List
    And Append Company details into the List
    And Click On Add all to List
    And Click On Add Existing Company List
    And Click on Company List Drop Down Option
    And Click On Add Company List Save Button

  @First @Sanity @Test
  Scenario: To validate application Delete Company List
    And Click On List Tab
    And Delete Company List
    And Click On Delete Company List

  @First @Sanity @Test
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options