package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeePage {

    Helper help;

    public EmployeePage(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "ucPageHeader_ucRoleSwitcher_cboRole")
    //@CacheLookup
    public WebElement dropDownActingAs;

    @FindBy(how = How.LINK_TEXT, using = "EMPLOYEES")
    public WebElement employeeTab;

    @FindBy(how = How.ID, using = "cboWorkGroup")
    public WebElement cboWorkGroup;

    @FindBy(how = How.LINK_TEXT, using = "Create Employee")
    public WebElement createEmployee;

    @FindBy(how = How.ID, using = "ucProfile_txtFirstName")
    public WebElement ucProfile_txtFirstName;

    @FindBy(how = How.ID, using = "ucProfile_txtLastName")
    public WebElement ucProfile_txtLastName;

    @FindBy(how = How.ID, using = "ucProfile_txtUserName")
    public WebElement ucProfile_txtUserName;

    @FindBy(how = How.ID, using = "ucProfile_txtPassword")
    public WebElement ucProfile_txtPassword;

    @FindBy(how = How.ID, using = "ucProfile_txtEmailAddress")
    public WebElement ucProfile_txtEmailAddress;

    @FindBy(how = How.ID, using = "ucProfile_txtEmployeeNumber")
    public WebElement ucProfile_txtEmployeeNumber;

    @FindBy(how = How.ID, using = "ucProfile_ddlCarrierID")
    public WebElement ucProfile_ddlCarrierID;

    @FindBy(how = How.ID, using = "ucProfile_dpCompanyHireDate")
    public WebElement ucProfile_dpCompanyHireDate;

    @FindBy(how = How.LINK_TEXT, using = "Today")
    public WebElement Today;

    @FindBy(how = How.ID, using = "ucSkillsPicker_lstSkills_5")
    public WebElement ucSkillsPicker_lstSkills_5;

    @FindBy(how = How.ID, using = "ucSkillsPicker_lstSkills_6")
    public WebElement ucSkillsPicker_lstSkills_6;

    @FindBy(how = How.ID, using = "ucSkillsPicker_lstSkills_7")
    public WebElement ucSkillsPicker_lstSkills_7;

    @FindBy(how = How.ID, using = "cboWorkgroup")
    public WebElement cboWorkgroup;

    @FindBy(how = How.ID, using = "cboTitle")
    public WebElement cboTitle;

    @FindBy(how = How.ID, using = "cboShiftRS")
    public WebElement cboShiftRS;

    @FindBy(how = How.ID, using = "cboPtoRS")
    public WebElement cboPtoRS;

    @FindBy(how = How.ID, using = "cboVtoRS")
    public WebElement cboVtoRS;

    @FindBy(how = How.ID, using = "cboVt2RS")
    public WebElement cboVt2RS;

    @FindBy(how = How.ID, using = "ucTradeGroups_cboLoc")
    public WebElement ucTradeGroups_cboLoc;

    @FindBy(how = How.ID, using = "lstSource")
    public WebElement lstSource;

    @FindBy(how = How.NAME, using = "btnAdd")
    public WebElement btnAdd;

    @FindBy(how = How.ID, using = "txtNotes")
    public WebElement txtNotes;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement btnSubmit;

    public void GetLocationURL() throws Exception {
        //String locationLabel = getLocationLabel.getText().toLowerCase();
        String url = BaseUtil.Web_Driver.getCurrentUrl();

        //System.out.println("You got this value: " + locationLabel);

        if (url.contains("Supervisor")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(3);
        } else if (url.contains("Company")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(3);
        } else if (url.contains("HumanResources")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(3);
        } else if (url.contains("ScheduleView")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(3);
        } else if (url.contains("Admin")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(3);
        }
        help.waitForAWhile(dropDownActingAs.toString());
    }

    public void clickEmployeeTab() {
        employeeTab.click();
    }

    public void clickWorkGroupDropDown() {
        cboWorkGroup.click();
    }

    public void selectWorkGroup() {
        Select sr = new Select(cboWorkGroup);
        sr.selectByVisibleText("SAS001");
    }

    public void clickCreateEmployee() {
        createEmployee.click();
    }

    public void enterEmployeeFirstName(String empFirstName) throws Exception {
        help.waitForAWhile(ucProfile_txtFirstName.toString());
        ucProfile_txtFirstName.sendKeys(empFirstName);
    }

    public void enterEmployeeLastName(String empLastName) throws Exception {
        ucProfile_txtLastName.sendKeys(empLastName);
        //help.waitForAWhile(ucProfile_txtLastName.toString());
    }

    public void enterEmployeeUserName(String userName) throws Exception {
        ucProfile_txtUserName.sendKeys(userName);
        //help.waitForAWhile(ucProfile_txtUserName.toString());
    }

    public void enterEmployeePassword(String password) throws Exception {
        ucProfile_txtPassword.sendKeys(password);
        //help.waitForAWhile(ucProfile_txtPassword.toString());
    }

    public void enterEmployeeEmailAddress(String email) throws Exception {
        ucProfile_txtEmailAddress.sendKeys(email);
        //help.waitForAWhile(ucProfile_txtEmailAddress.toString());
    }

    public void enterEmployeeNumber(String empNum) throws Exception {
        ucProfile_txtEmployeeNumber.sendKeys(empNum);
        help.waitForAWhile(ucProfile_txtEmployeeNumber.toString());
    }

    public void clickEmployeePhoneCarrier() {
        ucProfile_ddlCarrierID.click();
    }

    public void selectEmployeePhoneCarrier() {
        Select sr = new Select(ucProfile_ddlCarrierID);
        sr.selectByVisibleText("Alltel");
    }

    public void clickEmployeeHairDate() {
        ucProfile_dpCompanyHireDate.click();
    }

    public void selectEmployeeHairDate() {
        Today.click();
    }

    public void selectEmployeeSkill() {
        ucSkillsPicker_lstSkills_5.click();
        ucSkillsPicker_lstSkills_6.click();
        ucSkillsPicker_lstSkills_7.click();
    }

    public void clickEmployeeWorkGroup() {
        cboWorkgroup.click();
    }

    public void selectEmployeeWorkGroup() {
        Select sr = new Select(cboWorkgroup);
        sr.selectByVisibleText("SAS001");
    }

    public void clickEmployeeJobTitle() {
        cboTitle.click();
    }

    public void selectEmployeeJobTitle() {
        Select sr = new Select(cboTitle);
        sr.selectByVisibleText("Agent");
    }

    public void clickShiftRuleSet() {
        cboShiftRS.click();
    }

    public void selectShiftRuleSet() {
        Select sr = new Select(cboShiftRS);
        sr.selectByVisibleText("SASTest001");
    }

    public void clickPTORuleSet() {
        cboPtoRS.click();
    }

    public void selectPTORuleSet() {
        Select sr = new Select(cboPtoRS);
        sr.selectByVisibleText("SAS Test Rule Set A");
    }

    public void clickUTORuleSet() {
        cboVtoRS.click();
    }

    public void selectUTORuleSet() {
        Select sr = new Select(cboVtoRS);
        sr.selectByVisibleText("SAS5 Std UTO Rules");
    }

    public void clickVTOSlotRuleSet() {
        cboVt2RS.click();
    }

    public void selectVTOSlotRuleSet() {
        Select sr = new Select(cboVt2RS);
        sr.selectByVisibleText("SAS9 Std VTO Slot Rules");
    }

    public void clickTradeGroup(){
        ucTradeGroups_cboLoc.click();
    }

    public void selectTradeGroup() {
        Select sr = new Select(ucTradeGroups_cboLoc);
        sr.selectByIndex(6);
    }

    public void selectAvailableGroups(){
        Select sr = new Select(lstSource);
        sr.selectByIndex(1);
    }

    public void clickShiftButton() {
        btnAdd.click();
    }

    public void enterEmployeeNotes(String empNotes) throws Exception {
        txtNotes.sendKeys(empNotes);
        help.waitForAWhile(txtNotes.toString());
    }

    public void clickCreateButton() {
        btnSubmit.click();
    }
}
