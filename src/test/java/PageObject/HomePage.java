package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page{
    @FindBy(id = "tweet-box-home-timeline")
    WebElement tweetBox;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void tweet(){
        tweetBox.sendKeys("asdfasdf");
    }
}
