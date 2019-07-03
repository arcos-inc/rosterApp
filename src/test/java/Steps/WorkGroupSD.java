package Steps;

import Base.BaseUtil;
import Pages.WorkGroupPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkGroupSD extends BaseUtil {

    private BaseUtil base;
    WorkGroupPage page;

    public WorkGroupSD(BaseUtil base) {
        page = new WorkGroupPage(Web_Driver);
        this.base = base;
    }

    @When("^User see the Work Group Tab$")
    public void userSeeTheWorkGroupTab() {
        System.out.println("Check Work Group Tab");
        page.clickWorkGroupTab();
    }

    @Then("^User should click on Create New Work Group$")
    public void userShouldClickOnCreateNewWorkGroup() {
        System.out.println("Click on Create New Work Group");
        page.clickCreateNewWorkGroup();
    }

    @And("^User should enter work group \"([^\"]*)\"$")
    public void userShouldEnterWorkGroup(String name) throws Exception {
        System.out.println("Entering Work Group Name");
        page.enterWorkGroupName(name);
    }

    @And("^User should enter work group description \"([^\"]*)\"$")
    public void userShouldEnterWorkGroupDescription(String description) throws Exception {
        System.out.println("Entering Work Group Description");
        page.enterWorkGroupDescription(description);
    }

    @And("^User should select the Seniority Rule$")
    public void userShouldSelectTheSeniorityRule() throws Exception {
        System.out.println("Selecting Seniority Rule");
        page.clickSeniorityRule();
        page.selectSeniorityRule();
    }

    @And("^User should select the Shift Rule Set$")
    public void userShouldSelectTheShiftRuleSet() throws Exception {
        System.out.println("Selecting Shift Rule Set");
        page.clickShiftRuleSet();
        page.selectShiftRuleSet();
    }

    @And("^User should select the PTO Rule Set$")
    public void userShouldSelectThePTORuleSet() throws Exception {
        System.out.println("Selecting PTO Rule Set");
        page.clickPTORuleSet();
        page.selectPTORuleSet();
    }

    @And("^User should select the UTO Rule Set$")
    public void userShouldSelectTheUTORuleSet() throws Exception {
        System.out.println("Selecting UTO Rule Set");
        page.clickUTORuleSet();
        page.selectUTORuleSet();
    }

    @And("^User should select the VTO Slot Rule Set$")
    public void userShouldSelectTheVTOSlotRuleSet() throws Exception {
        System.out.println("Selecting VTO Slot Rule Set");
        page.clickVTOSlotRuleSet();
        page.selectVTOSlotRuleSet();
    }

    @And("^User should select the Add Button$")
    public void userShouldSelectTheAddButton() {
        System.out.println("Clicking Add Button");
        page.clickAddButton();
    }
}
