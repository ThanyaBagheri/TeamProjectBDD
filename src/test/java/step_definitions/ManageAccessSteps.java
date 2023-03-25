package step_definitions;

import io.cucumber.java.en.Then;
import pages.ManageAccessPage;
import utils.BrowserUtils;

import java.util.List;

public class ManageAccessSteps {
    ManageAccessPage page;

    public ManageAccessSteps(){
        page = new ManageAccessPage();
    }
    @Then("Verify fields are displayed")
    public void verifyFieldsAreDisplayed(List<String> fields) {
        for (String field: fields)
        switch (field.toLowerCase()){
            case "firstname":
                BrowserUtils.isDisplayed(page.firstNameField);
                break;
            case "lastname":
                BrowserUtils.isDisplayed(page.lastNameField);
                break;
            case"email":
                BrowserUtils.isDisplayed(page.emailField);
                break;
            case "role":
                BrowserUtils.isDisplayed(page.roleField);
                break;
            case "batch":
                BrowserUtils.isDisplayed(page.batchField);
                break;
            default:
                System.out.println("Invalid field");
        }
    }

    @Then("Verify filter selection is enable")
    public void verifyFilterSelectionIsEnable() {
        BrowserUtils.isEnabled(page.filterSection);
    }

    @Then("Verify dropdown items are displayed")
    public void verifyDropdownItemsAreDisplayed(List<String>dropdown) {
        for(String item:dropdown){
            switch (item.toLowerCase()){
                case "edit":
                    BrowserUtils.isDisplayed(page.editDropdown);
                    break;
                case "delete":
                    BrowserUtils.isDisplayed(page.deleteDropdown);
                    break;
                case "reset password":
                    BrowserUtils.isDisplayed(page.resetPwDropdown);
                    break;
                default:
                    System.out.println("Invalid item");
            }
        }

    }

    @Then("verify button {string} is enabled")
    public void verifyButtonIsEnabled(String button) {
        switch (button.toLowerCase()) {
            case "show all":
            BrowserUtils.isEnabled(page.showAllBtn);
            break;
            default:
                System.out.println("Invalid button");
        }
    }
}
