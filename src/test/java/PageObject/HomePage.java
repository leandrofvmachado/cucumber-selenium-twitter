package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HomePage extends Page{
    private String tweetText = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    @FindBy(id = "tweet-box-home-timeline")
    WebElement tweetBox;

    @FindBys({@FindBy(css = ".tweet-button"), @FindBy(css = ".js-tweet-btn")})
    WebElement tweetBtn;

    WebElement tweet;

    @FindBys({@FindBy(xpath = "//div"), @FindBy(css = ".tweet")})
    List<WebElement> tweetList;

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

    public String isTimelineEmpty(){
        if(tweetList.isEmpty()){
            return tweetList.get(0).findElement(By.xpath("//p")).findElement(By.cssSelector(".tweet-text")).getText();
        }
        else{
            return "";
        }
    }

    public boolean deleteLastTweet(){
        try {
            WebElement lastTweet = tweetList.get(0);
            lastTweet.findElement(By.cssSelector(".IconContainer")).click();
            lastTweet.findElement(By.cssSelector(".js-actionDelete")).click();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public boolean isTweetDeleted(String text){
        WebElement lastTweet = tweetList.get(0);
        String lastTweetText = lastTweet.findElement(By.xpath("//p")).findElement(By.cssSelector(".tweet-text")).getText();
        if(!lastTweetText.equals(text)){
            return true;
        }
        else{
            return false;
        }
    }
}
