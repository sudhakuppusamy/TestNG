

Feature: Login Functionality

Background:
Given User Enters thr URL.
@login1
  Scenario: Login Page With Valid Credentials
#	@Given("User Enters thr URL.")
    When User enters the username "daisyrubycatharine"
    And User enters the password "RP65IQ"
    And User clicks the login button
    Then validate the home page title
Then validate the user icon
But validate that sign in button is not visible
But validate that sign in icon is not visible
   
@login1
 Scenario: Login Page With Invalid Credentials
    
    When User enters the Invalid username 
    And User enters the   Invalid password 
    And User clicks the login button
   Then validate the user icon
But validate that sign in button is not visible
But validate that sign in icon is not visible
   
   @login2
   Scenario Outline: Login Page With Invalid username

    When User enters the Invalid username "<username>"
    And User enters the password "<password>"
    And User clicks the login button
   Then validate the user icon
But validate that sign in button is not visible
But validate that sign in icon is not visible
   

    Examples: 
     |username|password|
     |daisyrubycatharine|RP65IQ|
     |daisyrubatharine|RP65I5| 
     |   |   |
