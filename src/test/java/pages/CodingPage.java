package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class CodingPage
{
    public CodingPage()
    {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Enter new question ']")
    public WebElement enterNewQuestionBtn;

    @FindBy(id = "question")
    public WebElement yourQuestionField;

    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement questionEnterBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-danger ml-1']")
    public WebElement deleteBtn;

    @FindBy (xpath = "//button[@class='btn btn-sm-outline-warning']")
    public WebElement editBtn;

    @FindBy (xpath = "//div[@class='col-md-8']//p[1]")
    public WebElement questionText;

    @FindBy (xpath = "//textarea[@name='newQuestion']")
    public WebElement textArea;

    @FindBy (xpath = "//div[@class='col-md-8']//p")
    public List<WebElement> questions;

    @FindBy (xpath = "//button[@class='btn btn-sm-outline-success']")
    public WebElement checkBtn;

    @FindBy (name = "search")
    public WebElement searchField;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement searchBtn;
}
