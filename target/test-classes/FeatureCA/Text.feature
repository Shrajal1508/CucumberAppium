@test
Feature: Check the text enter and clear feature

  Scenario Outline: Enter text and clear data
    Given App is started
    And Click on Text
    And Click on KeyEventText
    And Enter Text "<Text>"
    Then click on clear

    Examples: 
      | Text      |
      | Test Data |

      
      # "Test Data" is provided to be entered as text :- Text -> Key Event Text -> Enter text -> Clear ........ (Test Case 7)