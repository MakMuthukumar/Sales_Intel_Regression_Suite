Feature: Validate Search By Contact Name

#  @First @Sanity
#  Scenario: To validate application scroll up
#    When Click On Company Tab
#    And Move the SalesIntel Website Screen Down
#
#  @First @Sanity
#  Scenario: To validate application scroll down
#    Then Move the SalesIntel Website Screen Up
#
#  @First @Sanity
#  Scenario: To validate application Upload a file
#    Then Click On Browse Button
#    And Upload File From Local Directory

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

  @First @Sanity
  Scenario: To validate application Search Page Content is displayed
    Then Verify Individual section is displayed
    And Verify Contact Name is displayed
    When Click on Contact Name Button
    Then Verify First Name is displayed
    And Verify Last Name is displayed

  @First @Sanity
  Scenario: To validate application Search without Firstname and LastName
    When Click on Search Button

  @First @Sanity
  Scenario: To validate application Search by FirstName and LastName using Integer Value
    When Click on Contact Name Button
    And Enter the First Name with Integer Value
    And Enter the Last Name with Integer Value
    And Click on Search Button
    Then Verify Error Message is displayed When search with FirstName and LastName only Integer

  @First @Sanity
  Scenario: To validate application Search by Valid FirstName and LastName
    When Clear the Text in First Name Field
    And Clear the Text in Last Name Field
    And Enter the First Name
    And Enter the Last Name
    And Click on Search Button
    And Validate Search Result
    When Clear the Text in First Name Field
    And Clear the Text in Last Name Field

  @First @Sanity
  Scenario: To validate application add multiple contact into New Contact List
    And Click On Clear Button
    And Click On Do Not Save Button
    When Click on Contact Name Button
    And Enter the First Name
    And Enter the Last Name
    And Click on Search Button
    And Validate Search Result
    And Select Multiple contact to Add Contact List
    And Append Contact details into the List
    And Click On Add all to List
    And Click On Create New Contact List
    When Enter New Contact List
    And Click On Create New Contact List Save Button

  @First @Sanity
  Scenario: To validate application Contact into the Contact List
#    When Click On List Tab
#    Then Select Preview Button
#    And Compare Contact details into the List

  @First @Sanity
  Scenario: To validate application add multiple contact into Existing Contact List
#    When Click On List Tab
    And Click On Clear Button
    And Click On Do Not Save Button
    When Click on Contact Name Button
    And Enter the First Name to search
    And Click on Search Button
    And Validate Contact Search Result
    And Select Multiple contact to Add Contact List
    And Append Contact details into the List
    And Click On Add all to List
    And Click On Add all Contact to Existing List
    And Click on Contact List Drop Down Option
    And Click On Add Contact List Save Button

  @First @Sanity
  Scenario: To validate application Delete Contact List
    And Click On List Tab
    And Delete Contact List
    And Click On Delete Contact List

  @First @Sanity
  Scenario: To validate application Reveal Contact1 Search by Valid FirstName and LastName
    When Click On Contact Tab
#    Then Click on Contact Name Button
    And Clear the Text in First Name Field
    And Enter the Search First Name1
    And Enter the Search Last Name1
    And Click on Search Button
    And Click On Contact Search1
    When Verify Reveal Contact Search Button is displayed
    And Click On Reveal Contact Search Button
    And Get the Total Reveal Count

  @First @Sanity
  Scenario: To validate application Reveal Contact2 Search by Valid FirstName and LastName
    When Clear the Text in First Name Field
    And Clear the Text in Last Name Field
    And Enter the Search First Name2
    And Enter the Search Last Name2
    And Click on Search Button
    And Click On Contact Search2
    When Verify Reveal Contact Search Button is displayed
    And Click On Reveal Contact Search Button
    And Get the Total Reveal Count

  @First @Sanity
  Scenario: To validate application Reveal Contact3 Search by Valid FirstName and LastName
    When Clear the Text in First Name Field
    And Clear the Text in Last Name Field
    And Enter the Search First Name3
    And Enter the Search Last Name3
    And Click on Search Button
    And Click On Contact Search3
    When Verify Reveal Contact Search Button is displayed
    And Click On Reveal Contact Search Button
    And Get the Total Reveal Count

  @First @Sanity
  Scenario: To validate application Reveal Contact4 Search by Valid FirstName and LastName
    When Clear the Text in First Name Field
    And Clear the Text in Last Name Field
    And Enter the Search First Name4
    And Enter the Search Last Name4
    And Click on Search Button
    And Click On Contact Search4
    When Verify Reveal Contact Search Button is displayed
    And Click On Reveal Contact Search Button
    And Get the Total Reveal Count

  @First @Sanity
  Scenario: To validate application Reveal Contact5 Search by Valid FirstName and LastName
    When Clear the Text in First Name Field
    And Clear the Text in Last Name Field
    And Enter the Search First Name5
    And Enter the Search Last Name5
    And Click on Search Button
    And Click On Contact Search5
    When Verify Reveal Contact Search Button is displayed
    And Click On Reveal Contact Search Button
    And Get the Total Reveal Count

  @First @Sanity
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options