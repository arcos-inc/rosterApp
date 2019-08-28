package Pages;

import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkGroupPage {

    Helper help;

    public WorkGroupPage(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "WORK GROUPS")
    public WebElement navigateWorkGroup;

    @FindBy(how = How.ID, using = "lnkNew")
    public WebElement createNewWorkGroup;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement txtName;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement txtDescription;

    @FindBy(how = How.ID, using = "cboSeniorityRule")
    public WebElement cboSeniorityRule;

    @FindBy(how = How.ID, using = "cboShiftRuleSet")
    public WebElement cboShiftRuleSet;

    @FindBy(how = How.ID, using = "cboPtoRuleSet")
    public WebElement cboPtoRuleSet;

    @FindBy(how = How.ID, using = "cboVtoRuleSet")
    public WebElement cboVtoRuleSet;

    @FindBy(how = How.ID, using = "cboVt2RuleSet")
    public WebElement cboVt2RuleSet;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnAddEdit;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdWorkgroups\"]/tbody/tr[16]/td[5]/a")
    public WebElement btnEdit;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnUpdate;

    @FindBy(how = How.ID, using = "btnCancel")
    public WebElement btnCancel;

    @FindBy(how = How.ID, using = "chkHideInactive")
    public WebElement chkHideInactive;

    public void clickWorkGroupTab() {
        navigateWorkGroup.click();
    }

    public void clickCreateNewWorkGroup() {
        createNewWorkGroup.click();
    }

    public void enterWorkGroupName(String workGroupName) throws Exception {
        //help.waitForAWhile(txtName.toString());
        txtName.clear();
        txtName.sendKeys(workGroupName);
    }

    public void enterWorkGroupDescription(String groupDescription) throws Exception {
        txtDescription.clear();
        txtDescription.sendKeys(groupDescription);
        //help.waitForAWhile(txtDescription.toString());
    }

    public void clickSeniorityRule() {
        cboSeniorityRule.click();
    }

    public void selectSeniorityRule() throws Exception {
        Select sr = new Select(cboSeniorityRule);
        sr.selectByVisibleText("Company Hire Date");
        //help.waitForAWhile(cboSeniorityRule.toString());
    }

    public void clickShiftRuleSet() {
        cboShiftRuleSet.click();
    }

    public void selectShiftRuleSet() throws Exception {
        Select sr = new Select(cboShiftRuleSet);
        sr.selectByVisibleText("COPS Standard");
        //help.waitForAWhile(cboShiftRuleSet.toString());
    }

    public void clickPTORuleSet() {
        cboPtoRuleSet.click();
    }

    public void selectPTORuleSet() throws Exception {
        Select sr = new Select(cboPtoRuleSet);
        sr.selectByVisibleText("AMFA Standard");
        //help.waitForAWhile(cboPtoRuleSet.toString());
    }

    public void clickUTORuleSet() {
        cboVtoRuleSet.click();
    }

    public void selectUTORuleSet() throws Exception {
        Select sr = new Select(cboVtoRuleSet);
        sr.selectByVisibleText("SAS Std UTO Rules 14");
        //help.waitForAWhile(cboVtoRuleSet.toString());
    }

    public void clickVTOSlotRuleSet() {
        cboVt2RuleSet.click();
    }

    public void selectVTOSlotRuleSet() throws Exception {
        Select sr = new Select(cboVt2RuleSet);
        sr.selectByVisibleText("SAS Std VTO Slot Rules 14");
        //help.waitForAWhile(cboVt2RuleSet.toString());
    }

    public void clickAddButton() {
        btnAddEdit.click();
    }

    public void clickEditLinkText() {
        btnEdit.click();
    }

    public void clickUpdateBtn() {
        btnUpdate.click();
    }

    public void clickCancelBtn() {
        btnCancel.click();
    }

    public void checkHideInactiveBtn() {
        chkHideInactive.click();
    }
}
