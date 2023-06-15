Feature: To validate Search by Results Include Filter

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
  	Given Launch the url
  	
  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    When Enter Valid Username
    And Enter Valid Password
    Then Click On Login Button

  @First @Sanity
  Scenario: To validate Search by Results Include Address
    When Check Result include Filter is displayed
    And Click on Contact Radio Button
    And Click on Result Include Filter
    And Select Address CheckBox    
    And Click on Search Button
    Then Check Whether Results include Address

  @Reg
  Scenario: To Check Address in All search results
    #Then Check Address in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Results Include Any Phone
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Any Phone CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Any Phone
    And Click on the First Contact in Search Result

  @Reg
  Scenario: To Check Any Phone in All search results
    #Then Check AnyPhone in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Results Include Any Direct Phone
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Any Direct Phone CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Any Direct Phone

  @First @Sanity
  Scenario: To validate Search by Results Include Any Mobile Phone
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Any Mobile Phone CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Any Mobile Phone

  @First @Sanity
  Scenario: To validate Search by Results Include Personal Email
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Personal Email CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Personal Email
    And Click on the First Contact in Search Result

  @Reg
  Scenario: To Check Personal Email in All search results
    #Then Check PersonalEmail in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Results Include LinkedIn Url
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select LinkedIn Url CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include LinkedIn Url
    And Click on the First Contact in Search Result

  @Reg
  Scenario: To Check LinkedIn URL in All search results
    #Then Check LinkedInURL in All Searched Results

  @First @Sanity
  Scenario: To validate Search by Results Include Title
    When Click On Clear Button
    And Click On Do Not Save Button
    And Check Result include Filter is displayed
    And Click on Result Include Filter
    And Select Title CheckBox
    And Click on Search Button
    And Click on the First Contact in Search Result
    And Click On Reveal Contact Search Button
    Then Check Whether Results include Title
    And Click on the First Contact in Search Result

  @Reg
  Scenario: To Check Job Title in All search results
    #Then Check JobTitle in All Searched Results

  @First @Sanity
  Scenario: Logout the application
    When Click On Setting Options
    Then Click On Logout Options