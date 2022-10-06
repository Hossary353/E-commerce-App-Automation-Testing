  @smoke
  Feature: f01_regfeature | user could register with new accounts
    Scenario: guest user register with valid data successfully
      Given user go to register page
      And user select gender type
      And user enter first name "automation" and last name "tester"
      And user enter date of birth
      When user enter email "test@exampless.com" field
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      Then user clicks on register button
      And success message is displayed

