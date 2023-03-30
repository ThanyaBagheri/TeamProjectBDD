package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    public void verifyTextIsDisplayed(String text) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BrowserUtils.getDriver(), 20);
        switch (text.toLowerCase())
        {
            case "this is new paul coding question.":
                Thread.sleep(1000);
                System.out.println("text should contain: " + text);
                System.out.println("actual: " + page.questionText.getText());
                BrowserUtils.assertTrue(page.questionText.getText().contains(text));
                break;
            case "this is new paul soft skills question.":
                Thread.sleep(1000);
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
        System.out.println("no. of questions displayed" + page.questions.size());
        switch(question)
        {
            case "this is new paul coding question.":
                isThere = false;
                for (WebElement each : page.questions)
                {
                    System.out.println(each.getText());
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

    @Then("Verify at least one question displayed")
    public void verifyAtLeastOneQuestionDisplayed()
    {
        BrowserUtils.waitForElementVisibility(page.questionText);
        int numberOfQuestionDisplayed = page.questions.size();
        System.out.println("number of questions displayed: " + numberOfQuestionDisplayed);
        BrowserUtils.assertTrue(numberOfQuestionDisplayed > 0);
    }

    @And("I fill in {string} in Search criteria field")
    public void iFillInInSearchCriteriaField(String criteria)
    {
        if (criteria.length() > 40)
            Assert.fail("Criteria length is greater than 40!");
        else
            BrowserUtils.sendKeys(page.searchField, criteria);
    }

    @Then("verify all question displayed contains {string}")
    public void verifyAllQuestionDisplayedContains(String criteria) throws InterruptedException {
        Thread.sleep(2000);
        boolean isThere = false;
        int numberOfQuestionsDisplayed = page.questions.size();
        System.out.println("no. of question: " + numberOfQuestionsDisplayed);
        if (numberOfQuestionsDisplayed == 0)
            System.out.println("Search not found.");
        else
        {
            for(WebElement each : new CodingPage().questions)
            {
                if (each.getText().contains(criteria)) {
                    isThere = true;
                    break;
                }
            }
            BrowserUtils.assertTrue(isThere);
        }
    }
}
