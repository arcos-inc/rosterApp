package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RuleSetsPage_UTORuleSet {
    public RuleSetsPage_UTORuleSet(WebDriver driver) {
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

    public void enteringUTORuleSetName(String UTORuleSetName) {
        txtName.clear();
        txtName.sendKeys(UTORuleSetName);
    }

    public void enteringMinHoursBeforeShiftStartUTORequest(String beforeShiftStart) {
        txtMinHoursBeforeVtoRequest.clear();
        txtMinHoursBeforeVtoRequest.sendKeys(beforeShiftStart);
    }

    public void enteringMaxHoursBeforeUTORequest(String beforeUTORequest) {
        txtMaxHoursBeforeVtoRequest.clear();
        txtMaxHoursBeforeVtoRequest.sendKeys(beforeUTORequest);
    }

    public void enteringMaxOccurrencesWindow(String maxOccurrencesInWindow){
        txtMaxOccurancesInWindow.clear();
        txtMaxOccurancesInWindow.sendKeys(maxOccurrencesInWindow);
    }

    public void enteringWindowOccurrencesDays(String occurrencesDays) {
        txtWindowForMaxOccurances.clear();
        txtWindowForMaxOccurances.sendKeys(occurrencesDays);
    }

    public void checkedCountSameDayOccurrencesOne() {
        chkSameDayOccurancesCountAsOne.click();
    }

    public void clickingAddButton() {
        btnAddEdit.click();
    }
}
