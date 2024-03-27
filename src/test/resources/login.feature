@REGRESSION @LOGIN
Feature: User login for Music Streaming App
  As a user, I want to be able to login to my account
  so that I can access the feature of the application

  Background:
    Given the user is on the homepage



  Scenario: Successful login wih a valid username and password

    When the user enters valid username and password
    Then the user should be directed to the personal dashboard

  @unsuccessful
  Scenario: Unsuccessful login wih a invalid username and password

    When the user enters invalid username and password
    Then the user should not be directed to the personal dashboard


  @unsuccessful
  Scenario: Unsuccessful login wih no username and password

    When the user enters no username and password
    Then the user should not be directed to the personal dashboard





