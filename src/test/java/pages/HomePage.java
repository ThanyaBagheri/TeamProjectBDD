package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(),this);
    }

    @FindBy(xpath = "//u[normalize-space()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath = "//button[text()='All Topics']")
    public WebElement allTopicsBtn;

    @FindBy(xpath = "//button[text()='Coding']")
    public WebElement codingBtn;

    @FindBy(xpath = "//button[text()='Soft skills']")
    public WebElement softSkillsBtn;

    @FindBy(xpath = "//button[text()='Add do ']")
    public WebElement addDoOptionBtn;

    @FindBy(xpath = "div[class='col-md-3 dont'] button[class='btn btn-success badge-pill newbtn mb-3']")
    public WebElement addDonOptionBtn;

    @FindBy(id = "inputArea1")
    public WebElement addDoInputField;

    @FindBy(xpath = "//button[@class='btn btn-outline-white btn-sm btn-success']")
    public WebElement addDoEnterBtn;

    @FindBy(xpath = "//div[text()='new do']/following-sibling::div/span/button")
    public WebElement deleteBtnInDoSection;

    @FindBy(xpath = "//div[text()='new do']/following-sibling::div/span/button[2]")
    public WebElement editBtnInDoSection;
}
