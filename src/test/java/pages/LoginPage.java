package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(BrowserUtils.getDriver(),this);
    }

    @FindBy(name = "email")
    public WebElement userNameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;

}

