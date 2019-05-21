package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RuleSetsPage_VTOSlotRuleSet {
    public RuleSetsPage_VTOSlotRuleSet(WebDriver driver) {
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

    public void enteringVTOSlotRuleSetName(String VTOSlotName) {
        txtName.clear();
        txtName.sendKeys(VTOSlotName);
    }

    public void checkedCanClaimVTOSlot() {
        chkCanClaimVtoSlot.click();
    }

    public void checkedSupervisorCanOverrideRules() {
        chkSupervisorOverride.click();
    }
}
