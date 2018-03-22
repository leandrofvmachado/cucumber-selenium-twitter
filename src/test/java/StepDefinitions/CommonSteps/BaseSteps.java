package StepDefinitions.CommonSteps;

import PageObject.FrontPage;
import PageObject.Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

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

        parentPage = new Page();
        frontPage = parentPage.setWorkspace(driver);
        System.out.println("asfdasfsafdads");
    }

    @After
    public void stopWebDriver() throws InterruptedException {
        Thread.sleep(10000);
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