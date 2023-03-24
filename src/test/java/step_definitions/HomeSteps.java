package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    LoginPage loginPage;

    public HomeSteps(){
        page = new HomePage();
        loginPage = new LoginPage();
    }
    @When("I enter {string}")
    public void i_enter(String field) {
        switch (field) {
            case "test@yahoo.com":
                BrowserUtils.sendKeys(loginPage.userNameField, field);
                break;
            case "test123":
                BrowserUtils.sendKeys(loginPage.passwordField, field);
                break;
            default:
                System.out.println("Invalid username");
                Assert.fail();
        }
    }

    @When("I click button {string}")
        public void i_click_button(String button) {
            switch (button.toLowerCase()){
                case "login":
                    BrowserUtils.click(loginPage.loginBtn);
            }
        }

        @Then("verify the title is {string}")
        public void verify_the_title_is(String title) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(),title);
        }
}
