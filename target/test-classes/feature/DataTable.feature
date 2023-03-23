
Feature: Login Functionality With datatable
  
@asList
  Scenario: Login Page With Valid Credentials
    Given User Enters the URL.
When enter form asList
      |daisyrubycatharine|
      |RP65IQ| 
    
      
      @asLists
        Scenario: Login Page With Valid username
        Given User Enters the URL for DemoqA.
        When enter form asLists
      |fname|sudha|vasanth|
      |lastname|vasanth|m|
      |mail|123@gmail.com|453@gmail.com|
    
      @asMap
        Scenario: Login Page With Valid username using map
        Given User Enters the URL for DemoqA.
        When enter form asMap
      |fname|sudha|
      |lastname|vasanth|
      |mail|123@gmail.com|
      
       @asMaps
        Scenario: Login Page With Valid username using map
        Given User Enters the URL for DemoqA.
        When enter form asMaps
      |fname| lastname|mail|
      |sudha|vasanth|123@gmail.com|
      |vasanth|m|453@gmail.com|
      
      