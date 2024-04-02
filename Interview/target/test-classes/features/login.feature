@Sanity
@Smoke
Feature: As a Amazon user I should be able to login and logout with valid credentials


Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "https://www.amazon.in/"
    Then I click on sign in button and wait for sign in page
    Then I should see Sign In Page
  
Scenario Outline:
		Given I enter <username>
		Given I enter a <password>
		Then I click login
			
		Examples:
			|username|password|
			|praveen|test|
			|tarun|test|