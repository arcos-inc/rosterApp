package Steps;

import Base.BaseUtil;
import Pages.RuleSetsPage;
import Utilities.RDTRuleSetsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RuleSetsSD extends BaseUtil {

    private BaseUtil base;
    RuleSetsPage page;
    RDTRuleSetsTab RDT;

    public RuleSetsSD(BaseUtil base) {
        page = new RuleSetsPage(base.Web_Driver);
        RDT = new RDTRuleSetsTab();
        this.base = base;
    }

    @Given("^User should be on Company Rule Set Page$")
    public void userShouldBeOnCompanyRuleSetPage() {
        System.out.println("User should be on Company Rule Set Page");
        page.clickOnRuleSetsTab();
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

    @And("^User enter the Rule Set ([^\\\"]*)$")
    public void userEnterTheRuleSetName(String ruleName) throws Exception {
        System.out.println("User should enter the Rule Set Name");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement ruleSetName = ruleSetCollection.get(0).findElements(By.xpath("td/input")).get(0);
        if (ruleSetName != null) {
            //System.out.println("You got the Tag: " + ruleSetName.getTagName());
            ruleSetName.clear();
            ruleSetName.sendKeys(ruleName);
        }
    }

    @And("^User can check on Request Paid Time Off$")
    public void userCanCheckOnRequestPaidTimeOff() throws Exception {
        System.out.println("User can check on Request Paid Time Off");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement requestPTO = ruleSetCollection.get(1).findElements(By.xpath("td/input")).get(0);
        if (requestPTO != null) {
            //System.out.println("You got the Tag: " + requestPTO.getTagName());
            requestPTO.click();
        }
    }

    @And("^User can check on Request to Cancel Paid Time Off$")
    public void userCanCheckOnRequestToCancelPaidTimeOff() throws Exception {
        System.out.println("User can check on Request to Cancel Paid Time Off");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement cancelPTO = ruleSetCollection.get(2).findElements(By.xpath("td/input")).get(0);
        if (cancelPTO != null) {
            //System.out.println("You got the Tag: " + cancelPTO.getTagName());
            cancelPTO.click();
        }
    }

    @And("^User can check on Approval Required$")
    public void userCanCheckOnApprovalRequired() throws Exception {
        System.out.println("User can check on Approval Required");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement approvalRequired = ruleSetCollection.get(3).findElements(By.xpath("td/input")).get(0);
        if (approvalRequired != null) {
            //System.out.println("You got the Tag: " + approvalRequired.getTagName());
            approvalRequired.click();
        }
    }

    @And("^User should enter ([^\\\"]*) for Denial Comment$")
    public void userShouldEnterMinCharactersForDenialComment(String minimumCharacters) throws Exception {
        System.out.println("User should enter Minimum Characters for Denial Comment");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement minimumDenialComment = ruleSetCollection.get(5).findElements(By.xpath("td/input")).get(0);
        if (minimumDenialComment != null) {
            //System.out.println("You got the Tag: " + minimumDenialComment.getTagName());
            minimumDenialComment.clear();
            minimumDenialComment.sendKeys(minimumCharacters);
        }
    }

    @And("^User can Allow Partial Shift Paid Time Off$")
    public void userCanAllowPartialShiftPaidTimeOff() throws Exception {
        System.out.println("User can Allow Partial Shift Paid Time Off");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement allowPTO = ruleSetCollection.get(6).findElements(By.xpath("td/input")).get(0);
        if (allowPTO != null) {
            //System.out.println("You got the Tag: " + allowPTO.getTagName());
            allowPTO.click();
        }
    }

    @And("^User should enter ([^\\\"]*) of Paid Time Off$")
    public void userShouldEnterSmallestUnitOfPaidTimeOff(String smallestUnit) throws Exception {
        System.out.println("User should enter Smallest Unit of Paid Time Off");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement smallestPOT = ruleSetCollection.get(7).findElements(By.xpath("td/input")).get(0);
        if (smallestPOT != null) {
            //System.out.println("You got the Tag: " + smallestPOT.getTagName());
            smallestPOT.clear();
            smallestPOT.sendKeys(smallestUnit);
        }
    }

    @And("^User can enter ([^\\\"]*) Before Shift Start Paid Time Off Request Zero mean ignore rule$")
    public void userCanEnterMinHoursBeforeShiftStartPaidTimeOffRequestZeroMeanIgnoreRule(String minimumHours) throws Exception {
        System.out.println("User can enter Minimum Hours Before Shift Start Paid Time Off Request Zero mean ignore rule");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement beforeShiftStart = ruleSetCollection.get(8).findElements(By.xpath("td/input")).get(0);
        if (beforeShiftStart != null) {
            //System.out.println("You got the Tag: " + beforeShiftStart.getTagName());
            beforeShiftStart.clear();
            beforeShiftStart.sendKeys(minimumHours);
        }
    }

    @And("^User should enter ([^\\\"]*) Before Paid Time Off Request$")
    public void userShouldEnterMaxHoursBeforePaidTimeOffRequest(String maximumHours) throws Exception {
        System.out.println("User should enter Maximum Hours Before Paid Time Off Request");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement beforePTO = ruleSetCollection.get(10).findElements(By.xpath("td/input")).get(0);
        if (beforePTO != null) {
            //System.out.println("You got the Tag: " + beforePTO.getTagName());
            beforePTO.clear();
            beforePTO.sendKeys(maximumHours);
        }
    }

    @And("^User can check on Supervisor Can Override Rules$")
    public void userCanCheckOnSupervisorCanOverrideRules() throws Exception {
        System.out.println("User can check on Supervisor Can Override Rules");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement supervisorOverrideRules = ruleSetCollection.get(15).findElements(By.xpath("td/input")).get(0);
        if (supervisorOverrideRules != null) {
            //System.out.println("You got the Tag: " + supervisorOverrideRules.getTagName());
            supervisorOverrideRules.click();
        }
    }

    @And("^User can check on Administrator Can Edit Accrual Balances$")
    public void userCanCheckOnAdministratorCanEditAccrualBalances() throws Exception {
        System.out.println("User can check on Administrator Can Edit Accrual Balances");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement editAccrualBalances = ruleSetCollection.get(16).findElements(By.xpath("td/input")).get(0);
        if (editAccrualBalances != null) {
            //System.out.println("You got the Tag: " + editAccrualBalances.getTagName());
            editAccrualBalances.click();
        }
    }

    @And("^User can check on Display Current Accrual Balances$")
    public void userCanCheckOnDisplayCurrentAccrualBalances() throws Exception {
        System.out.println("User can check on Display Current Accrual Balances");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement checkedCurrentAccrualBalances = ruleSetCollection.get(17).findElements(By.xpath("td/input")).get(0);
        if (checkedCurrentAccrualBalances != null) {
            //System.out.println("You got the Tag: " + checkedCurrentAccrualBalances.getTagName());
            checkedCurrentAccrualBalances.click();
        }
    }

    @And("^User should enter ([^\\\"]*) in Advance to Count Against Available$")
    public void userShouldEnterMaxDaysInAdvanceToCountAgainstAvailable(String maximumDays) throws Exception {
        System.out.println("User should enter Maximum Days in Advance to Count Against Available");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement maximumDaysCountAgainst = ruleSetCollection.get(18).findElements(By.xpath("td/input")).get(0);
        if (maximumDaysCountAgainst != null) {
            //System.out.println("You got the Tag: " + maximumDaysCountAgainst.getTagName());
            maximumDaysCountAgainst.clear();
            maximumDaysCountAgainst.sendKeys(maximumDays);
        }
    }

    @And("^User can check on Require Available Balance for Requests$")
    public void userCanCheckOnRequireAvailableBalanceForRequests() throws Exception {
        System.out.println("User can check on Require Available Balance for Requests");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement displayCurrentAccrualBalances = ruleSetCollection.get(20).findElements(By.xpath("td/input")).get(0);
        if (displayCurrentAccrualBalances != null) {
            //System.out.println("You got the Tag: " + displayCurrentAccrualBalances.getTagName());
            displayCurrentAccrualBalances.click();
        }
    }

    @And("^User can check on Allow Employee to View Description$")
    public void userCanCheckOnAllowEmployeeToViewDescription() throws Exception {
        System.out.println("User can check on Allow Employee to View Description");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement viewDescription = ruleSetCollection.get(32).findElements(By.xpath("td/input")).get(0);
        if (viewDescription != null) {
            //System.out.println("You got the Tag: " + viewDescription.getTagName());
            viewDescription.click();
        }
    }

    @And("^User should enter Rule Set ([^\\\"]*)$")
    public void userShouldEnterRuleSetDescription(String description) throws Exception {
        System.out.println("User should enter Rule Set Description");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement writeDescription = ruleSetCollection.get(33).findElements(By.xpath("td/textarea")).get(0);
        if (writeDescription != null) {
            //System.out.println("You got the Tag: " + writeDescription.getTagName());
            writeDescription.clear();
            writeDescription.sendKeys(description);
        }
    }

    @And("^User should click on Add Button to add new Rule Set$")
    public void userShouldClickOnAddButtonToAddNewRuleSet() throws Exception {
        System.out.println("User should click on Add Button to add new Rule Set");
        List<WebElement> ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
        WebElement addNewRuleButton = ruleSetCollection.get(34).findElements(By.xpath("td/input")).get(0);
        if (addNewRuleButton != null) {
            //System.out.println("You got the Tag: " + addNewRuleButton.getTagName());
            addNewRuleButton.click();
        }
    }
}