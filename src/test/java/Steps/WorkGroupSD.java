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
    public void userSeeTheWorkGroupTab() throws Throwable{
        System.out.println("Check Work Group Tab");
        page.clickWorkGroupTab();
        Thread.sleep(1000);
    }

    @Then("^User should click on Create New Work Group$")
    public void userShouldClickOnCreateNewWorkGroup() throws Throwable {
        System.out.println("Click on Create New Work Group");
        page.clickCreateNewWorkGroup();
        Thread.sleep(1000);
    }

    @And("^User should enter work group \"([^\"]*)\"$")
    public void userShouldEnterWorkGroup(String name) throws Exception {
        System.out.println("Entering Work Group Name");
        page.enterWorkGroupName(name);
        Thread.sleep(1000);
    }

    @And("^User should enter work group description \"([^\"]*)\"$")
    public void userShouldEnterWorkGroupDescription(String description) throws Exception {
        System.out.println("Entering Work Group Description");
        page.enterWorkGroupDescription(description);
        Thread.sleep(1000);
    }

    @And("^User should select the Seniority Rule$")
    public void userShouldSelectTheSeniorityRule() throws Exception {
        System.out.println("Selecting Seniority Rule");
        page.clickSeniorityRule();
        page.selectSeniorityRule();
        Thread.sleep(1000);
    }

    @And("^User should select the Shift Rule Set$")
    public void userShouldSelectTheShiftRuleSet() throws Exception {
        System.out.println("Selecting Shift Rule Set");
        page.clickShiftRuleSet();
        page.selectShiftRuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the PTO Rule Set$")
    public void userShouldSelectThePTORuleSet() throws Throwable {
        System.out.println("Selecting PTO Rule Set");
        page.clickPTORuleSet();
        page.selectPTORuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the UTO Rule Set$")
    public void userShouldSelectTheUTORuleSet() throws Throwable {
        System.out.println("Selecting UTO Rule Set");
        page.clickUTORuleSet();
        page.selectUTORuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the VTO Slot Rule Set$")
    public void userShouldSelectTheVTOSlotRuleSet() throws Throwable {
        System.out.println("Selecting VTO Slot Rule Set");
        page.clickVTOSlotRuleSet();
        page.selectVTOSlotRuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the Add Button$")
    public void userShouldSelectTheAddButton() throws Throwable{
        System.out.println("Clicking Add Button");
        page.clickAddButton();
        Thread.sleep(1000);
    }

    @Then("^User should click on Edit Work Group$")
    public void userShouldClickOnEditWorkGroup() throws Throwable {
        System.out.println("User should click on Edit Work Group");
        page.clickEditLinkText();
        Thread.sleep(1000);
    }

    @And("^User should select the Update Button$")
    public void userShouldSelectTheUpdateButton() throws Throwable {
        System.out.println("User should select the Update Button");
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @And("^User should select the Cancel Button$")
    public void userShouldSelectTheCancelButton() throws Throwable {
        System.out.println("User should select the Cancel Button");
        page.clickCancelBtn();
        Thread.sleep(1000);
    }

    @Then("^User should click on Hide Inactive Work Group$")
    public void userShouldClickOnHideInactiveWorkGroup() throws Throwable {
        System.out.println("User should click on Hide Inactive Work Group");
        page.checkHideInactiveBtn();
        Thread.sleep(1000);
    }
}
