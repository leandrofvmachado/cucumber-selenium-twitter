package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        format = {
                "json:target/cucumber-html-reports/CucumberTestReport.json",
                "pretty"
        },
        features = "src/test/resources/Feature/delete_tweet.feature",
        glue = {"StepDefinitions", "BaseStepDefinitions"}
)
public class TwitterRunner {
        private TestNGCucumberRunner testNGCucumberRunner;

        @BeforeClass(alwaysRun = true)
        public void setUpClass() throws Exception {
                testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }

        @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
        public void feature(CucumberFeatureWrapper cucumberFeature) {
                testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
        }

        @DataProvider
        public Object[][] features() {
                return testNGCucumberRunner.provideFeatures();
        }

        @AfterClass(alwaysRun = true)
        public void tearDownClass() throws Exception {
                testNGCucumberRunner.finish();
        }
}
