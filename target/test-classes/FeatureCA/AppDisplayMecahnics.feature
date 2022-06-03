@test
Feature: Test Cases to verify dispaly and mechanics option in App

  Scenario: Dispaly Option
    Given API demos started
    When Clicked on App
    And Clicked on Action Bar
    And Clicked on Display Options
    And Clicked on Navigation
    Then Validated Multiple Tabs Shown
    When Again Navigation hitted
    Then Validated Multiple Tabs Hide

		 #Test to Verify the display navigation feature in App -> Action Bar -> Display Options -> Navigation (Test Case 3)
		 
  Scenario: Mechanics Option
    Given API demos started
    When Clicked on App
    And Clicked on Action Bar
    And Clicked on Action Bar Mechanics
    Then Validated Mechanics Page View

    #Test to Verify the  mechanics feature in App -> Action Bar -> Mechanics (Test Case 4)