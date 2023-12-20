Feature: ART Test succesful

  Scenario: user should complete the art test successfully
    Given url 'https://entrypass.azurewebsites.net/entrypass/UATAPI/Employee/12/ArtTest'
    And request {"testDate": "2022-03-25T14:55:01", "testResult": false,"fileName": "8cd4d44c-654c-46c7-943b-089c33b179e0_Image from iOS (36).png","testKit": "1","temperature": "23.1","remarks": "none"}
    When method POST
    Then status 200
    And print responseTime
    And print responseStatus
