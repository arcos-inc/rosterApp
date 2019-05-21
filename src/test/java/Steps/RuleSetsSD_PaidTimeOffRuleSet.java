package Steps;

import Base.BaseUtil;
import Pages.RuleSetsPage_PaidTimeOffRuleSet;
import Utilities.RDTRuleSetsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RuleSetsSD_PaidTimeOffRuleSet extends BaseUtil {

    private BaseUtil base;
    RuleSetsPage_PaidTimeOffRuleSet page;
    //RDTRuleSetsTab RDT;
    //List<WebElement> ruleSetCollection;

    public RuleSetsSD_PaidTimeOffRuleSet(BaseUtil base) {
        page = new RuleSetsPage_PaidTimeOffRuleSet(Web_Driver);
        //RDT = new RDTRuleSetsTab();
        //ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        this.base = base;
    }

    @Given("^User should be on Company Rule Set Page$")
    public void userShouldBeOnCompanyRuleSetPage() {
        System.out.println("User should be on Company Rule Set Page");
        //page.clickOnRuleSetsTab();
    }

    @When("^User click on Create New Paid Time Off Rule Set$")
    public void userClickOnCreateNewPaidTimeOffRuleSet() {
        System.out.println("User click on Create New Paid Time Off Rule Set");
        page.clickingOnNewPTORuleSet();
    }

    @Then("^User should redirect to New Paid Time Off Rule Set page$")
    public void userShouldRedirectToNewPaidTimeOffRuleSetPage() {
        System.out.println("User should redirect to New Paid Time Off Rule Set page");
        page.getNewPaidTimeOffRuleSetWindow();
    }

    @And("^User enter the Rule Set \"([^\"]*)\"$")
    public void userEnterTheRuleSetName(String ruleName) {
        System.out.println("Entering PTO Rule Set Name");
        page.enteringPTORuleSetName(ruleName);
//        System.out.println("User should enter the Rule Set Name");
//        WebElement ruleSetName = ruleSetCollection.get(0).findElements(By.xpath("td/input")).get(0);
//        if (ruleSetName != null) {
//            ruleSetName.clear();
//            ruleSetName.sendKeys(ruleName);
//        }
    }

    @And("^User can check on Request Paid Time Off$")
    public void userCanCheckOnRequestPaidTimeOff() {
        System.out.println("Checked Can Request Paid Time Off");
        page.checkedCanRequestPaidTimeOff();
    }

    @And("^User can check on Request to Cancel Paid Time Off$")
    public void userCanCheckOnRequestToCancelPaidTimeOff() {
        System.out.println("Checked Can Request to Cancel Paid Time Off");
        page.checkedCanRequestCancelPaidTimeOff();
    }

    @And("^User can check on Approval Required$")
    public void userCanCheckOnApprovalRequired() {
        System.out.println("Checked Approval Required");
        page.checkedApprovalRequired();
    }

    @And("^User should enter \"([^\"]*)\" for Denial Comment$")
    public void userShouldEnterMinCharactersForDenialComment(String minimumCharacters) {
        System.out.println("Entering Min Characters for Denial Comment");
        page.enteringMinCharactersDenialComment(minimumCharacters);
    }

    @And("^User can Allow Partial Shift Paid Time Off$")
    public void userCanAllowPartialShiftPaidTimeOff() {
        System.out.println("Checked Allow Partial Shift Paid Time Off");
        page.checkedAllowPartialShiftPaidTimeOff();
    }

    @And("^User should enter \"([^\"]*)\" of Paid Time Off$")
    public void userShouldEnterSmallestUnitOfPaidTimeOff(String smallestUnit) {
        System.out.println("Entering Smallest Unit of Paid Time Off");
        page.enteringSmallestUnitPaidTimeOff(smallestUnit);
    }

    @And("^User can enter \"([^\"]*)\" Before Shift Start Paid Time Off Request Zero mean ignore rule$")
    public void userCanEnterMinHoursBeforeShiftStartPaidTimeOffRequestZeroMeanIgnoreRule(String minimumHours) {
        System.out.println("Entering Min Hours Before Shift Start Paid Time Off Request");
        page.enteringMinHoursBeforeShiftStartPaidTimeOffRequest(minimumHours);
    }

    @And("^User should enter \"([^\"]*)\" Before Paid Time Off Request$")
    public void userShouldEnterMaxHoursBeforePaidTimeOffRequest(String maximumHours) {
        System.out.println("Entering Max Hours Before Paid Time Off Request");
        page.enteringMaxHoursBeforePaidTimeOffRequest(maximumHours);
    }

    @And("^User can check on Supervisor Can Override Rules$")
    public void userCanCheckOnSupervisorCanOverrideRules() {
        System.out.println("Checked Supervisor Can Override Rules");
        page.checkedSupervisorCanOverrideRules();
    }

    @And("^User can check on Administrator Can Edit Accrual Balances$")
    public void userCanCheckOnAdministratorCanEditAccrualBalances() {
        System.out.println("Checked Administrator Can Edit Accrual Balances");
        page.checkedAdministratorCanEditAccrualBalances();
    }

    @And("^User can check on Display Current Accrual Balances$")
    public void userCanCheckOnDisplayCurrentAccrualBalances() {
        System.out.println("Checked Display Current Accrual Balances");
        page.checkedDisplayCurrentAccrualBalances();
    }

    @And("^User should enter \"([^\"]*)\" in Advance to Count Against Available$")
    public void userShouldEnterMaxDaysInAdvanceToCountAgainstAvailable(String maximumDays) {
        System.out.println("Entering Max Days in Advance to Count Against Available");
        page.enteringMaxDaysAdvanceCountAgainstAvailable(maximumDays);
    }

    @And("^User can check on Require Available Balance for Requests$")
    public void userCanCheckOnRequireAvailableBalanceForRequests() {
        System.out.println("Checked Require Available Balance for Requests");
        page.checkedRequireAvailableBalanceRequests();
    }

    @And("^User can check on Allow Employee to View Description$")
    public void userCanCheckOnAllowEmployeeToViewDescription() {
        System.out.println("Checked Allow Employee to View Description");
        page.checkedAllowEmployeeViewDescription();
    }

    @And("^User should enter Rule Set \"([^\"]*)\"$")
    public void userShouldEnterRuleSetDescription(String description) {
        System.out.println("Entering Rule Set Description");
        page.enteringRuleSetDescription(description);
    }

    @And("^User should click on Add Button to add new Rule Set$")
    public void userShouldClickOnAddButtonToAddNewRuleSet() {
        System.out.println("Clicking Add Button");
        page.clickingAddButton();
    }
}