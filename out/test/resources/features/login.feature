Feature: login

  @login
  Scenario: login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro HomePage
    And User clicks on log in link
    And  User enters valid data
    And User clicks on Yalla button
    Then User verifies log in message
    And User quites browser

  @wrongPassword
  Scenario Outline: login with valid email and wrong password
    Given User launches Chrome Browser
    When User opens ilcarro HomePage
    And User clicks on log in link
    And  User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies error message
    And User quites browser
    Examples:
      | email       | password |
      | adam@gm.com | Adam123  |
      | adam@gm.com | Adam12345$  |
      | adam@gm.com | Adam1234!!! |