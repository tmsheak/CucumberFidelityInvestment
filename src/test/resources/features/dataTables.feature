#Author: Tarek
@login
Feature: Login functionalities

  Scenario: Login with valid usernames and passwords
    Given User open browser
    And user open fidelity application
    When user click on log in button
    #And user login with following credential
    #| userme | passwordme |
    #And user login with username and password
    #| UName  | PWord      |
    #| usermy | passwordmy |
    And users login with username and password
      | UserHeader | PasswordHeader |
      | usermy     | passwordmy     |
      | AbdulB     | Basier1123     |
      | enterUser  | myPasword      |
    #And user click on login button
    Then user valiadte the landing page
    And user validate the page title
