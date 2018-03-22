package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FrontPage extends Page {
    @FindBy(css = ".StaticLoggedOutHomePage-signupSubtitle")
    WebElement frontPageText;

    @FindBy(css = ".js-signin-email")
    WebElement email;

    @FindBys({@FindBy(css = ".LoginForm-password"), @FindBy(css = ".text-input")})
    WebElement password;

    @FindBys({@FindBy(css = ".LoginForm"), @FindBy(css = ".submit")})
    WebElement loginBtn;

    public FrontPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isOnFrontPage(){
        if(frontPageText.isDisplayed()){
            return true;
        }
        else{
            return false;
        }
    }

    public void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginBtn.click();
    }
}
