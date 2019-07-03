package Steps;

import Base.BaseUtil;
import Pages.RuleSetsPage_VTOSlotRuleSet;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RuleSetsSD_VTOSlotRuleSet extends BaseUtil {

    private BaseUtil base;
    RuleSetsPage_VTOSlotRuleSet page;

    public RuleSetsSD_VTOSlotRuleSet(BaseUtil base) {
        page = new RuleSetsPage_VTOSlotRuleSet(Web_Driver);
        this.base = base;
    }

    @When("^User should be able to click on Create New VTO Slot Rule Set$")
    public void userShouldBeAbleToClickOnCreateNewVTOSlotRuleSet() {
        System.out.println("Clicking Create New VTO Slot Rule Set");
        page.clickCreateNewVTOSlotRuleSet();
    }

    @Then("^User should be navigated to New VTO Slot Rule Set page$")
    public void userShouldBeNavigatedToNewVTOSlotRuleSetPage() {
        String newVTOSlotRuleSet = page.lblPageHeading.getText();
        if (newVTOSlotRuleSet.equals("New VTO Slot Rule Set")) {
            System.out.println("User is on right page");
        }
    }

    @And("^User should be able to enter VTOSlot \"([^\"]*)\"$")
    public void userShouldBeAbleToEnterVTOSlot(String RuleSetName) throws Exception {
        System.out.println("Entering VTO Slot Rule Set Name");
        page.enteringVTOSlotRuleSetName(RuleSetName);
    }

    @And("^User should be able to check Can Claim VTO Slot$")
    public void userShouldBeAbleToCheckCanClaimVTOSlot() {
        System.out.println("Checked Can Claim VTO Slot");
        page.checkedCanClaimVTOSlot();
    }

    @And("^User should be able to check Can Supervisor Override Rules$")
    public void userShouldBeAbleToCheckCanSupervisorOverrideRules() {
        System.out.println("Checked Supervisor Can Override Rules");
        page.checkedSupervisorCanOverrideRules();
    }
}
