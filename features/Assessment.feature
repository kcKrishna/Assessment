@tag
Feature: Login Action in TestMeApp
  Test Login Functional for multiple Users in TestMeApp

  @tag1
  Scenario Outline: Successful login with valid Credentials
    Given navigate to Home Page
    When User enters Correct "<Username>" and "<Password>"
   	Then Message Login Successful

		Examples:
		|Username							|Password		|
		|karthik456@gmail.com	|karthik456	|
		|shahrukh@khan.com		|omshanti		|
		|anil@gmail.com				|anilanil		|
	
