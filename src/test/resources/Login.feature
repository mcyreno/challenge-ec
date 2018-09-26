#language:en
Feature: Login

  Background: Access the main page
    Given I am on main page

  #TC001
  Scenario Outline: Perform the Login with success
    Given Click on My Account and Login
    But I can access the login page directly
    When I fill the <email> and <password>
    Then The loged message will appear with the <username>

    Examples: 
      | email               | password | username    |
      | user@phptravels.com | demouser | Johny Smith |

  #TC002
  Scenario Outline: Perform the Login with fail
    Given Click on My Account and Login
    But I can access the login page directly
    When I fill the <email> and <password>
    Then The default login error message will appear

    Examples: 
      | email                       | password  |
      | user@phptravels.com         | Demouser  |
      | user@phptravels.com         | demouser_ |
      | user@phptravels.com.br      | demouser  |
      | another_user@phptravels.com | Demouser  |
