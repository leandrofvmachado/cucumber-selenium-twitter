$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/add_tweet.feature");
formatter.feature({
  "line": 1,
  "name": "Add Tweet",
  "description": "",
  "id": "add-tweet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15492391484,
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
  "duration": 3668597744,
  "status": "passed"
});
formatter.match({
  "location": "AddTweetsSteps.typeTweetAndHitButton()"
});
formatter.result({
  "duration": 1694835228,
  "status": "passed"
});
formatter.match({
  "location": "AddTweetsSteps.checkIfTweetWasPosted()"
});
formatter.result({
  "duration": 207867764,
  "status": "passed"
});
formatter.after({
  "duration": 10643211945,
  "status": "passed"
});
});