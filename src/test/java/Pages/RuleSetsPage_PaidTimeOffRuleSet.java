package Pages;

import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RuleSetsPage_PaidTimeOffRuleSet {

    Helper help;

    public RuleSetsPage_PaidTimeOffRuleSet(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "lnkNewPtoRuleSet")
    public WebElement lnkNewPtoRuleSet;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement lblPageHeading;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement txtName;

    @FindBy(how = How.ID, using = "chkCanRequestPto")
    public WebElement chkCanRequestPto;

    @FindBy(how = How.ID, using = "chkCanRequestToCancelPto")
    public WebElement chkCanRequestToCancelPto;

    @FindBy(how = How.ID, using = "chkApprovalRequired")
    public WebElement chkApprovalRequired;

    @FindBy(how = How.ID, using = "txtMinDenialCommentCharacters")
    public WebElement txtMinDenialCommentCharacters;

    @FindBy(how = How.ID, using = "chkAllowPartialShiftPTO")
    public WebElement chkAllowPartialShiftPTO;

    @FindBy(how = How.ID, using = "txtSmallestUnitOfPto")
    public WebElement txtSmallestUnitOfPto;

    @FindBy(how = How.ID, using = "txtMinHoursBeforePtoRequest")
    public WebElement txtMinHoursBeforePtoRequest;

    @FindBy(how = How.ID, using = "txtMaxHoursBeforePtoRequest")
    public WebElement txtMaxHoursBeforePtoRequest;

    @FindBy(how = How.ID, using = "chkSupervisorCanOverride")
    public WebElement chkSupervisorCanOverride;

    @FindBy(how = How.ID, using = "chkAdminCanEditBal")
    public WebElement chkAdminCanEditBal;

    @FindBy(how = How.ID, using = "chkDispCurrBal")
    public WebElement chkDispCurrBal;

    @FindBy(how = How.ID, using = "txtMaxDaysAdvanceAgainstAvail")
    public WebElement txtMaxDaysAdvanceAgainstAvail;

    @FindBy(how = How.ID, using = "chkReqPtoAvailForRequest")
    public WebElement chkReqPtoAvailForRequest;

    @FindBy(how = How.ID, using = "chkAllowEEToViewDescription")
    public WebElement chkAllowEEToViewDescription;

    @FindBy(how = How.ID, using = "txtRuleSetDescription")
    public WebElement txtRuleSetDescription;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnAddEdit;

    public void clickingOnNewPTORuleSet() {
        System.out.println("Clicking on Create New Paid Time Off Rule Set");
        lnkNewPtoRuleSet.click();
    }

    public void getNewPaidTimeOffRuleSetWindow() {
        if (lblPageHeading.getText().contains("New Paid Time Off Rule Set")) {
            System.out.println("User is in on Create New Rule Sets Window");
        }
    }

    public void enteringPTORuleSetName(String PTOName) throws Exception {
        txtName.clear();
        txtName.sendKeys(PTOName);
        //help.waitForAWhile(txtName.toString());
    }

    public void checkedCanRequestPaidTimeOff() {
        chkCanRequestPto.click();
    }

    public void checkedCanRequestCancelPaidTimeOff() {
        chkCanRequestToCancelPto.click();
    }

    public void checkedApprovalRequired() {
        chkApprovalRequired.click();
    }

    public void enteringMinCharactersDenialComment(String denialComment) throws Exception {
        txtMinDenialCommentCharacters.clear();
        txtMinDenialCommentCharacters.sendKeys(denialComment);
        //help.waitForAWhile(txtMinDenialCommentCharacters.toString());
    }

    public void checkedAllowPartialShiftPaidTimeOff() {
        chkAllowPartialShiftPTO.click();
    }

    public void enteringSmallestUnitPaidTimeOff(String smallestUnit) throws Exception {
        txtSmallestUnitOfPto.clear();
        txtSmallestUnitOfPto.sendKeys(smallestUnit);
        //help.waitForAWhile(txtSmallestUnitOfPto.toString());
    }

    public void enteringMinHoursBeforeShiftStartPaidTimeOffRequest(String beforeShiftStart) throws Exception {
        txtMinHoursBeforePtoRequest.clear();
        txtMinHoursBeforePtoRequest.sendKeys(beforeShiftStart);
        //help.waitForAWhile(txtMinHoursBeforePtoRequest.toString());
    }

    public void enteringMaxHoursBeforePaidTimeOffRequest(String maxHoursBeforePaidTimeOff) throws Exception {
        txtMaxHoursBeforePtoRequest.clear();
        txtMaxHoursBeforePtoRequest.sendKeys(maxHoursBeforePaidTimeOff);
        //help.waitForAWhile(txtMaxHoursBeforePtoRequest.toString());
    }

    public void checkedSupervisorCanOverrideRules() {
        chkSupervisorCanOverride.click();
    }

    public void checkedAdministratorCanEditAccrualBalances() {
        chkAdminCanEditBal.click();
    }

    public void checkedDisplayCurrentAccrualBalances() {
        chkDispCurrBal.click();
    }

    public void enteringMaxDaysAdvanceCountAgainstAvailable(String maxDaysAdvance) throws Exception {
        txtMaxDaysAdvanceAgainstAvail.clear();
        txtMaxDaysAdvanceAgainstAvail.sendKeys(maxDaysAdvance);
        //help.waitForAWhile(txtMaxDaysAdvanceAgainstAvail.toString());
    }

    public void checkedRequireAvailableBalanceRequests() {
        chkReqPtoAvailForRequest.click();
    }

    public void checkedAllowEmployeeViewDescription() {
        chkAllowEEToViewDescription.click();
    }

    public void enteringRuleSetDescription(String ruleSetDescription) throws Exception {
        txtRuleSetDescription.clear();
        txtRuleSetDescription.sendKeys(ruleSetDescription);
        //help.waitForAWhile(txtRuleSetDescription.toString());
    }

    public void clickingAddButton() {
        btnAddEdit.click();
    }
}
