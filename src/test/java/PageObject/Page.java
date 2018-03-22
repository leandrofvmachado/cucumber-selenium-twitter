package PageObject;

import org.openqa.selenium.WebDriver;

public class Page {

    protected static WebDriver driver;

    public FrontPage setWorkspace(WebDriver webdriver){
        driver = webdriver;
        return new FrontPage();
    }
}