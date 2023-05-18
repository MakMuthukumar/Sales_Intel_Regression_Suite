Feature: To validate List Tab

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To Create, Validate, navigate and delete the Company List
    When Click On List Tab
    And Click on create List button
    And Click on Create company list button
    And Enter List Name For Data Enrichment
    And Click on download template
    And Click On Choose File Button
    And Upload File From Local Directory For company List
    #And Click On Clear CSV
    #And Click On Choose File Button
    #And Upload File From Local Directory For company List
    And Click on Next button
    And Click on save button
    And Click on Close Button
    Then Validate the Created Company list in List Tab
    Then Validate the edition and Deletion for the created Company List
    Then Validate the navigation from the Created List
    And Delete the created List

  @First @Sanity
  Scenario: To Create, Validate, navigate and delete the Contact List
    And Click on create List button
    And Click on Create Contact list button
    And Enter List Name For Data Enrichment
    And Click on download template
    And Click On Choose File Button
    And Upload File From Local Directory For contact List
    #And Click On Clear CSV
    #And Click On Choose File Button
    #And Upload File From Local Directory For contact List
    And Click on Next button
    And Click on save button
    And Click on Close Button
    Then Validate the Created Contact list in List Tab
    Then Validate the edition and Deletion for the created Contact List
    Then Validate the navigation from the Created List
    And Delete the created List

  @First @Sanity
  Scenario: To Create, Validate, navigate and delete the Suppression List
    And Click on create List button
    And Click on Create Suppression list button
    And Enter List Name For Data Enrichment
    And Click on download template
    And Click On Choose File Button
    And Upload File From Local Directory For Suppression List
    #And Click On Clear CSV
    #And Click On Choose File Button
    #And Upload File From Local Directory For Suppression List
    And Click on Next button
    And Click on save button
    And Click on Close Button
    Then Validate the Created Suppression list in List Tab
    Then Validate the edition and Deletion for the created Suppression List
    Then Validate the navigation from the Created List
    And Delete the created List

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options