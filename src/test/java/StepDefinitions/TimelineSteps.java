package StepDefinitions;

import PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class TimelineSteps {
    public HomePage homePage;
    String tweetText;

    public TimelineSteps(){
        homePage = new HomePage();
    }

    @When("^The user types the tweet and hit the button$")
    public void typeTweetAndHitButton(){
        homePage.tweet();
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
        String tweetText = homePage.tweet();
        assertTrue(homePage.searchTwitter(tweetText));
    }
}
