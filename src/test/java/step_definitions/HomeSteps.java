package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageAccessPage;
import utils.BrowserUtils;
import utils.ConfigReader;

public class HomeSteps {
    HomePage page;
    LoginPage loginPage;
    ManageAccessPage manageAccessPage;
    public HomeSteps()
    {
        page = new HomePage();
        loginPage = new LoginPage();
        manageAccessPage = new ManageAccessPage();
    }

    @Given("I enter {string}")
    public void i_enter_in(String inputString)
    {
        switch (inputString.toLowerCase())
        {
            case "username", "adminuser":
                BrowserUtils.sendKeys(loginPage.usernameField,
                        ConfigReader.readProperty("config.properties", inputString.toLowerCase()));
                break;
            case "password", "adminpassword":
                BrowserUtils.sendKeys(loginPage.passwordField,
                        ConfigReader.readProperty("config.properties", inputString.toLowerCase()));
                break;
            default:
                Assert.fail("Invalid Field!");
        }
    }
    @When("I click on {string} button")
    public void i_click_on_button(String btn)
    {
        switch(btn.toLowerCase())
        {
            case "login":
                BrowserUtils.click(loginPage.logInBtn);
                break;
            case "manage access":
                BrowserUtils.click(manageAccessPage.manageAccessBtn);
                break;
            case "action":
                BrowserUtils.switchToNewWindow();
                BrowserUtils.click(manageAccessPage.actionBtn);
                break;
            default:
                Assert.fail("Invalid Button!");
        }

    }
    @Then("Verify that {string} is the title of the page")
    public void verify_that_is_the_title_of_the_page(String title)
    {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }


    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String button) {
        BrowserUtils.waitForElementVisibility(page.signOutBtn);
        switch (button){
            case "Sign out":
                BrowserUtils.isDisplayed(page.signOutBtn);
                break;
            case "All Topics":
                BrowserUtils.isDisplayed(page.allTopicsBtn);
                break;

            case "Coding":
                BrowserUtils.isDisplayed(page.codingBtn);
                break;

            case "Soft Skills":
                BrowserUtils.isDisplayed(page.softSkillsBtn);
                break;

            case "Add User":
                BrowserUtils.isDisplayed(manageAccessPage.addUserBtn);
                break;

            case "Manage Access":
                BrowserUtils.isDisplayed(manageAccessPage.manageAccessBtn);
                break;
            default:
                Assert.fail("Invalid button");

        }
    }

    @And("I enter {string} in do section")
    public void iEnterInDoSection(String input) {
        switch (input.toLowerCase()){
            case "new do":
                BrowserUtils.sendKeys(page.addDoInputField,input);
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    @Then("Verify button {string} is enabled")
    public void verifyButtonIsEnabled(String button) {
        switch (button){
            case "edit":
                BrowserUtils.isEnabled(page.editBtnInDoSection);
                break;
            case "delete":
                BrowserUtils.isEnabled(page.deleteBtnInDoSection);
                break;
            default:
                System.out.println("Invalid button");

        }
    }
}
