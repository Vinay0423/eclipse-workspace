Feature: Posting User Details
 
   Scenario: testing the POST call for User Creation
      Given url 'https://reqres.in/api/users'
      And request {"name": "morpheus","job": "leader"}
     When method POST
     Then status 201
     And print responseTime
     And print responseStatus