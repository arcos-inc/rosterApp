package Pages;

import Base.BaseUtil;
import Utilities.Helper;
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
    public WebElement optionMonth;

    @FindBy(how = How.ID, using = "chkFreezePoints")
    public WebElement freezePoints;

    @FindBy(how = How.ID, using = "btnSave")
    public WebElement saveBtn;

    public void clickNewDependabilityRuleSets() {
        clickNewDependability.click();
    }

    public void enterDependabilityRuleSetName(String ruleSetName) {
        enterRuleSetName.sendKeys(ruleSetName);
    }

    public void enterDependabilityRuleSetDescription(String ruleSetDesc) {
        enterRuleSetDesc.sendKeys(ruleSetDesc);
    }

    public void checkExpirePoints() {
        expirePoints.click();
    }

    public void enterThePointsValid(String points) {
        PointsValid.sendKeys(points);
    }

    public void selectMonth() {
        Select select = new Select(optionMonth);
        select.selectByIndex(2);

    }

    public void checkFreezePoints() {
        freezePoints.click();

    }

    public void saveBtn() {
        saveBtn.click();
    }
}


