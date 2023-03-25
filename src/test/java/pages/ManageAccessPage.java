package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ManageAccessPage {
    public ManageAccessPage(){
        PageFactory.initElements(BrowserUtils.getDriver(),this);
    }

    @FindBy(id = "Firstname")
    public WebElement firstNameField;

    @FindBy(id = "Lastname")
    public WebElement lastNameField;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(id = "Role")
    public WebElement roleField;

    @FindBy(id = "Batch")
    public WebElement batchField;

    @FindBy(xpath = "//a[@class='mr-4']")
    public WebElement manageAccessBtn;

    @FindBy(id = "submit-btn")
    public WebElement addUserBtn;

    @FindBy(xpath = "//div[@class='row ml-1 mb-2']")
    public WebElement filterSection;

    @FindBy(xpath = "//button[@class='dropdown-item' and text()='Edit']")
    public WebElement editDropdown;

    @FindBy(xpath = "//button[@class='dropdown-item' and text()='Delete']")
    public WebElement deleteDropdown;

    @FindBy(xpath = "//button[@class='dropdown-item' and text()='Reset Password']")
    public WebElement resetPwDropdown;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Action'])[1]")
    public WebElement actionBtn;

    @FindBy(xpath = "//button[normalize-space()='Show all']")
    public WebElement showAllBtn;
}
