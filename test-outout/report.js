$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\DataDrivenWithMaps.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Test with DataDriven Using Maps",
  "description": "",
  "id": "free-crm-test-with-datadriven-using-maps",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create DataDriven testing using Maps",
  "description": "",
  "id": "free-crm-test-with-datadriven-using-maps;create-datadriven-testing-using-maps",
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
  "name": "Enter valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "naveendommata",
        "Welcome@123"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to deals page , enter datails title , company, and salary",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position"
      ],
      "line": 10
    },
    {
      "cells": [
        "dealspage",
        "CTS",
        "50000"
      ],
      "line": 11
    },
    {
      "cells": [
        "newdealspage",
        "WF",
        "60000"
      ],
      "line": 12
    },
    {
      "cells": [
        "newdeal",
        "CG",
        "20000"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenUsingMapTest.Login_to_Free_CRM()"
});
formatter.result({
  "duration": 10342187722,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenUsingMapTest.Enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 8535006307,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenUsingMapTest.Go_to_deals_page_enter_datails_title_company_and_salary(DataTable)"
});
formatter.result({
  "duration": 52504701148,
  "status": "passed"
});
});