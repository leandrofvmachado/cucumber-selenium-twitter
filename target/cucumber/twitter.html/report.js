$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/delete_tweet.feature");
formatter.feature({
  "line": 1,
  "name": "Delete Tweet",
  "description": "",
  "id": "delete-tweet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5428257106,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Delete a tweet",
  "description": "",
  "id": "delete-tweet;delete-a-tweet",
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
  "name": "The user add a tweet to his/her timeline",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user deletes the last tweet",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The tweet is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginUser()"
});
formatter.result({
  "duration": 2617873661,
  "status": "passed"
});
formatter.match({
  "location": "TimelineSteps.addTweet()"
});
formatter.result({
  "duration": 3060241835,
  "status": "passed"
});
formatter.match({
  "location": "TimelineSteps.deleteLastTweet()"
});
formatter.result({
  "duration": 691326858,
  "status": "passed"
});
formatter.match({
  "location": "TimelineSteps.checkLastTweetDeleted()"
});
formatter.result({
  "duration": 2470645288,
  "status": "passed"
});
formatter.after({
  "duration": 10707982000,
  "status": "passed"
});
});