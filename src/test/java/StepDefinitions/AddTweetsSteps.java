package StepDefinitions;

import StepDefinitions.CommonSteps.BaseSteps;
import PageObject.HomePage;
import cucumber.api.java.en.When;

public class AddTweetsSteps{
    public HomePage homePage;

    @When("^The user types the tweet and hit the button$")
    public void typeTweetAndHitButton(){
        homePage.tweet();
    }
}
