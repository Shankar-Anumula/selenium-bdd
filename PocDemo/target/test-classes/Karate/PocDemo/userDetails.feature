
Feature: User Details
  Scenario: User details from GET call
  
    Given url 'https://reqres.in/api/users/2'
    When method GET
    Then status 200
