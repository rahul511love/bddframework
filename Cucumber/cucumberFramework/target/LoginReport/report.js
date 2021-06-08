$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2EndTest.feature");
formatter.feature({
  "line": 1,
  "name": "To Automate End2End Tests",
  "description": "\r\nDescription: The purpose of this features is automate end to end scenario.",
  "id": "to-automate-end2end-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9433078800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Customer is placing an order",
  "description": "",
  "id": "to-automate-end2end-tests;customer-is-placing-an-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User hits the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User inputs username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User input Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User lands on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_hits_the_URL()"
});
formatter.result({
  "duration": 2885184500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_inputs_username()"
});
formatter.result({
  "duration": 156778200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_input_Password()"
});
formatter.result({
  "duration": 104016700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_login_button()"
});
formatter.result({
  "duration": 1766229500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_lands_on_Home_page()"
});
formatter.result({
  "duration": 22804100,
  "status": "passed"
});
formatter.after({
  "duration": 65600,
  "status": "passed"
});
formatter.after({
  "duration": 714811900,
  "status": "passed"
});
});