$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Checking login for flipcart",
  "description": "",
  "id": "checking-login-for-flipcart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10203306556,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "login for flipcart",
  "description": "",
  "id": "checking-login-for-flipcart;login-for-flipcart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "message displayed login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "hook.user_is_in_home_page()"
});
formatter.result({
  "duration": 7081870499,
  "status": "passed"
});
formatter.match({
  "location": "hook.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 1645110833,
  "status": "passed"
});
formatter.match({
  "location": "hook.message_displayed_login_successfully()"
});
formatter.result({
  "duration": 335623,
  "status": "passed"
});
formatter.after({
  "duration": 5236063171,
  "status": "passed"
});
});