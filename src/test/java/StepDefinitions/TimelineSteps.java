package StepDefinitions;

import PageObject.FrontPage;
import PageObject.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class TimelineSteps {
    public HomePage homePage;
    public FrontPage frontPage;
    String tweetText;

    public TimelineSteps(){
        homePage = new HomePage();
    }

    @When("^The user types the tweet and hit the button$")
    public void typeTweetAndHitButton(){
        assertTrue(!homePage.tweetRandomText().equals(""));
    }

    @Then("^The tweet is posted to your timeline$")
    public void checkIfTweetWasPosted(){
        assertTrue(homePage.searchTwitter(""));
    }

    @Given("^The user has a tweet on the timeline$")
    public void checkTimeLine(){
        tweetText = homePage.isTimelineEmpty();
        assertTrue(!tweetText.equals(""));
    }

    @When("^The user deletes the last tweet$")
    public void deleteLastTweet(){
        assertTrue(homePage.deleteLastTweet());
    }

    @Then("^The tweet is deleted$")
    public void checkLastTweetDeleted(){
        assertTrue(homePage.isTweetDeleted(tweetText));
    }

    @Given("^The user add a tweet to his/her timeline$")
    public void addTweet() {
        String tweetText = homePage.tweetRandomText();
        assertTrue(homePage.searchTwitter(tweetText));
    }

    @Given("^The user adds a (.*) tweet$")
    public void theUserAddsAHelloWorldTweet(String tweetText) {
        assertTrue(homePage.tweetSpecificText(tweetText));
    }

    @When("^The user deletes the (.*) tweet$")
    public void theUserDeletesTheHelloWorldTweet(String tweetToDelete) {
        assertTrue(homePage.deleteLastTweet());
    }

    @Then("^The (.*) tweet is deleted$")
    public void theHelloWorldTweetIsDeleted(String tweetText)  {
        assertTrue(homePage.isTweetDeleted(tweetText));
    }

    @When("^The user clicks on logout$")
    public void theUserClicksOnLogout() {
        homePage = new HomePage();
        homePage.logout();
    }

    @Then("^The user is logged out$")
    public void theUserIsLoggedOut() {
        frontPage = new FrontPage();
        frontPage.isOnFrontPage();
    }
}
