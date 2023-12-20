Feature: entrypass login

Background:
* url 'https://entrypass-api-dev.azurewebsites.net/'
* header Accept = 'application/json'

#login
Scenario: Login api for user id
Given path '/Employee/uemss32815'
When method POST
Then status 200
And print responseTime
And print responseStatus

#address verification successful 
Scenario: user should able to submit address verification
Given path 'Employee/2/Address'
And def requestBody = read("addbody.json")
And request requestBody
When method POST
Then status 200
And print response
And print responseTime
And print responseStatus

#art test successful
Scenario: user should complete the art test successfully
    Given url 'https://entrypass.azurewebsites.net/entrypass/UATAPI/Employee/12/ArtTest'
    And request {"testDate": "2022-03-25T15:47:01", "testResult": false,"fileName": "8cd4d44c-654c-46c7-943b-089c33b179e0_Image from iOS (36).png","testKit": "1","temperature": "23.1","remarks": "none"}
    When method POST
    Then status 200
    And print responseTime
    And print responseStatus
