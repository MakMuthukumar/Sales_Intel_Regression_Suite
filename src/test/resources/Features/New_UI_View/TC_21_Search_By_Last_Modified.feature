Feature: To validate Search by Last Modified Filter

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Last Modified Within last 7 Days
    When Check Whether Last Modified Filter is Displayed
    And Click on Last Modified Date Filter
    And Click on Last Modified Dropdown
    And Select Within Last 7 Days
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    And get the Contact Work Email and store it
    And Launch Research Portal
    And Login To Research Portal
    And Search Contact With Email
    Then Validate the Last modified Date In Research Portal Where modified within 7 Days

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url

  @First @Sanity
  Scenario: To validate Last Modified Within last 14 Days
    When Check Whether Last Modified Filter is Displayed
    And Click on Last Modified Date Filter
    And Click on Last Modified Dropdown
    And Select Within Last 14 Days
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    And get the Contact Work Email and store it
    And Launch Research Portal
    And Login To Research Portal
    And Search Contact With Email
    Then Validate the Last modified Date In Research Portal Where modified within 14 Days

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url


  @First @Sanity
  Scenario: To validate Last Modified Within last 21 Days
    When Check Whether Last Modified Filter is Displayed
    And Click on Last Modified Date Filter
    And Click on Last Modified Dropdown
    And Select Within Last 21 Days
    And Click on Contact Radio Button
    And Click on Search Button
    And Click On Reveal Contact Search Button
    And Click on the First Contact in Search Result
    And get the Contact Work Email and store it
    And Launch Research Portal
    And Login To Research Portal
    And Search Contact With Email
    Then Validate the Last modified Date In Research Portal Where updated within 21 Days

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url


  @First @Sanity
  Scenario: To validate Last Modified Within last 30 Days
    When Check Whether Last Modified Filter is Displayed
    And Click on Last Modified Date Filter
    And Click on Last Modified Dropdown
    And Select Within Last 30 Days
    And Click on Contact Radio Button
    And Click on Search Button
    And Click On Reveal Contact Search Button
    And Click on the First Contact in Search Result
    And get the Contact Work Email and store it
    And Launch Research Portal
    And Login To Research Portal
    And Search Contact With Email
    Then Validate the Last modified Date In Research Portal Where updated within 30 Days

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url

  @First @Sanity
  Scenario: To validate Last Modified using Custom filter
    When Check Whether Last Modified Filter is Displayed
    And Click on Last Modified Date Filter
    And Click on Last Modified Dropdown
    And Select Custom filter
    And Check particular date is displayed
    And Click on Particular Date
    And get The Selected Date and Store it
    And Click on Contact Radio Button
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    And get the Contact Work Email and store it
    And Launch Research Portal
    And Login To Research Portal
    And Search Contact With Email
    Then Validate the Last modified Date In Research Portal Where updated within the Selected Date

  @First @Sanity
  Scenario: To Logout the Research Portal
    When Logout the Research Portal



