package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import io.cucumber.java.eo.Se;
import org.apache.poi.ss.formula.functions.Rank;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;

public class SettingsPage extends BaseUtil {

    Helper helper;

    public SettingsPage(WebDriver driver){
        helper = new Helper();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"PostForm\"]/table[1]/tbody/tr[3]/td/ul/li[8]")
    public WebElement clickCostCentersLinkText;

    @FindBy(how = How.LINK_TEXT, using = "Edit Employee Profile Settings")
    public WebElement clickEmployeeProfileSettings;

    @FindBy(how = How.ID, using = "repFields_ctl12_chkCR")
    public WebElement clickCheckbox1;

    @FindBy(how = How.ID, using = "repFields_ctl14_chkCR")
    public WebElement clickCheckbox2;

    @FindBy(how = How.ID, using = "repFields_ctl16_chkCR")
    public WebElement clickCheckbox3;

    @FindBy(how = How.ID, using = "repFields_ctl18_chkCR")
    public WebElement clickCheckbox4;

    @FindBy(how = How.ID, using = "repFields_ctl20_chkCR")
    public WebElement clickCheckbox5;

    @FindBy(how = How.ID, using = "repFields_ctl22_chkCR")
    public WebElement clickCheckbox6;

    @FindBy(how = How.ID, using = "repFields_ctl24_chkCR")
    public WebElement clickCheckbox7;

    @FindBy(how = How.ID, using = "btnUpdate")
    public WebElement clickDoneButton;

    @FindBy(how = How.LINK_TEXT, using = "Edit Absent Reasons")
    public WebElement clickEditAbsentReasons;

    @FindBy(how = How.LINK_TEXT, using = "Create New Absent Reason")
    public WebElement clickNewAbsentReason;

    @FindBy(how = How.ID, using = "txtCode")
    public WebElement enterCode;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement enterDescription;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnAddEdit;

    @FindBy(how = How.ID, using = "txtDisplayOrder")
    public WebElement enterDisplayOrder;

    @FindBy(how = How.ID, using = "btnCancel")
    public WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdReasons\"]/tbody/tr[2]/td[13]/a")
    public WebElement clickEdit;

    @FindBy(how = How.LINK_TEXT, using = "Edit Paid Time Off Reasons")
    public WebElement clickEditPaidTimeOffReasons;

    @FindBy(how = How.LINK_TEXT, using = "Create New Paid Time Off Reason")
    public WebElement clickCreateNewPaidTimeOffReasons;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdReasons\"]/tbody/tr[2]/td[14]/a")
    public WebElement clickEditPaidTimeOff;

    @FindBy(how = How.LINK_TEXT, using = "Edit Overtime Reasons")
    public WebElement clickEditOvertimeReasonsReasons;

    @FindBy(how = How.LINK_TEXT, using = "Create New Overtime Reason")
    public WebElement clickCreateOvertimeReasons;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdReasons\"]/tbody/tr[2]/td[9]/a")
    public WebElement clickEditOvertimeReason;

    @FindBy(how = How.LINK_TEXT, using = "Edit Unauthorized Hours Reasons")
    public WebElement clickEditUnauthorizedHoursReasons;

    @FindBy(how = How.LINK_TEXT, using = "Create New Unauthorized Hours Reason")
    public WebElement clickCreateUnauthorizedHoursReason;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tblReasons\"]/tbody/tr[1]/td[8]/a")
    public WebElement clickUnauthorizedHours;

    @FindBy(how = How.LINK_TEXT, using = "Edit Password Policy")
    public WebElement clickEditPasswordPolicy;

    @FindBy(how = How.ID, using = "chkMustChangeInitialPW")
    public WebElement checkInitialPW;

    @FindBy(how = How.ID, using = "chkAllowSelfPWReset")
    public WebElement checkSelfPWReset;

    @FindBy(how = How.LINK_TEXT, using = "Edit Company Terminology")
    public WebElement clickEditCompanyTerminology;

    @FindBy(how = How.ID, using = "txtDepartmentTerm")
    public WebElement enterDepartmentTerm;

    @FindBy(how = How.ID, using = "txtDependabilityPointTerm")
    public WebElement enterDependabilityPointTerm;

    @FindBy(how = How.ID, using = "txtDisciplinaryActionTerm")
    public WebElement enterDisciplinaryActionTerm;

    @FindBy(how = How.LINK_TEXT, using = "Edit Quarter Dates")
    public WebElement clickEditQuarterDates;

    @FindBy(how = How.ID, using = "cboQ1Month")
    public WebElement selectQ1Month;

    @FindBy(how = How.ID, using = "cboQ2Month")
    public WebElement selectQ2Month;

    @FindBy(how = How.ID, using = "cboQ3Month")
    public WebElement selectQ3Month;

    @FindBy(how = How.ID, using = "cboQ4Month")
    public WebElement selectQ4Month;

    @FindBy(how = How.ID, using = "btnSave")
    public WebElement btnSave;

    @FindBy(how = How.LINK_TEXT, using = "Edit Seniority Rank Rules")
    public WebElement clickEditSeniorityRankRules;

    @FindBy(how = How.LINK_TEXT, using = "Add New Seniority Rank Rule")
    public WebElement clickNewSeniorityRankRule;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement entertxtName;

    @FindBy(how = How.ID, using = "cboSeniorityRank")
    public WebElement selectcboSeniorityRank;

    @FindBy(how = How.ID, using = "btnDone")
    public WebElement clickBtnDone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tblSeniorityRankRules\"]/tbody/tr[1]/td[4]/a")
    public WebElement clickEditSeniorityRankRule;

    @FindBy(how = How.LINK_TEXT, using = "Edit Break Classifications")
    public WebElement clickEditBreakClassifications;

    @FindBy(how = How.LINK_TEXT, using = "Add New Break Classification")
    public WebElement clickAddNewBreakClassification;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement enterBreakClassificationName;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement enterBreakClassificationDescp;

    @FindBy(how = How.ID, using = "ucLocationPicker_lstLocations_0")
    public WebElement selectLocationPicker1;

    @FindBy(how = How.ID, using = "ucLocationPicker_lstLocations_2")
    public WebElement selectLocationPicker2;

    @FindBy(how = How.ID, using = "ucLocationPicker_lstLocations_4")
    public WebElement selectLocationPicker3;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tblBreakClassifications\"]/tbody/tr[1]/td[4]/a")
    public WebElement clickBreakClassifications;

    @FindBy(how = How.LINK_TEXT, using = "Edit Default Break Settings")
    public WebElement clickEditDefaultBreakSettings;

    @FindBy(how = How.ID, using = "txtBreakAfterHours")
    public WebElement enterBreakAfterHours;

    @FindBy(how = How.ID, using = "txtBreakLength")
    public WebElement txtBreakLength;




    public void clickSettingsTabLinkText() {
        clickCostCentersLinkText.click();
    }

    public void clickEditEmployeeProfileSettings() {
        clickEmployeeProfileSettings.click();
    }

    public void clickOnCheckboxes() {
        clickCheckbox1.click();
        clickCheckbox2.click();
        clickCheckbox3.click();
        clickCheckbox4.click();
        clickCheckbox5.click();
        clickCheckbox6.click();
        clickCheckbox7.click();
    }

    public void clickUpdateButton() {
        clickDoneButton.click();
        Web_Driver.switchTo().alert().accept();
    }

    public void clickEditAbsentReasonsLinkText() {
        clickEditAbsentReasons.click();
    }

    public void clickCreateNewAbsentReason() {
        clickNewAbsentReason.click();
    }

    public void enterCode() {
        enterCode.clear();
        enterCode.sendKeys(helper.randomString(3));
    }

    public void enterDescription() {
        enterDescription.clear();
        enterDescription.sendKeys(helper.generateDepartments());
    }

    public void clickAddButton() {
        btnAddEdit.click();
    }

    public void enterDisplayOrder(String enterOrder) {
        enterDisplayOrder.clear();
        enterDisplayOrder.sendKeys(enterOrder);
    }

    public void clickCancelButton() {
        btnCancel.click();
    }

    public void clickEditLinkText() {
        clickEdit.click();
    }

    public void clickEditPaidTimeOffReasons() {
        clickEditPaidTimeOffReasons.click();
    }

    public void clickNewPaidTimeOffReason() {
        clickCreateNewPaidTimeOffReasons.click();
    }

    public void clickEditPaidTimeOffLinkText() {
        clickEditPaidTimeOff.click();
    }

    public void clickEditOvertimeReasons() {
        clickEditOvertimeReasonsReasons.click();
    }

    public void clickNewOvertimeReason() {
        clickCreateOvertimeReasons.click();
    }

    public void clickEditOvertimeReasonLinkText() {
        clickEditOvertimeReason.click();
    }

    public void clickEditUnauthorizedHoursReasons() {
        clickEditUnauthorizedHoursReasons.click();
    }

    public void clickNewUnauthorizedHoursReason() {
        clickCreateUnauthorizedHoursReason.click();
    }

    public void clickEditUnauthorizedHours() {
        clickUnauthorizedHours.click();
    }

    public void clickEditPasswordPolicy() {
        clickEditPasswordPolicy.click();
    }

    public void checkCheckboxes() {
        checkInitialPW.click();
        checkSelfPWReset.click();
    }

    public void clickButtonUpdate() {
        clickDoneButton.click();
    }

    public void clickEditCompanyTerminology() {
        clickEditCompanyTerminology.click();
    }

    public void enterDepartment(String department) {
        enterDepartmentTerm.clear();
        enterDepartmentTerm.sendKeys(department);
    }

    public void enterDependability(String dependability) {
        enterDependabilityPointTerm.clear();
        enterDependabilityPointTerm.sendKeys(dependability);
    }

    public void enterDisciplinary(String disciplinary) {
        enterDisciplinaryActionTerm.clear();
        enterDisciplinaryActionTerm.sendKeys(disciplinary);
    }

    public void clickEditQuarterDates() {
        clickEditQuarterDates.click();
    }

    public void selectDropdownToEditQuarterStartDates() {
        selectQ1Month.click();
        Select select1 = new Select(selectQ1Month);
        select1.selectByIndex(0);

        selectQ2Month.click();
        Select select2 = new Select(selectQ2Month);
        select2.selectByIndex(3);

        selectQ3Month.click();
        Select select3 = new Select(selectQ3Month);
        select3.selectByIndex(6);

        selectQ4Month.click();
        Select select4 = new Select(selectQ4Month);
        select4.selectByIndex(9);
    }

    public void clickSaveButton() {
        btnSave.click();
    }

    public void clickEditSeniorityRank() {
        clickEditSeniorityRankRules.click();
    }

    public void clickAddNewSeniorityRankRule() {
        clickNewSeniorityRankRule.click();
    }

    public void enterSeniorityRuleName(String companyHireDate) {
        entertxtName.clear();
        entertxtName.sendKeys(companyHireDate);
    }

    public void selectMainSeniorityRank() {
        Select select = new Select(selectcboSeniorityRank);
        select.selectByIndex(0);

    }

    public void clickButtonDone() {
        clickBtnDone.click();
    }

    public void clickEditSeniorityRankRule() {
        clickEditSeniorityRankRule.click();
    }

    public void clickEditBreakClassifications() {
        clickEditBreakClassifications.click();
    }

    public void clickAddNewBreakClassification() {
        clickAddNewBreakClassification.click();
    }

    public void enterBreakClassificationName(String breakClassificationName) {
        enterBreakClassificationName.clear();
        enterBreakClassificationName.sendKeys(breakClassificationName);
    }

    public void enterBreakClassificationDescription(String breakClassificationDescription) {
        enterBreakClassificationDescp.clear();
        enterBreakClassificationDescp.sendKeys(breakClassificationDescription);
    }

    public void selectLocationsForBreakClassification() {
        selectLocationPicker1.click();
        selectLocationPicker2.click();
        selectLocationPicker3.click();
    }

    public void clickEditBreakClassification() {
        clickBreakClassifications.click();
    }

    public void clickEditDefaultBreakSettings() {
        clickEditDefaultBreakSettings.click();
    }

    public void enterShiftHours(String shiftHours) {
        enterBreakAfterHours.clear();
        enterBreakAfterHours.sendKeys(shiftHours);
    }

    public void enter(String breakLength) {
        txtBreakLength.clear();
        txtBreakLength.sendKeys(breakLength);
    }
}
