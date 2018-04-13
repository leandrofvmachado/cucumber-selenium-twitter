package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/twitter.json",
                "html:target/cucumber/twitter.html",
                "pretty"
        },
        features = "src/test/resources/Feature/user_login.feature",
        glue = {"StepDefinitions", "BaseStepDefinitions"}
)
public class TwitterRunner {
}
