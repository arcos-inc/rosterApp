package Steps;

import Base.BaseUtil;
import Pages.RuleSetsPage_ShiftRuleSet;
import Utilities.RDTRuleSetsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RuleSetsSD_ShiftRuleSet extends BaseUtil {
    private BaseUtil base;
    RuleSetsPage_ShiftRuleSet page;
    RDTRuleSetsTab RDT;
    //List<WebElement> ruleSetCollection;

    public RuleSetsSD_ShiftRuleSet(BaseUtil base) {
        page = new RuleSetsPage_ShiftRuleSet(Web_Driver);
        //RDT = new RDTRuleSetsTab();
        //ruleSetCollection = RDT.getNewShiftRuleSets(Web_Driver);
        this.base = base;
    }

    @Given("^User should be login as a Company Admin$")
    public void userShouldBeLoginAsACompanyAdmin() {
        System.out.println("User login as a Company Admin");
    }

    @And("^User should be on Rule Set Tab$")
    public void userShouldBeOnRuleSetTab() {
        System.out.println("Clicking on Rule Set Tab");
        page.clickRuleSetTab();
    }

    @When("^User clicks on Create New Shift Rule Set$")
    public void userClicksOnCreateNewShiftRuleSet() {
        System.out.println("Clicking on Create New Shift Rule Set");
        page.clickCreateNewShiftRuleSet();
    }

    @Then("^User should be navigated to New Shift Rule Set page$")
    public void userShouldBeNavigatedToNewShiftRuleSetPage() {
        String newShiftLable = page.lbNewShiftRuleSet.getText();
        if (newShiftLable.equals("New Shift Rule Set")) {
            System.out.println("User is on right page");
        }
    }

    @And("^User should be able to enter \"([^\"]*)\"$")
    public void userShouldBeAbleToEnter(String ruleSetName) throws Exception {
        System.out.println("Entering Rule Set Name");
        page.enteringRuleSetName(ruleSetName);
    }

    @And("^User should be able to enter \"([^\"]*)\" for Before Shift Trade$")
    public void userShouldBeAbleToEnterForBeforeShiftTrade(String MinHrs) throws Exception {
        System.out.println("Entering Minimum Hours");
        page.enteringMinHours(MinHrs);
    }


    @And("^User should be able to enter \"([^\"]*)\" for Before Shift Trades$")
    public void userShouldBeAbleToEnterForBeforeShiftTrades(String MaxHrs) throws Exception {
        System.out.println("Entering Maximum Hours");
        page.enteringMaxHours(MaxHrs);
    }

    @And("^User should be able to check Can Receive Trades$")
    public void userShouldBeAbleToCheckCanReceiveTrades() {
        System.out.println("Checked Can Receive Trades");
        page.canReceiveTrades();
    }

    @And("^User should be able to check Can Trade Away Shifts$")
    public void userShouldBeAbleToCheckCanTradeAwayShifts() {
        System.out.println("Checked Can Trade Away Shifts");
        page.canTradeAwayShifts();
    }

    @And("^User should be able to check Can Post To Trade Board$")
    public void userShouldBeAbleToCheckCanPostToTradeBoard() {
        System.out.println("Checked Can Post To Trade Board");
        page.canPostToTradeBoard();
    }

    @And("^User should be able to check Trade Board Post Approval Required$")
    public void userShouldBeAbleToCheckTradeBoardPostApprovalRequired() {
        System.out.println("Checked Trade Board Post Approval Required");
        page.tradeBoardPostApprovalRequired();
    }

    @And("^User should be able to check Can Claim Shift Trade From Trade Board$")
    public void userShouldBeAbleToCheckCanClaimShiftTradeFromTradeBoard() {
        System.out.println("Checked Can Claim Shift Trade From Trade Board");
        page.canClaimShiftTradeFromTradeBoard();
    }

    @And("^User should be able to check Trade Board Shift Trade Claim Approval Required$")
    public void userShouldBeAbleToCheckTradeBoardShiftTradeClaimApprovalRequired() {
        System.out.println("Checked Trade Board Shift Trade Claim Approval Required");
        page.tradeBoardShiftTradeClaimApprovalRequired();
    }

    @And("^User should be able to check Can One Way Trade$")
    public void userShouldBeAbleToCheckCanOneWayTrade() {
        System.out.println("Checked Can One Way Trade");
        page.canOneWayTrade();
    }

    @And("^User should be able to check One Way Trade Approval Required$")
    public void userShouldBeAbleToCheckOneWayTradeApprovalRequired() {
        System.out.println("Checked One Way Trade Approval Required");
        page.oneWayTradeApprovalRequired();
    }

    @And("^User should be able to check Can Two Way Trade$")
    public void userShouldBeAbleToCheckCanTwoWayTrade() {
        System.out.println("Checked Can Two Way Trade");
        page.canTwoWayTrade();
    }

    @And("^User should be able to check Two Way Trade Approval Required$")
    public void userShouldBeAbleToCheckTwoWayTradeApprovalRequired() {
        System.out.println("Checked Two Way Trade Approval Required");
        page.twoWayTradeApprovalRequired();
    }

    @And("^User should be able to check Can Block Trade One Way$")
    public void userShouldBeAbleToCheckCanBlockTradeOneWay() {
        System.out.println("Checked Can Block Trade One Way");
        page.canBlockTradeOneWay();
    }

    @And("^User should be able to check Can Block Trade Two Way$")
    public void userShouldBeAbleToCheckCanBlockTradeTwoWay() {
        System.out.println("Checked Can Block Trade Two Way");
        page.canBlockTradeTwoWay();
    }

    @And("^User should be able to check One Way Block Trade Approval Required$")
    public void userShouldBeAbleToCheckOneWayBlockTradeApprovalRequired() {
        System.out.println("Checked One Way Block Trade Approval Required");
        page.oneWayBlockTradeApprovalRequired();
    }

    @And("^User should be able to check Two Way Block Trade Approval Required$")
    public void userShouldBeAbleToCheckTwoWayBlockTradeApprovalRequired() {
        System.out.println("Checked Two Way Block Trade Approval Required");
        page.twoWayBlockTradeApprovalRequired();
    }

    @And("^User should be able to check Can Request Recurring Shift Trades$")
    public void userShouldBeAbleToCheckCanRequestRecurringShiftTrades() {
        System.out.println("Checked Can Request Recurring Shift Trades");
        page.canRequestRecurringShiftTrades();
    }

    @And("^User should be able to check Recurring Shift Trade Approval Required$")
    public void userShouldBeAbleToCheckRecurringShiftTradeApprovalRequired() {
        System.out.println("Checked Recurring Shift Trade Approval Required");
        page.recurringShiftTradeApprovalRequired();
    }

    @And("^User should be able to enter Max Shift Overlap For \"([^\"]*)\" hours$")
    public void userShouldBeAbleToEnterMaxShiftOverlapForHours(String SplitShifts) throws Exception {
        System.out.println("Entering Max Shift Overlap For Split Shifts hours");
        page.maxShiftOverlapSplitShiftHours(SplitShifts);
    }

    @And("^User should be able to enter Max Shift Overlap For \"([^\"]*)\"$")
    public void userShouldBeAbleToEnterMaxShiftOverlapFor(String Day) throws Exception {
        System.out.println("Entering Max Shift Overlap For Day");
        page.maxShiftOverlapDay(Day);
    }

    @And("^User should be able to enter Max \"([^\"]*)\"$")
    public void userShouldBeAbleToEnterMax(String WeekWorkHrs) throws Exception {
        System.out.println("Entering Max Week Work Hours");
        page.maxWeekWorkHours(WeekWorkHrs);
    }

    @And("^User should be able to enter Max Overtime \"([^\"]*)\" per Week$")
    public void userShouldBeAbleToEnterMaxOvertimePerWeek(String QualifiedHrs) throws Exception {
        System.out.println("Entering Max Overtime Qualified Hours per Week");
        page.maxOvertimeQualifiedHoursPerWeek(QualifiedHrs);
    }

    @And("^User should be able to enter Max Work Hours \"([^\"]*)\"$")
    public void userShouldBeAbleToEnterMaxWorkHours(String InWindow) throws Exception {
        System.out.println("Entering Max Work Hours In Window");
        page.maxWorkHoursInWindow(InWindow);
    }

    @And("^User should be able to enter \"([^\"]*)\" for Max Work Hours$")
    public void userShouldBeAbleToEnterForMaxWorkHours(String WindowHrs) throws Exception {
        System.out.println("Entering Window Hours for Max Work Hours");
        page.windowHoursMaxWorkHours(WindowHrs);
    }

    @And("^User should be able to enter Max \"([^\"]*)\" Work Days$")
    public void userShouldBeAbleToEnterMaxWorkDays(String Consecutive) throws Exception {
        System.out.println("Entering Max Consecutive Work Days");
        page.maxConsecutiveWorkDays(Consecutive);
    }

    @And("^User should be able to enter Min \"([^\"]*)\" Hours Before First Shift of Day$")
    public void userShouldBeAbleToEnterMinHoursBeforeFirstShiftOfDay(String ContinuousRest) throws Exception {
        System.out.println("Entering Min Continuous Rest Hours Before First Shift of Day");
        page.minContinuousRestHoursBeforeFirstShiftDay(ContinuousRest);
    }

    @And("^User should be able to check Can Employee Split Shift$")
    public void userShouldBeAbleToCheckCanEmployeeSplitShift() {
        System.out.println("Checked Can Employee Split Shift");
        page.canEmployeeSplitShift();
    }

    @And("^User should be able to enter Min \"([^\"]*)\" After Split hours$")
    public void userShouldBeAbleToEnterMinAfterSplitHours(String ShiftSegment) throws Exception {
        System.out.println("Entering Min Shift Segment After Split Hours");
        page.minShiftSegmentAfterSplitHours(ShiftSegment);
    }

    @Then("^User should be able to click on Add button successfully$")
    public void userShouldBeAbleToClickOnAddButtonSuccessfully() {
        System.out.println("Click Add Button");
        page.clickAddButton();
    }

    @And("^User should be able to check Can Receive Tradess$")
    public void userShouldBeAbleToCheckCanReceiveTradess() {
    }
}
