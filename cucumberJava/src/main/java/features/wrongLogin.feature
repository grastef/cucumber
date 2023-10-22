Feature: feature to test login functionality

  Scenario: Check login is faild with wrong credentials
    Given user is on login page
    When user enters wrong username and wrong password
    And click on login button
    Then user get error message


