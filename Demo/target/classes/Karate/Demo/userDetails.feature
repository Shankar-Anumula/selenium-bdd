Feature: User Details

Scenario: Get User Details

Given url 'https://reqres.in/api/users/2' 
When method GET 
Then status 200
