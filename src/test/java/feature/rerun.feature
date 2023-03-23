

Feature: Rerun filed Testcase


@Assert
  Scenario: Login Page With Valid Credentials
   When User Enters correct Assertion.
  
@Assert
  Scenario: Login Page With Worng Credentials
 When User Enters wrong Assertion.

 @Assert
  Scenario: Login Page With no Credentials
   When User Enters  no Assertion.