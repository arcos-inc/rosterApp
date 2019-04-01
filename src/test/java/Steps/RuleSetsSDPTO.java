package Steps;

import Base.BaseUtil;
import Pages.RuleSetsPagePTO;
import Utilities.RDTRuleSetsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RuleSetsSDPTO extends BaseUtil {

    private BaseUtil base;
    RuleSetsPagePTO page;
    RDTRuleSetsTab RDT;
    List<WebElement> ruleSetCollection;

    public RuleSetsSDPTO(BaseUtil base) {
        page = new RuleSetsPagePTO(base.Web_Driver);
        RDT = new RDTRuleSetsTab();
        ruleSetCollection = RDT.getNewPaidTimeOffRuleSetTable(base.Web_Driver);
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
    public void userEnterTheRuleSetName(String ruleName) {
        System.out.println("User should enter the Rule Set Name");
        WebElement ruleSetName = ruleSetCollection.get(0).findElements(By.xpath("td/input")).get(0);
        if (ruleSetName != null) {
            ruleSetName.clear();
            ruleSetName.sendKeys(ruleName);
        }
    }

    @And("^User can check on Request Paid Time Off$")
    public void userCanCheckOnRequestPaidTimeOff() {
        System.out.println("User can check on Request Paid Time Off");
        WebElement requestPTO = ruleSetCollection.get(1).findElements(By.xpath("td/input")).get(0);
        if (requestPTO != null) {
            requestPTO.click();
        }
    }

    @And("^User can check on Request to Cancel Paid Time Off$")
    public void userCanCheckOnRequestToCancelPaidTimeOff() {
        System.out.println("User can check on Request to Cancel Paid Time Off");
        WebElement cancelPTO = ruleSetCollection.get(2).findElements(By.xpath("td/input")).get(0);
        if (cancelPTO != null) {
            cancelPTO.click();
        }
    }

    @And("^User can check on Approval Required$")
    public void userCanCheckOnApprovalRequired() {
        System.out.println("User can check on Approval Required");
        WebElement approvalRequired = ruleSetCollection.get(3).findElements(By.xpath("td/input")).get(0);
        if (approvalRequired != null) {
            approvalRequired.click();
        }
    }

    @And("^User should enter ([^\\\"]*) for Denial Comment$")
    public void userShouldEnterMinCharactersForDenialComment(String minimumCharacters) {
        System.out.println("User should enter Minimum Characters for Denial Comment");
        WebElement minimumDenialComment = ruleSetCollection.get(5).findElements(By.xpath("td/input")).get(0);
        if (minimumDenialComment != null) {
            minimumDenialComment.clear();
            minimumDenialComment.sendKeys(minimumCharacters);
        }
    }

    @And("^User can Allow Partial Shift Paid Time Off$")
    public void userCanAllowPartialShiftPaidTimeOff() {
        System.out.println("User can Allow Partial Shift Paid Time Off");
        WebElement allowPTO = ruleSetCollection.get(6).findElements(By.xpath("td/input")).get(0);
        if (allowPTO != null) {
            allowPTO.click();
        }
    }

    @And("^User should enter ([^\\\"]*) of Paid Time Off$")
    public void userShouldEnterSmallestUnitOfPaidTimeOff(String smallestUnit) {
        System.out.println("User should enter Smallest Unit of Paid Time Off");
        WebElement smallestPOT = ruleSetCollection.get(7).findElements(By.xpath("td/input")).get(0);
        if (smallestPOT != null) {
            smallestPOT.clear();
            smallestPOT.sendKeys(smallestUnit);
        }
    }

    @And("^User can enter ([^\\\"]*) Before Shift Start Paid Time Off Request Zero mean ignore rule$")
    public void userCanEnterMinHoursBeforeShiftStartPaidTimeOffRequestZeroMeanIgnoreRule(String minimumHours) {
        System.out.println("User can enter Minimum Hours Before Shift Start Paid Time Off Request Zero mean ignore rule");
        WebElement beforeShiftStart = ruleSetCollection.get(8).findElements(By.xpath("td/input")).get(0);
        if (beforeShiftStart != null) {
            beforeShiftStart.clear();
            beforeShiftStart.sendKeys(minimumHours);
        }
    }

    @And("^User should enter ([^\\\"]*) Before Paid Time Off Request$")
    public void userShouldEnterMaxHoursBeforePaidTimeOffRequest(String maximumHours) {
        System.out.println("User should enter Maximum Hours Before Paid Time Off Request");
        WebElement beforePTO = ruleSetCollection.get(10).findElements(By.xpath("td/input")).get(0);
        if (beforePTO != null) {
            beforePTO.clear();
            beforePTO.sendKeys(maximumHours);
        }
    }

    @And("^User can check on Supervisor Can Override Rules$")
    public void userCanCheckOnSupervisorCanOverrideRules() {
        System.out.println("User can check on Supervisor Can Override Rules");
        WebElement supervisorOverrideRules = ruleSetCollection.get(15).findElements(By.xpath("td/input")).get(0);
        if (supervisorOverrideRules != null) {
            supervisorOverrideRules.click();
        }
    }

    @And("^User can check on Administrator Can Edit Accrual Balances$")
    public void userCanCheckOnAdministratorCanEditAccrualBalances() {
        System.out.println("User can check on Administrator Can Edit Accrual Balances");
        WebElement editAccrualBalances = ruleSetCollection.get(16).findElements(By.xpath("td/input")).get(0);
        if (editAccrualBalances != null) {
            editAccrualBalances.click();
        }
    }

    @And("^User can check on Display Current Accrual Balances$")
    public void userCanCheckOnDisplayCurrentAccrualBalances() {
        System.out.println("User can check on Display Current Accrual Balances");
        WebElement checkedCurrentAccrualBalances = ruleSetCollection.get(17).findElements(By.xpath("td/input")).get(0);
        if (checkedCurrentAccrualBalances != null) {
            checkedCurrentAccrualBalances.click();
        }
    }

    @And("^User should enter ([^\\\"]*) in Advance to Count Against Available$")
    public void userShouldEnterMaxDaysInAdvanceToCountAgainstAvailable(String maximumDays) {
        System.out.println("User should enter Maximum Days in Advance to Count Against Available");
        WebElement maximumDaysCountAgainst = ruleSetCollection.get(18).findElements(By.xpath("td/input")).get(0);
        if (maximumDaysCountAgainst != null) {
            maximumDaysCountAgainst.clear();
            maximumDaysCountAgainst.sendKeys(maximumDays);
        }
    }

    @And("^User can check on Require Available Balance for Requests$")
    public void userCanCheckOnRequireAvailableBalanceForRequests() {
        System.out.println("User can check on Require Available Balance for Requests");
        WebElement displayCurrentAccrualBalances = ruleSetCollection.get(20).findElements(By.xpath("td/input")).get(0);
        if (displayCurrentAccrualBalances != null) {
            displayCurrentAccrualBalances.click();
        }
    }

    @And("^User can check on Allow Employee to View Description$")
    public void userCanCheckOnAllowEmployeeToViewDescription() {
        System.out.println("User can check on Allow Employee to View Description");
        WebElement viewDescription = ruleSetCollection.get(32).findElements(By.xpath("td/input")).get(0);
        if (viewDescription != null) {
            viewDescription.click();
        }
    }

    @And("^User should enter Rule Set ([^\\\"]*)$")
    public void userShouldEnterRuleSetDescription(String description) {
        System.out.println("User should enter Rule Set Description");
        WebElement writeDescription = ruleSetCollection.get(33).findElements(By.xpath("td/textarea")).get(0);
        if (writeDescription != null) {
            writeDescription.clear();
            writeDescription.sendKeys(description);
        }
    }

    @And("^User should click on Add Button to add new Rule Set$")
    public void userShouldClickOnAddButtonToAddNewRuleSet() {
        System.out.println("User should click on Add Button to add new Rule Set");
        WebElement addNewRuleButton = ruleSetCollection.get(34).findElements(By.xpath("td/input")).get(0);
        if (addNewRuleButton != null) {
            addNewRuleButton.click();
        }
    }
}