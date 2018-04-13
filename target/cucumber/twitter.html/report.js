$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/user_login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4041995386,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login",
  "description": "",
  "id": "login;successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on frontpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User insert correct password and email",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Do login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.assertFrontPage()"
});
formatter.result({
  "duration": 421638788,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.insertCorrectPasswordAndEmail()"
});
formatter.result({
  "duration": 349151,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.doLogin()"
});
formatter.result({
  "duration": 2510240861,
  "status": "passed"
});
formatter.after({
  "duration": 10652972085,
  "status": "passed"
});
formatter.before({
  "duration": 2542501731,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Unsuccessful Login",
  "description": "",
  "id": "login;unsuccessful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is on frontpage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User insert incorrect password or email",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "A login error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.assertFrontPage()"
});
formatter.result({
  "duration": 54469301,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userInsertIncorrectPasswordOrEmail()"
});
formatter.result({
  "duration": 57119,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.aLoginErrorMessageIsDisplayed()"
});
formatter.result({
  "duration": 1726346195,
  "status": "passed"
});
formatter.after({
  "duration": 10587147347,
  "status": "passed"
});
});