#Author: Tarek
@login
Feature: Login functionalities

  @login1
  Scenario: Login with valid username and password
    Given User open browser
    And user open fidelity application
    When user click on log in button
    #And user input valid username
    #And user input valid password
    And user enters username "Allu" and password "pass123"
    #And user click on login button
    Then user valiadte the landing page
    And user validate the page title

  Scenario Outline: Login with valid credentilas
    Given User open browser
    And user open fidelity application
    When user click on log in button
    And user enters "<username>" and "<password>"
    #And user click on login button
    Then user valiadte the landing page
    And user validate the page title

    Examples: 
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |
      | username3 | password3 |
      | username4 | password4 |
      | username5 | password5 |
