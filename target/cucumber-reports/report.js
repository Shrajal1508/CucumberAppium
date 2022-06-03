$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DateTime.feature");
formatter.feature({
  "line": 2,
  "name": "Verify date and time feature and Set as End Test Submission deadline",
  "description": "",
  "id": "verify-date-and-time-feature-and-set-as-end-test-submission-deadline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test3"
    }
  ]
});
formatter.before({
  "duration": 306912300,
  "status": "passed"
});
formatter.before({
  "duration": 52521200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Change Date",
  "description": "",
  "id": "verify-date-and-time-feature-and-set-as-end-test-submission-deadline;change-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "API demos application is open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Clicked on Views",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicked on Date Widgets",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Clicked on Dialog",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Change the Date",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Change the Date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the changed date",
  "keyword": "Then "
});
formatter.match({
  "location": "DateTimeStep.api_demos_application_is_open()"
});
formatter.result({
  "duration": 2447313900,
  "status": "passed"
});
formatter.match({
  "location": "DateTimeStep.clicked_on_Views()"
});
formatter.result({
  "duration": 7118500,
  "error_message": "java.lang.NullPointerException\r\n\tat ScreenCA.DateTimePage.View(DateTimePage.java:39)\r\n\tat StepDefinitionCA.DateTimeStep.clicked_on_Views(DateTimeStep.java:30)\r\n\tat ✽.When Clicked on Views(DateTime.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DateTimeStep.clicked_on_Date_Widgets()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DateTimeStep.clicked_on_Dialog()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DateTimeStep.click_on_Change_the_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DateTimeStep.change_the_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DateTimeStep.verify_the_changed_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 46100,
  "status": "passed"
});
formatter.after({
  "duration": 536400,
  "status": "passed"
});
formatter.after({
  "duration": 249311100,
  "status": "passed"
});
formatter.before({
  "duration": 2151400,
  "status": "passed"
});
formatter.before({
  "duration": 9750900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "# Change Date to 3rd June, 2022 ..... Views -\u003e Date Widgets -\u003e Dialog -\u003e Change the Date -\u003e Select Date (Test Case 5)"
    }
  ],
  "line": 15,
  "name": "Change Time",
  "description": "",
  "id": "verify-date-and-time-feature-and-set-as-end-test-submission-deadline;change-time",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Click on Change the Time",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Change the Time",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify the changed time",
  "keyword": "Then "
});
formatter.match({
  "location": "DateTimeStep.click_on_Change_the_Time()"
});
formatter.result({
  "duration": 324900,
  "error_message": "java.lang.NullPointerException\r\n\tat ScreenCA.DateTimePage.ChangeTime(DateTimePage.java:66)\r\n\tat StepDefinitionCA.DateTimeStep.click_on_Change_the_Time(DateTimeStep.java:83)\r\n\tat ✽.When Click on Change the Time(DateTime.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DateTimeStep.change_the_Time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DateTimeStep.verify_the_changed_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 26100,
  "status": "passed"
});
formatter.after({
  "duration": 430400,
  "status": "passed"
});
formatter.after({
  "duration": 49333200,
  "status": "passed"
});
});