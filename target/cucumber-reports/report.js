$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPom.feature");
formatter.feature({
  "line": 2,
  "name": "Login_Test",
  "description": "\r\n As a customer\r\n In order to use the application\r\n I want to login with email and password",
  "id": "login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Logging in with valid credentials",
  "description": "",
  "id": "login-test;logging-in-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user click login link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user attempts to login by entering  \"\u003cusername\u003e\"  and  \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user  \"\u003cusername\u003e\" should be able to confirm login is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user log out of the application",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login-test;logging-in-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "login-test;logging-in-with-valid-credentials;;1"
    },
    {
      "cells": [
        "test",
        "letmein"
      ],
      "line": 17,
      "id": "login-test;logging-in-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12203092900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Logging in with valid credentials",
  "description": "",
  "id": "login-test;logging-in-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user click login link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user attempts to login by entering  \"test\"  and  \"letmein\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user  \"test\" should be able to confirm login is successful",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user log out of the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 359589900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_click_login_link()"
});
formatter.result({
  "duration": 240382100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 37
    },
    {
      "val": "letmein",
      "offset": 50
    }
  ],
  "location": "LoginStepDef.user_attempts_to_login_by_entering_and(String,String)"
});
formatter.result({
  "duration": 557632401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 7
    }
  ],
  "location": "LoginStepDef.user_should_be_able_to_confirm_login_is_successful(String)"
});
formatter.result({
  "duration": 114505400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_log_out_of_the_application()"
});
formatter.result({
  "duration": 319601001,
  "status": "passed"
});
formatter.after({
  "duration": 1354801201,
  "status": "passed"
});
});