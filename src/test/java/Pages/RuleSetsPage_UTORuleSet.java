package Pages;

import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RuleSetsPage_UTORuleSet {

    Helper help;

    public RuleSetsPage_UTORuleSet(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "lnkNewVtoRuleSet")
    public WebElement lnkNewVtoRuleSet;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement lbNewUTORuleSet;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement txtName;

    @FindBy(how = How.ID, using = "txtMinHoursBeforeVtoRequest")
    public WebElement txtMinHoursBeforeVtoRequest;

    @FindBy(how = How.ID, using = "txtMaxHoursBeforeVtoRequest")
    public WebElement txtMaxHoursBeforeVtoRequest;

    @FindBy(how = How.ID, using = "txtMaxOccurancesInWindow")
    public WebElement txtMaxOccurancesInWindow;

    @FindBy(how = How.ID, using = "txtWindowForMaxOccurances")
    public WebElement txtWindowForMaxOccurances;

    @FindBy(how = How.ID, using = "chkSameDayOccurancesCountAsOne")
    public WebElement chkSameDayOccurancesCountAsOne;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnAddEdit;

    public void clickCreateNewUTORuleSet() {
        lnkNewVtoRuleSet.click();
    }

    public void enteringUTORuleSetName(String UTORuleSetName) throws Exception {
        //help.waitForAWhile(txtName.toString());
        txtName.clear();
        txtName.sendKeys(UTORuleSetName);
    }

    public void enteringMinHoursBeforeShiftStartUTORequest(String beforeShiftStart) throws Exception {
        txtMinHoursBeforeVtoRequest.clear();
        txtMinHoursBeforeVtoRequest.sendKeys(beforeShiftStart);
        //help.waitForAWhile(txtMinHoursBeforeVtoRequest.toString());
    }

    public void enteringMaxHoursBeforeUTORequest(String beforeUTORequest) throws Exception {
        txtMaxHoursBeforeVtoRequest.clear();
        txtMaxHoursBeforeVtoRequest.sendKeys(beforeUTORequest);
        //help.waitForAWhile(txtMaxHoursBeforeVtoRequest.toString());
    }

    public void enteringMaxOccurrencesWindow(String maxOccurrencesInWindow) throws Exception {
        txtMaxOccurancesInWindow.clear();
        txtMaxOccurancesInWindow.sendKeys(maxOccurrencesInWindow);
        //help.waitForAWhile(txtMaxOccurancesInWindow.toString());
    }

    public void enteringWindowOccurrencesDays(String occurrencesDays) throws Exception {
        txtWindowForMaxOccurances.clear();
        txtWindowForMaxOccurances.sendKeys(occurrencesDays);
        //help.waitForAWhile(txtWindowForMaxOccurances.toString());
    }

    public void checkedCountSameDayOccurrencesOne() {
        chkSameDayOccurancesCountAsOne.click();
    }

    public void clickingAddButton() {
        btnAddEdit.click();
    }
}
