@login
Feature: login
   As i user I should able to login with valid credential

Background: login page
  Given user on the login page



@positive
  Scenario: login with correct credential
    When user enter valid email and password
    Then display  dashboard


 @nagative
    Scenario: login with incorrect email/username and password
      When user enter incorrect email and password
      Then display error message1 "Unknown email address. Check again or try your username."

  @nagative
  Scenario: login with valid email/username ,invalid password
    When user enter incorrect email and correct password
    Then display error message2 "Unknown email address. Check again or try your username."


  @nagative
  Scenario: login with correct email/username
    When user enter correct email and incorrect password
    Then display error message contains "The password you entered for the email address"