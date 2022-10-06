@smoke
  Feature: F02_Login | users could use login functionality to use their accounts
    Scenario: user could login with valid email and password
      Given user go to login page
      When user login with "valid" "test@exampless.com" and "P@ssw0rd"
      And user press on login button
      Then user login to the system successfully


    Scenario: user couldnot login with invalid email and password
      Given user go to login page
      When user login with "INvalid" "test123@exampless.com" and "P3@ssw0rd124"
      And user press on login button
      Then user login unsuccessful
