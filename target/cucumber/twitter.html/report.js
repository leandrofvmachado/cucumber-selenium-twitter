$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("add_tweet.feature");
formatter.feature({
  "line": 1,
  "name": "Add Tweet",
  "description": "",
  "id": "add-tweet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9743030878,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add a simple text tweet",
  "description": "",
  "id": "add-tweet;add-a-simple-text-tweet",
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
  "name": "The user types the tweet and hit the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The tweet is posted to your timeline",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginUser()"
});
formatter.result({
  "duration": 3536516919,
  "status": "passed"
});
formatter.match({
  "location": "AddTweetsSteps.typeTweetAndHitButton()"
});
formatter.result({
  "duration": 36138858,
  "error_message": "java.lang.NullPointerException\n\tat StepDefinitions.AddTweetsSteps.typeTweetAndHitButton(AddTweetsSteps.java:12)\n\tat ✽.When The user types the tweet and hit the button(add_tweet.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 10737241211,
  "status": "passed"
});
formatter.uri("user_login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4203732222,
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
  "duration": 55955860,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.insertCorrectPasswordAndEmail()"
});
formatter.result({
  "duration": 34499,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.doLogin()"
});
formatter.result({
  "duration": 2970617513,
  "status": "passed"
});
formatter.after({
  "duration": 10674546237,
  "status": "passed"
});
});