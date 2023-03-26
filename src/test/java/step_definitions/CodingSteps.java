package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CodingPage;
import pages.MSoftSkillsPage;
import utils.BrowserUtils;

import java.util.List;

public class CodingSteps
{
    CodingPage page;
    MSoftSkillsPage mSoftSkillsPage;

    public CodingSteps()
    {
        page = new CodingPage();
        mSoftSkillsPage = new MSoftSkillsPage();
    }

    @When("I fill in {string} text")
    public void i_fill_in_text(String text)
    {
        switch(text.toLowerCase())
        {
            case "is this paul's coding question?":
                BrowserUtils.sendKeys(page.yourQuestionField, text);
                break;
            case "this is new paul coding question.":
                BrowserUtils.sendKeys(page.textArea, text);
                break;
            case "is this paul's soft skills question?":
                BrowserUtils.sendKeys(mSoftSkillsPage.yourQuestionField, text);
                break;
            case "this is new paul soft skills question.":
                BrowserUtils.sendKeys(mSoftSkillsPage.textArea, text);
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

    @Then("Verify {string} text is displayed")
    public void verifyTextIsDisplayed(String text)
    {
        switch (text.toLowerCase())
        {
            case "is this paul's coding question?":
                BrowserUtils.assertEquals(page.questionText.getText(), text);
                break;
            case "this is new paul coding question.":
                BrowserUtils.waitForElementVisibility(page.questionText);
                System.out.println("text should contain: " + text);
                System.out.println("actual: " + page.questionText.getText());
                BrowserUtils.assertTrue(page.questionText.getText().contains(text));
                break;
            case "is this paul's soft skills question?":
                BrowserUtils.assertEquals(mSoftSkillsPage.questionText.getText(), text);
                break;
            case "this is new paul soft skills question.":
                BrowserUtils.waitForElementVisibility(mSoftSkillsPage.questionText);
                System.out.println("text should contain: " + text);
                System.out.println("actual: " + mSoftSkillsPage.questionText.getText());
                BrowserUtils.assertTrue(mSoftSkillsPage.questionText.getText().contains(text));
                break;
            default:
                Assert.fail("Invalid text!");
        }
    }

    @Then("Verify no {string} question is in the question list")
    public void verifyNoQuestionIsInTheQuestionList(String question)
    {
        boolean isThere;
        System.out.println(question);
        switch(question)
        {
            case "this is new paul coding question.":
                isThere = false;
                for (WebElement each : page.questions)
                {
                    if (each.getText().contains(question))
                        isThere = true;
                }
                BrowserUtils.assertFalse(isThere);
                break;
            case "this is new paul soft skills question.":
                isThere = false;
                for (WebElement each : mSoftSkillsPage.questions)
                {
                    if (each.getText().contains(question))
                        isThere = true;
                }
                BrowserUtils.assertFalse(isThere);
                break;
        }
    }
}
