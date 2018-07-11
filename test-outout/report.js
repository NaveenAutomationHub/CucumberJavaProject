$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM ContactsPage Test",
  "description": "",
  "id": "free-crm-contactspage-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create New Contacts under Contacts Page",
  "description": "",
  "id": "free-crm-contactspage-test;create-new-contacts-under-contacts-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Login to Free CRM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Providing valid \"naveendommata\" and \"Welcome@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.Login_to_Free_CRM()"
});
formatter.result({
  "duration": 10010354394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveendommata",
      "offset": 17
    },
    {
      "val": "Welcome@123",
      "offset": 37
    }
  ],
  "location": "LoginTest.Providing_valid_and(String,String)"
});
formatter.result({
  "duration": 748520525,
  "status": "passed"
});
});