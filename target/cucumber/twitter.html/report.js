$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/delete_tweet.feature");
formatter.feature({
  "line": 1,
  "name": "Delete Tweet",
  "description": "",
  "id": "delete-tweet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4254651337,
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
  "name": "The user has a tweet on the timeline",
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
  "duration": 3084142532,
  "status": "passed"
});
formatter.match({
  "location": "TimelineSteps.checkTimeLine()"
});
formatter.result({
  "duration": 2953164175,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d65.0.3325.181)\n  (Driver info: chromedriver\u003d2.37.543654 (a46b62e9900f5ac48951f8ad68d9e03eded4cc8d),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 19 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027Tokenlab-Dev-Meeting-Room.local\u0027, ip: \u0027192.168.5.234\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.37.543654 (a46b62e9900f5ac48951f8ad68d9e03eded4cc8d), userDataDir\u003d/var/folders/t5/bpw4p0zd4015nsv58dsc1khm0000gn/T/.org.chromium.Chromium.7axyr5}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d65.0.3325.181, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 3cf1fd2dac1a2d1d661357fb1ee0596b\n*** Element info: {Using\u003dcss selector, value\u003d.tweet}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:326)\n\tat org.openqa.selenium.remote.RemoteWebElement.findElements(RemoteWebElement.java:213)\n\tat org.openqa.selenium.remote.RemoteWebElement.findElementsByCssSelector(RemoteWebElement.java:290)\n\tat org.openqa.selenium.By$ByCssSelector.findElements(By.java:441)\n\tat org.openqa.selenium.remote.RemoteWebElement.findElements(RemoteWebElement.java:189)\n\tat org.openqa.selenium.support.pagefactory.ByChained.findElements(ByChained.java:72)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:341)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\n\tat com.sun.proxy.$Proxy17.isEmpty(Unknown Source)\n\tat PageObject.HomePage.isTimelineEmpty(HomePage.java:47)\n\tat StepDefinitions.TimelineSteps.checkTimeLine(TimelineSteps.java:31)\n\tat ✽.And The user has a tweet on the timeline(src/test/resources/Feature/delete_tweet.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "TimelineSteps.deleteLastTweet()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TimelineSteps.checkLastTweetDeleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 10588674487,
  "status": "passed"
});
});