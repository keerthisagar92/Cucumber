$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Jenkins/Jenkins/cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Login scenarios",
  "description": "",
  "id": "login-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login scenarios",
  "description": "",
  "id": "login-scenarios;login-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open yahoo mail",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I login to yahoo",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.openUrl()"
});
formatter.result({
  "duration": 20661900363,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enterDetails()"
});
formatter.result({
  "duration": 13595846361,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.login()"
});
formatter.result({
  "duration": 57544608,
  "status": "passed"
});
});