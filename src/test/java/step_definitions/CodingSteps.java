package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CodingPage;
import utils.BrowserUtils;

public class CodingSteps
{
    CodingPage page;

    public CodingSteps()
    {
        page = new CodingPage();
    }

    @When("I fill in {string} text")
    public void i_fill_in_text(String text)
    {
        switch(text.toLowerCase())
        {
            case "is this paul's question?":
                BrowserUtils.sendKeys(page.yourQuestionField, text);
                break;
            default:
                Assert.fail("Invalid text field!");
        }
    }

    @Then("Verify {string} button is enabled")
    public void verifyButtonIsEnabled(String btn)
    {
        switch(btn.toLowerCase())
        {
            case "delete":
                BrowserUtils.isEnabled(page.deleteBtn);
                break;
            case "edit":
                BrowserUtils.isEnabled(page.editBtn);
                break;
            default:
                Assert.fail("Invalid button!");
        }
    }
}
