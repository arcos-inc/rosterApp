package Pages;

import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RuleSetsPage_VTOSlotRuleSet {

    Helper help;

    public RuleSetsPage_VTOSlotRuleSet(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "lnkNewVt2RuleSet")
    public WebElement lnkNewVt2RuleSet;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement lblPageHeading;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement txtName;

    @FindBy(how = How.ID, using = "chkCanClaimVtoSlot")
    public WebElement chkCanClaimVtoSlot;

    @FindBy(how = How.ID, using = "chkSupervisorOverride")
    public WebElement chkSupervisorOverride;

    public void clickCreateNewVTOSlotRuleSet() {
        lnkNewVt2RuleSet.click();
    }

    public void enteringVTOSlotRuleSetName(String VTOSlotName) throws Exception {
        txtName.clear();
        txtName.sendKeys(VTOSlotName);
        help.waitForAWhile(txtName.toString());
    }

    public void checkedCanClaimVTOSlot() {
        chkCanClaimVtoSlot.click();
    }

    public void checkedSupervisorCanOverrideRules() {
        chkSupervisorOverride.click();
    }
}
