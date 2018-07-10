$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\tagging.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 39,
  "name": "Closing test",
  "description": "",
  "id": "free-crm-application-testing;closing-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "This is to close the test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingTest.This_is_to_close_the_test()"
});
formatter.result({
  "duration": 77801986,
  "status": "passed"
});
});