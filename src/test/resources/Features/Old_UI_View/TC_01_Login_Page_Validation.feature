Feature: Validate application login Page

  @First @Sanity
  Scenario: To validate SalesIntel application Launching application
  Given Launch the url

  @First @Sanity
  Scenario: To validate SalesIntel application Login Screen Content
  Then Validate Login Page Title is displayed
  And Validate Email Field is displayed
  And Validate Password Field is displayed
  And Validate Remember Me Checkbox is displayed
  And Validate Forgot Password Link is displayed
  And Validate FAQ Link is displayed
  And Validate Login Button is displayed

  @First @Sanity
  Scenario: To validate SalesIntel application Tapping only Login Button
  When Click On Login Button
  Then Validate Error Text when Tried with Invalid Username and Invalid Password
  And Validate Error Text when Tried with Invalid Password and Invalid Username

  @First @Sanity
  Scenario: To validate SalesIntel application Login with Invalid Username and Valid Password
  When Enter Invalid Username
  And Enter Valid Password
  And Click On Login Button
  Then Validate Error Text when Tried with Invalid Username and Valid Password

  @First @Sanity
  Scenario: To validate SalesIntel application Login with Valid Username and Invalid Password
  When Clear the Text in Username Field
  And Clear the Text in Password Field
  And Enter Valid Username
  And Enter Invalid Password
  And Click On Login Button

  @First @Sanity
  Scenario: To validate SalesIntel application Login with Invalid Username and Invalid Password
  When Clear the Text in Username Field
  And Clear the Text in Password Field
  And Enter Invalid Username
  And Enter Invalid Password
  And Click On Login Button
  Then Validate Error Text when Tried with Invalid Username and Valid Password

  @First @Sanity
  Scenario: To validate SalesIntel application Forget Password
  When Click on Forget Password
  Then Verify Forget Email Address Field is displayed
  When Enter Forget Email Address
  Then Verify Reset Password Button is displayed
  When Click On Reset Password Button

  @First @Sanity
  Scenario: To validate SalesIntel application Remember Me
  When Click on Remember Me

  @First @Sanity
  Scenario: To validate SalesIntel application Valid User Username and Valid Password
  When Click on Remember Me
  And Clear the Text in Username Field
  And Clear the Text in Password Field
  And Enter Valid Username
  And Enter Valid Password
  And Click On Login Button

  @First @Sanity
  Scenario: To validate application Logout
    When Click On Setting Options
    And Click On Logout Options