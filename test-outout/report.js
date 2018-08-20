$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\Naveen.Dommata\\Desktop\\CucumberProjectUsingDataTables\\src\\com\\qa\\features\\signUp.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM SignUp Test",
  "description": "",
  "id": "free-crm-signup-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM SignUp Page",
  "description": "",
  "id": "free-crm-signup-test;validate-free-crm-signup-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigated to Free CRM Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to SignUp page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter all the mandatory details",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpTest.User_navigated_to_Free_CRM_Application()"
});
formatter.result({
  "duration": 14666872612,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.Go_to_SignUp_page()"
});
formatter.result({
  "duration": 1050271642,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.Enter_all_the_mandatory_details()"
});
formatter.result({
  "duration": 7038964190,
  "status": "passed"
});
});