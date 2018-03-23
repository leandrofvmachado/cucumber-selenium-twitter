package StepDefinitions.CommonSteps;

import BaseStepDefinitions.BaseSteps;
import PageObject.FrontPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private String email;
    private String password;
    protected FrontPage frontPage;

    public LoginSteps(){
        frontPage = BaseSteps.frontPage;
    }

    @Given("^User is on frontpage$")
    public void assertFrontPage(){
        assertTrue(frontPage.isOnFrontPage());
    }

    @When("^User insert correct password and email$")
    public void insertCorrectPasswordAndEmail(){
        this.email = "lfvm.23@gmail.com";
        this.password = "test123twitter";
    }

    @Then("^Do login$")
    public void doLogin(){
        frontPage.login(email, password);
    }

    @Given("^A user is logged in$")
    public void loginUser(){
        this.email = "lfvm.23@gmail.com";
        this.password = "test123twitter";
        frontPage.login(email, password);
    }
}
