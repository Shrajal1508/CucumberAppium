@test1
Feature: Verifying the show and hide feature in a flow

  
  Scenario: Hide Feature
    Given API demos apk Initialised
    When Clicked on Animation
    And Clicked on Hide-Show Animation
    And Clicked on buttons to hide
    Then Validate the buttons are hidden
    
    #Test to hide the buttons in Animation -> Hide-show Animation (Test Case 1)

  
  Scenario: Show Feature
    Given API demos apk Initialised
    When Clicked on Animation
    And Clicked on Hide-Show Animation
    And Clicked on buttons to hide
    When Clicked on show buttons
    Then Verify the btns are shown
    
    #Test to show the buttons in Animation -> Hide-show Animation -> Show Buttons (Test Case 2)
