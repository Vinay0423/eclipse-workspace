Feature:  Address verification successful

Background:
* url 'https://entrypass-api-dev.azurewebsites.net/'
* header Accept = 'application/json'
Scenario: user should able to submit address verification

Given path 'Employee/2/Address'
And def requestBody = read("addbody.json")
And request requestBody
When method POST
Then status 200
And print response
And print responseTime
And print responseStatus