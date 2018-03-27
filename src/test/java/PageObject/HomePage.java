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

    @FindBy(css = ".tweeting-text")
    WebElement tweetBtn;

    @FindBy(css = ".js-stream-item")
    List<WebElement> tweetList;

    @FindBy(css = ".delete-action")
    WebElement deleteBtn;

    WebElement tweet;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String tweet(){
        tweetBox.sendKeys(tweetText);

        if(tweetBtn.isEnabled()){
            tweetBtn.click();
            return tweetText;
        }else{
            System.out.println("Tweet button not enabled");
            return "";
        }
    }

    public boolean searchTwitter(String text) {
        if(text.equals("")){
            tweet = driver.findElement(By.cssSelector(".js-stream-item")).findElement(By.xpath("//*[contains(text(), '" + tweetText + "')]"));
        } else {
            tweet = driver.findElement(By.cssSelector(".js-stream-item")).findElement(By.xpath("//p[contains(text(), \"" + text + "\")]"));
        }

        return tweet.isDisplayed();
    }

    public String isTimelineEmpty(){
        if(!tweetList.isEmpty()){
            return tweetList.get(0).findElement(By.cssSelector(".tweet-text")).getText();
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
            deleteBtn.click();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public boolean isTweetDeleted(String text){
        driver.navigate().refresh();

        if(!tweetList.isEmpty()){
            if(!tweetText.equals(tweetList.get(0).findElement(By.cssSelector(".tweet-text")).getText())){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return true;
        }
    }
}
