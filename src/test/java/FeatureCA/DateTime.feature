@test3
Feature: Verify date and time feature and Set as End Test Submission deadline
  
  Scenario: Change Date
    Given API demos application is open
    When Clicked on Views
    And Clicked on Date Widgets
    And Clicked on Dialog
    And Click on Change the Date
    And Change the Date  
    Then Verify the changed date
    
    # Change Date to 3rd June, 2022 ..... Views -> Date Widgets -> Dialog -> Change the Date -> Select Date (Test Case 5)

  Scenario: Change Time
    When Click on Change the Time
    And Change the Time  
    Then Verify the changed time
    
    # Change Time to 11:55 p.m. ...... Views -> Date Widgets -> Dialog -> Change the Time -> Select Time (Test Case 6)
