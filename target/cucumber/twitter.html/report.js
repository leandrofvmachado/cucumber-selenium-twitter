$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout",
  "description": "",
  "id": "logout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4290061003,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Logout",
  "description": "",
  "id": "logout;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "A user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user clicks on logout",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The user is logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginUser()"
});
formatter.result({
  "duration": 2897862208,
  "status": "passed"
});
formatter.match({
  "location": "TimelineSteps.theUserClicksOnLogout()"
});
formatter.result({
  "duration": 354350576,
  "status": "passed"
});
formatter.match({
  "location": "TimelineSteps.theUserIsLoggedOut()"
});
formatter.result({
  "duration": 1035199531,
  "status": "passed"
});
formatter.after({
  "duration": 604591870,
  "status": "passed"
});
});