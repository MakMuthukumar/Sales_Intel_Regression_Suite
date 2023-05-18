Feature: To validate Saved Search Tab

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To Create Save search By applying any filter
    When Click on Industry Filter
    And Enter Industry Name
    And Click on Particular Industry
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on save search Button
    And Enter Save Search Name
    #And Select Visibility of Save search
    Then Click on save button for Save Search
    Then Validate the Created Save search is displayed in Saved Search Tab
    Then Check The visibility and date of the saved search in the Saved Search Tab
    Then Check Edit and Save button are working fine
    Then Delete the created Saved Search


  @First @Sanity
  Scenario: To check Saved Search count is increasing by 1 and search by name when we create a saved search
    When Create a saved search and check Saved searches are increased by 1
    And Delete the created Saved Search
    Then Click On SalesIntel Tab

  @First @Sanity
  Scenario: To search with single character in the Saved Searches Tab
    When Click on saved searches tab
    And Search by Single character
    Then Check Search Results when we search with a single character

  @First @Sanity
  Scenario: To search with Multiple characters in the Saved Searches Tab
    When Click on saved searches tab
    And Search by Multiple characters
    Then Check Search Results when we search with Multiple characters

  @First @Sanity
  Scenario: To search with Numeric values in the Saved Searches Tab
    When Click on saved searches tab
    And Search by Numeric Values
    Then Check Search Results when we search with Numeric Values

  @First @Sanity
  Scenario: To search with Alphanumeric values in the Saved Searches Tab
    When Click on saved searches tab
    And Search by Alphanumeric Values
    Then Check Search Results when we search with Alphanumeric Values
#    And Click On SalesIntel Tab

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate checkbox of Include Team Searches in the Saved Searches Tab
    When Click on saved searches tab
    And Check visibility as Team when Checkbox is checked
    And Check visibility as Private when checkbox is checked
    And Check visibility as Team is not displayed when checkbox is unchecked


  @First @Sanity
  Scenario: To validate the content of Edit Saved Search is displayed
    When Click on edit icon of First Saved Search
    And Check all content is displayed for edit popup
    And Click on edit icon of First Saved Search
    And Click on Cancel button


  @First @Sanity
  Scenario: To validate the functionalities of Edit Saved Search
    When Click On SalesIntel Tab
    And Click on Job Department Filter
    And Click on Finance Department Filter
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on save search Button
    And Enter Save Search Name
    #And Select Visibility of Save search
    And Click on save button for Save Search
    And Click on saved searches tab
    And Click on Include Team searches checkbox
    And Edit the Saved Search details
    Then validate the Edited details of saved search
    And Click on saved searches tab
    And Edit the Saved Search details one more time
    Then validate the Edited details of saved search One more time
    And Click on saved searches tab
    And Delete the created Saved Search


  @First @Sanity
  Scenario: To validate Navigation to the SalesIntel tab when we click on contact saved search
    When Click On SalesIntel Tab
    And Click On Clear Button
    And Click on Job Department Filter
    And Click on HR Department Filter
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on save search Button
    And Enter Save Search Name
    #And Select Visibility of Save search
    #And Select View of the saved search as Contact
    And Click on save button for Save Search
    And Click on saved searches tab
    And Search by Created name
    And Click on the First Saved Search
    Then Validate the Navigation to the SalesIntel Tab for Contact view

  @First @Sanity
  Scenario: To validate Update functionality of the Saved Search
    When Click On Clear Button
    And Click on Industry Filter
    And Enter Industry Name
    And Click on Particular Industry
    And Click on Search Button
    And Click on save search Button
    And Enter Save Search Name
    #And Select Visibility of Save search
    #And Select View of the saved search as Contact
    And Click on save button for Save Search
    And Click on saved searches tab
    And Search by Created name
    And Click on the First Saved Search
    And Click on Title Filter
    And Enter Title in Title filter
    And Click on Search Button
    And Click on save search Button
    And Click on Update Button in the update pop-up
    And Click on saved searches tab
    And Search by Created name
    And Click on the First Saved Search
    Then Validate the updated details of the saved search with the same name

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate the functionalities of Name Sorting icon in the Saved search tab
    When Click on saved searches tab
    And Click on Sorting icon of Name for Ascending order
    Then Check the search results of Name for Ascending order
    And Click on Sorting icon of Name for Descending order
    Then Check the search results of Name for Descending order

  @First @Sanity
  Scenario: To validate My saved Searched in the SalesIntel tab
    When Click On SalesIntel Tab
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on My Saved Searches Dropdown
    And Select a saved Search
    Then Validate the Saved Search

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options