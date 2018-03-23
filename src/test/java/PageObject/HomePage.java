package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomePage extends Page{
    private String tweetText = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    @FindBy(id = "tweet-box-home-timeline")
    WebElement tweetBox;

    @FindBys({@FindBy(css = ".tweet-button"), @FindBy(css = ".js-tweet-btn")})
    WebElement tweetBtn;

    WebElement tweet;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void tweet(){
        tweetBox.sendKeys(tweetText);
        tweetBtn.click();
    }

    public boolean searchTwitter(){
        tweet = driver.findElement(By.xpath("//*[contains(text(), \"" + tweetText + "\")]"));
        if(tweet.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }
}
