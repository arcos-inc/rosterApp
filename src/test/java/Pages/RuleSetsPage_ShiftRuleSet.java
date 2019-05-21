package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RuleSetsPage_ShiftRuleSet {
    public RuleSetsPage_ShiftRuleSet(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "ucPageHeader_ucRoleSwitcher_cboRole")
    //@CacheLookup
    public WebElement dropDownActingAs;

    @FindBy(how = How.LINK_TEXT, using = "RULE SETS")
    public WebElement ruleSetsTab;

    @FindBy(how = How.ID, using = "lnkNewShiftRuleSet")
    public WebElement createNewShiftRuleSet;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement lbNewShiftRuleSet;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement enterRuleSetName;

    @FindBy(how = How.ID, using = "txtMinHoursBeforeShiftTrade")
    public WebElement minHours;

    @FindBy(how = How.ID, using = "txtMaxHoursBeforeShiftTrade")
    public WebElement maxHours;

    @FindBy(how = How.ID, using = "chkCanReceiveTrade")
    public WebElement receiveTrades;

    @FindBy(how = How.ID, using = "chkCanTradeAway")
    public WebElement tradeAwayShifts;

    @FindBy(how = How.ID, using = "chkCanPostToTradeBoard")
    public WebElement postToTradeBoard;

    @FindBy(how = How.ID, using = "chkTradeBoardPostApprovalRequired")
    public WebElement postApprovalRequired;

    @FindBy(how = How.ID, using = "chkCanClaimFromTradeBoard")
    public WebElement claimShiftFromTradeBoard;

    @FindBy(how = How.ID, using = "chkTradeBoardClaimApprovalRequired")
    public WebElement shiftClaimApprovalRequired;

    @FindBy(how = How.ID, using = "chkCanOneWayTrade")
    public WebElement oneWayTrade;

    @FindBy(how = How.ID, using = "chkOneWayTradeApprovalRequired")
    public WebElement oneWayTradeApproval;

    @FindBy(how = How.ID, using = "chkCanTwoWayTrade")
    public WebElement twoWayTrade;

    @FindBy(how = How.ID, using = "chkTwoWayTradeApprovalRequired")
    public WebElement twoWayTradeApproval;

    @FindBy(how = How.ID, using = "chkCanBlockTradeOneWay")
    public WebElement blockTradeOneWay;

    @FindBy(how = How.ID, using = "chkCanBlockTradeTwoWay")
    public WebElement blockTradeTwoWay;

    @FindBy(how = How.ID, using = "chkOneWayBlockTradeApprovalRequired")
    public WebElement oneWayBlockTradeApproval;

    @FindBy(how = How.ID, using = "chkTwoWayBlockTradeApprovalRequired")
    public WebElement twoWayBlockTradeApproval;

    @FindBy(how = How.ID, using = "chkCanPermanentTradeShifts")
    public WebElement recurringShiftTrades;

    @FindBy(how = How.ID, using = "chkPermanentTradeApprovalRequired")
    public WebElement recurringShiftTradeApproval;

    @FindBy(how = How.ID, using = "txtMaxSplitShiftOverlap")
    public WebElement maxShiftHours;

    @FindBy(how = How.ID, using = "txtMaxShiftOverlapForDay")
    public WebElement maxShiftDay;

    @FindBy(how = How.ID, using = "txtMaxWeekWorkHours")
    public WebElement workHours;

    @FindBy(how = How.ID, using = "txtMaxOTQualifiedHoursPerWeek")
    public WebElement qualifiedHoursPerWeek;

    @FindBy(how = How.ID, using = "txtMaxHoursInWindowHours")
    public WebElement maxHoursInWindow;

    @FindBy(how = How.ID, using = "txtWindowHours")
    public WebElement maxWindowHours;

    @FindBy(how = How.ID, using = "txtMaxConsecWorkDays")
    public WebElement maxConsecutiveDays;

    @FindBy(how = How.ID, using = "txtMinRestHoursBeforeFirstShift")
    public WebElement restHours;

    @FindBy(how = How.ID, using = "chkCanSplitShift")
    public WebElement employeeSplitShift;

    @FindBy(how = How.ID, using = "txtMinSplitShiftSegmentHours")
    public WebElement splitShift;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement addButton;

    public void GetLocationURL(WebDriver driver) {
        //String locationLabel = getLocationLabel.getText().toLowerCase();
        String url = driver.getCurrentUrl();

        //System.out.println("You got this value: " + locationLabel);

        if (url.contains("Supervisor")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        } else if (url.contains("ScheduleView")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        } else if (url.contains("HumanResources")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        } else if (url.contains("Admin")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
    }

    public void clickRuleSetTab() {
        ruleSetsTab.click();
    }

    public void clickCreateNewShiftRuleSet() {
        createNewShiftRuleSet.click();
    }

    public void enteringRuleSetName(String ruleSetName) {
        enterRuleSetName.sendKeys(ruleSetName);
    }

    public void enteringMinHours(String minimumHours) {
        minHours.clear();
        minHours.sendKeys(minimumHours);
    }

    public void enteringMaxHours(String maximumHours) {
        maxHours.clear();
        maxHours.sendKeys(maximumHours);
    }

    public void canReceiveTrades() {
        receiveTrades.click();
    }

    public void canTradeAwayShifts() {
        tradeAwayShifts.click();
    }

    public void canPostToTradeBoard() {
        postToTradeBoard.click();
    }

    public void tradeBoardPostApprovalRequired() {
        postApprovalRequired.click();
    }

    public void canClaimShiftTradeFromTradeBoard() {
        claimShiftFromTradeBoard.click();
    }

    public void tradeBoardShiftTradeClaimApprovalRequired() {
        shiftClaimApprovalRequired.click();
    }

    public void canOneWayTrade() {
        oneWayTrade.click();
    }

    public void oneWayTradeApprovalRequired() {
        oneWayTradeApproval.click();
    }

    public void canTwoWayTrade() {
        twoWayTrade.click();
    }

    public void twoWayTradeApprovalRequired() {
        twoWayTradeApproval.click();
    }

    public void canBlockTradeOneWay() {
        blockTradeOneWay.click();
    }

    public void canBlockTradeTwoWay() {
        blockTradeTwoWay.click();
    }

    public void oneWayBlockTradeApprovalRequired() {
        oneWayBlockTradeApproval.click();
    }

    public void twoWayBlockTradeApprovalRequired() {
        twoWayBlockTradeApproval.click();
    }

    public void canRequestRecurringShiftTrades() {
        recurringShiftTrades.click();
    }

    public void recurringShiftTradeApprovalRequired() {
        recurringShiftTradeApproval.click();
    }

    public void maxShiftOverlapSplitShiftHours(String overLapShiftHours) {
        maxShiftHours.clear();
        maxShiftHours.sendKeys(overLapShiftHours);
    }

    public void maxShiftOverlapDay(String overlapShiftDay) {
        maxShiftDay.sendKeys(overlapShiftDay);
    }

    public void maxWeekWorkHours(String maxWorkHour) {
        workHours.clear();
        workHours.sendKeys(maxWorkHour);
    }

    public void maxOvertimeQualifiedHoursPerWeek(String qualifiedHours) {
        qualifiedHoursPerWeek.clear();
        qualifiedHoursPerWeek.sendKeys(qualifiedHours);
    }

    public void maxWorkHoursInWindow(String hoursInWindow) {
        maxHoursInWindow.clear();
        maxHoursInWindow.sendKeys(hoursInWindow);
    }

    public void windowHoursMaxWorkHours(String maxWorkHours) {
        maxWindowHours.clear();
        maxWindowHours.sendKeys(maxWorkHours);
    }

    public void maxConsecutiveWorkDays(String consecutiveWorkDays) {
        maxConsecutiveDays.clear();
        maxConsecutiveDays.sendKeys(consecutiveWorkDays);
    }

    public void minContinuousRestHoursBeforeFirstShiftDay(String firstShiftDay) {
        restHours.sendKeys(firstShiftDay);
    }

    public void canEmployeeSplitShift() {
        employeeSplitShift.click();
    }

    public void minShiftSegmentAfterSplitHours(String employeeSplitShift) {
        splitShift.clear();
        splitShift.sendKeys(employeeSplitShift);
    }

    public void clickAddButton() {
        addButton.click();
    }
}
