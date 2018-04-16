package BaseStepDefinitions;

import PageObject.FrontPage;
import PageObject.Page;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    private static final String WEB_DRIVER_FOLDER = "drivers";

    public static WebDriver driver;
    protected static Page parentPage;
    public static FrontPage frontPage;

    @Before
    public void startWebDriver(){
        System.setProperty("webdriver.chrome.driver", driversFolder(new File("").getAbsolutePath()) + "chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://twitter.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        parentPage = new Page();
        frontPage = parentPage.setWorkspace(driver);
    }

    @After
    public void stopWebDriver(Scenario scenario) {
        if (scenario.isFailed()){
            try {
                String path;
                path = System.getProperty("user.dir");
                System.out.println(path);
                new File(path+"/screenshotFailure").mkdirs();
                FileOutputStream out = new FileOutputStream(path+"/screenshotFailure/"+scenario.getName()+".png");
                byte[] scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                out.write(scrFile);
                scenario.embed(scrFile, "image/png");
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }

    private static String driversFolder(String path) {
        File file = new File(path);
        for (String item : file.list()) {
            if (WEB_DRIVER_FOLDER.equals(item)) {
                return file.getAbsolutePath() + "/" + WEB_DRIVER_FOLDER + "/";
            }
        }
        return driversFolder(file.getParent());
    }
}