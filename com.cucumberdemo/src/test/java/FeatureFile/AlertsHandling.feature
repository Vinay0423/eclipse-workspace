Feature: Alerts Handling
  Scenario Outline: User should be able to delete the customers
    Given Enter the url to delete customer page
    When Enter the <CustomerId> in Input field
    And Click on the submit button
    Then Confirmation alert should popup
    And Accept the alert

    Examples: 
      | CustomerId|
      |1212|
      |2333|
      |3343|
