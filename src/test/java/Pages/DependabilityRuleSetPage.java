package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import Utilities.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DependabilityRuleSetPage extends BaseUtil {

    Helper help;

    public DependabilityRuleSetPage (WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "lnkNewDependabilityRuleSet")
    public WebElement clickNewDependability;

    @FindBy(how = How.ID, using = "txtDependabilityRuleSetName")
    public WebElement enterRuleSetName;

    @FindBy(how = How.ID, using = "txtDependabilityRuleSetDesc")
    public WebElement enterRuleSetDesc;

    @FindBy(how = How.ID, using = "rdoRollingBasis")
    public WebElement expirePoints;

    @FindBy(how = How.ID, using = "txtRollingPointsVal")
    public WebElement PointsValid;

    @FindBy(how = How.ID, using = "cboRollingPointsVal")
    public WebElement optionSeconds;

    @FindBy(how = How.ID, using = "cboRollingPointsVal")
    public WebElement optionDay;

    @FindBy(how = How.ID, using = "chkFreezePoints")
    public WebElement freezePoints;

    @FindBy(how = How.ID, using = "btnSave")
    public WebElement saveBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdDependabilityRuleSet\"]/tbody/tr[3]/td[2]/a")
    public WebElement editNewDependability;

    @FindBy(how = How.XPATH, using = "grdDependabilityRuleSet")
    public WebElement grdDependabilityRuleSet;

    @FindBy(how = How.ID, using = "chkSupervisorCanViewDependabilityHistory")
    public WebElement chkDependabilityHistory;

    @FindBy(how = How.ID, using = "chkLocationAdminCanDeductPoints")
    public WebElement chkLocationAdmin;

    @FindBy(how = How.ID, using = "chkLocationAdminCanUndoCompletedActions")
    public WebElement chkLocationAdminCompletedActions;

    @FindBy(how = How.ID, using = "lnkNewAttendancePointRule")
    public WebElement lnkNewAttendancePointRule;

    @FindBy(how = How.ID, using = "txtRuleName")
    public WebElement enterRuleName;

    @FindBy(how = How.ID, using = "infractionTypeDPLOT")
    public WebElement checkInfractionType;

    @FindBy(how = How.ID, using = "absentReason4")
    public WebElement checkabsentReason4;

    @FindBy(how = How.ID, using = "shiftType2")
    public WebElement checkShiftType2;

    @FindBy(how = How.ID, using = "txtPoints")
    public WebElement enterTxtPoints;

    @FindBy(how = How.ID, using = "txtMinAbsenceLength")
    public WebElement enterTxtMinAbsenceLength;

    @FindBy(how = How.ID, using = "txtMaxAbsenceLength")
    public WebElement enterTxtMaxAbsenceLength ;

    @FindBy(how = How.ID, using = "cboMinAbsenceLength")
    public WebElement selectminAbsenceLength;

    @FindBy(how = How.ID, using = "cboMaxAbsenceLength")
    public WebElement selectMaxAbsenceLength;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/button[1]/span")
    public WebElement doneBtn;

    public void clickNewDependabilityRuleSets() {
        clickNewDependability.click();
    }

    public void enterDependabilityRuleSetName(String ruleSetName) {
        enterRuleSetName.clear();
        enterRuleSetName.sendKeys(ruleSetName);
    }

    public void enterDependabilityRuleSetDescription(String ruleSetDesc) {
        enterRuleSetDesc.clear();
        enterRuleSetDesc.sendKeys(ruleSetDesc);
    }

    public void checkExpirePoints() {
        expirePoints.click();
    }

    public void enterThePointsValid(String points) {
        PointsValid.clear();
        PointsValid.sendKeys(points);
    }

    public void selectSeconds() {
        Select select = new Select(optionSeconds);
        select.selectByIndex(5);
    }

    public void selectDay() {
        Select select = new Select(optionDay);
        select.selectByIndex(1);
    }

    public void checkFreezePoints() {
        freezePoints.click();
    }

    public void saveBtn() {
        saveBtn.click();

    }

    public void clickEditNewDependability() {
//        Select select = new Select(grdDependabilityRuleSet);
//        select.selectByIndex(9);
        editNewDependability.click();
    }

    public void checkDependabilityHistory() {
        chkDependabilityHistory.click();
    }

    public void CheckOnTheDependabilityOccurances() {
        chkLocationAdmin.click();
    }

    public void CheckDisciplinaryActions() {
        chkLocationAdminCompletedActions.click();
    }

    public void clickAddNewDependability() {
        lnkNewAttendancePointRule.click();
    }

    public void enterAddDependabilityName(String addDependability) {
        enterRuleName.clear();
        enterRuleName.sendKeys(addDependability);
    }

    public void checkInfractionTypes() {
        checkInfractionType.click();
    }

    public void checkAbsentReasons() {
        checkabsentReason4.click();
    }

    public void checkShiftClassifications() {
        checkShiftType2.click();
    }

    public void enterPoints(String points) {
        enterTxtPoints.clear();
        enterTxtPoints.sendKeys(points);
    }

    public void enterTheMinLengthOfAbsence(String minAbsence) {
        enterTxtMinAbsenceLength.clear();
        enterTxtMinAbsenceLength.sendKeys(minAbsence);
    }

    public void enterTheMaxLengthOfAbsence(String maxAbsence) {
        enterTxtMaxAbsenceLength.clear();
        enterTxtMaxAbsenceLength.sendKeys(maxAbsence);
    }

    public void selectAnOptionFromDropdown() {
        Select select = new Select(selectminAbsenceLength);
        select.selectByIndex(1);
    }

    public void selectAnOptionFromDropdownMaxLength() {
        Select select = new Select(selectMaxAbsenceLength);
        select.selectByIndex(1);
    }

    public void clickDoneButton() {
        doneBtn.click();
    }

}


