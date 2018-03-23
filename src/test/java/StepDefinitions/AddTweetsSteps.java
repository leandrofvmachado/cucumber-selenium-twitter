package StepDefinitions;

import PageObject.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTweetsSteps{
    public HomePage homePage;

    @When("^The user types the tweet and hit the button$")
    public void typeTweetAndHitButton(){
        homePage = new HomePage();
        homePage.tweet();
    }

    @Then("^The tweet is posted to your timeline$")
    public void checkIfTweetWasPosted(){
        homePage.searchTwitter();
    }
}
