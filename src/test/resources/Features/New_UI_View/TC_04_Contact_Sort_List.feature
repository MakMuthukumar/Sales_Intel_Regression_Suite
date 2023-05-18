Feature: Validate Contact by Sort Option

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Launching application
    Given Launch the url

  @First @Sanity @Test
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
    And Enter Valid Username
    And Enter Valid Password
    And Click On Login Button

  @First @Sanity @Test
  Scenario: To validate application to Sort the Contact Details by Name
#    And Click On Clear Button
#    And Click On Do Not Save Button
    Then Click on Contact Radio Button
    When Click on Search Button
    And Click On Sort Icon For Display Contact based on Contact Name
    And Click On Sort Icon For Display Contact based on Contact Name

  @First @Sanity @Test
  Scenario: To validate application to Sort the Contact Details by Job
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Search Button
    And Click On Sort Icon For Display Contact based on Job Title
    And Click On Sort Icon For Display Contact based on Job Title

  @First @Sanity @Test
  Scenario: To validate application to Sort the Contact Details by Job Level
#    And Click On Clear Button
#    And Click On Do Not Save Button
    And Click on Search Button
    And Click On Sort Icon For Display Contact based on Job Level
    And Click On Sort Icon For Display Contact based on Job Level

  @First @Sanity @Test
  Scenario: To validate application to Sort the Contact Details by Dept
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Search Button
    And Click On Sort Icon For Display Contact based on Dept
    And Click On Sort Icon For Display Contact based on Dept

  @First @Sanity @Test
  Scenario: To validate application to Sort the Contact Details by Comp
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Search Button
    And Click On Sort Icon For Display Contact based on Comp
    And Click On Sort Icon For Display Contact based on Comp

  @First @Sanity @Test
  Scenario: To validate application to Sort the Contact Details by Location
    And Click On Clear Button
    And Click On Do Not Save Button
    And Click on Search Button
    And Click On Sort Icon For Display Contact based on Location
    And Click On Sort Icon For Display Contact based on Location

  @First @Sanity @Test
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options