Feature: Validate Search By Job Department

  @First @Sanity @Test
  Scenario: To validate SalesIntel application login Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

  @First @Sanity @Test
  Scenario: To validate application Search By Job Department section contents
    When Verify Role Section is displayed
    And Verify Job Department is displayed
    And Click on Contact Radio Button

  @First @Sanity @Test
  Scenario: To validate application Search without Job Department Filter
    Then Click on Search Button

  @First @Sanity @Test
  Scenario: To validate application Search by Finance Job Department Filter
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Finance Department Filter
    And Click on Search Button
    Then Check Finance Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Finance Job Department Filter
    #Then Check Finance Department in All Searched Results


  @First @Sanity @Test
  Scenario: To validate application Search by HR Job Department Filter
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on HR Department Filter
    And Click on Search Button
    Then Check HR Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by HR Job Department Filter
    #Then Check HR Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by IT Job Department Filter
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on IT Department Filter
    And Click on Search Button
    Then Check IT Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by IT Job Department Filter
    #Then Check IT Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by Legal Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Legal Department Filter
    And Click on Search Button
    Then Check Legal Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Legal Job Department Filter
    #Then Check Legal Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by Marketing Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Marketing Department Filter
    And Click on Search Button
    Then Check Marketing Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Marketing Job Department Filter
    #Then Check Marketing Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by Operations Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Operations Department Filter
    And Click on Search Button
    Then Check Operations Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Operations Job Department Filter
    #Then Check Operations Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by Procurement Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Procurement Department Filter
    And Click on Search Button
    Then Check Procurement Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Procurement Job Department Filter
    #Then Check Procurement Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by R&D Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on R&D Department Filter
    And Click on Search Button
    Then Check R&D Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by R&D Job Department Filter
    #Then Check R&D Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by Sales Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Sales Department Filter
    And Click on Search Button
    Then Check Sales Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Sales Job Department Filter
    #Then Check Sales Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Search by Cross Functional Job Department Filter
    When Click On Clear Button
    And Click On Do Not Save Button
    And Click on Job Department Filter
    Then Click on Cross Functional Department Filter
    And Click on Search Button
    Then Check Cross Functional Department in Search Result

  @Reg @Test
  Scenario: To validate application Search by Cross Functional Job Department Filter
    #Then Check Cross Functional Department in All Searched Results

  @First @Sanity @Test
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options
