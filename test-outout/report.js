$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\taggedHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Test tagged hooks",
  "description": "",
  "id": "test-tagged-hooks",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "This is a first test",
  "description": "",
  "id": "test-tagged-hooks;this-is-a-first-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "this is a first step",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "this is a second step",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "this is a third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_first_step()"
});
formatter.result({
  "duration": 72960333,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_second_step()"
});
formatter.result({
  "duration": 54855,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_third_step()"
});
formatter.result({
  "duration": 33683,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "This is a second test",
  "description": "",
  "id": "test-tagged-hooks;this-is-a-second-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "this is a first step",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "this is a second step",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "this is a third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_first_step()"
});
formatter.result({
  "duration": 39778,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_second_step()"
});
formatter.result({
  "duration": 59987,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_third_step()"
});
formatter.result({
  "duration": 82764,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "This is a third test",
  "description": "",
  "id": "test-tagged-hooks;this-is-a-third-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "this is a first step",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "this is a second step",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "this is a third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_first_step()"
});
formatter.result({
  "duration": 42343,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_second_step()"
});
formatter.result({
  "duration": 29192,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_a_third_step()"
});
formatter.result({
  "duration": 576135,
  "status": "passed"
});
});