package Steps;

import Base.BaseUtil;
import Pages.EditLocationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLocationSD extends BaseUtil {

    private BaseUtil base;
    EditLocationPage page;

    public EditLocationSD(BaseUtil base) {
        page = new EditLocationPage(base.Web_Driver);
        this.base = base;
    }

    @When("^User click on Edit link of an existing location$")
    public void userClickOnEditLinkOfAnExistingLocation() throws Throwable {
        System.out.println("User Should Click on Edit Link");
        page.clickEditLocation();
    }

    @Then("^User should see the edit location window$")
    public void userShouldSeeTheEditLocationWindow() throws Throwable {
        System.out.println("User Should See Edit Page");
        page.getEditLocationLabel();
    }

    @And("^User should edit details and rules$")
    public void userShouldEditDetailsAndRules() throws Throwable {
        System.out.println("User Should Edit details and rules");
        page.changeSelection();
    }

    @And("^User should click on Add button$")
    public void userShouldClickOnAddButton() throws Throwable {
        System.out.println("User Should Click on Update Button");
        page.clickOnUpdateButton();
    }
}
