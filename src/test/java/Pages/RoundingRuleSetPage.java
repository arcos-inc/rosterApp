package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoundingRuleSetPage extends BaseUtil {

    Helper help;

    public RoundingRuleSetPage (WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"PostForm\"]/table[1]/tbody/tr[3]/td/ul/li[7]/a")
    public WebElement clickOnRuleSet;

    @FindBy(how = How.ID, using = "lnkNewRoundingRuleSet")
    public WebElement clickCreateNewRoundingRuleSet;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement enterRuleSetName;

    @FindBy(how = How.ID, using = "txtGraceBeforeStart")
    public WebElement enterMinutesBeforeStart;

    @FindBy(how = How.ID, using = "txtGraceAfterStart")
    public WebElement enterMinutesAfterStart;

    @FindBy(how = How.ID, using = "chkRoundEarlyInToSched")
    public WebElement clickRoundAllEarlyInToSchedule;

    @FindBy(how = How.ID, using = "cboRoundEarlyDirection")
    public WebElement selectRoundEarlyDirection;

    @FindBy(how = How.ID, using = "txtRuleSetDescription")
    public WebElement enterRuleSetDesc;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement clickAddBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdRoundingRuleSet\"]/tbody/tr[2]/td[2]/a")
    public WebElement clickEditRoundingRuleSet;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement clickEditBtn;

    public void clickOnRuleSetLink() {
          clickOnRuleSet.click();
    }

    public void clickOnCreateNewRoundingRuleSet() {
        clickCreateNewRoundingRuleSet.click();
    }

    public void enterRuleSetName(String ruleSetname) {
        enterRuleSetName.clear();
        enterRuleSetName.sendKeys(ruleSetname);
    }

    public void enterMinutesBeforeStart(String minutesBeforeStart) {
        enterMinutesBeforeStart.clear();
        enterMinutesBeforeStart.sendKeys(minutesBeforeStart);
    }

    public void enterMinutesAfterStart(String minutesAfterStart) {
        enterMinutesAfterStart.clear();
        enterMinutesAfterStart.sendKeys(minutesAfterStart);
    }

    public void clickOnRoundAllEarlyInToSchedule() {
        clickRoundAllEarlyInToSchedule.click();
    }

    public void selectRoundEarly() {
        Select select = new Select(selectRoundEarlyDirection);
        select.selectByIndex(1);
    }

    public void enterRuleSetDescription(String ruleSetDescription) {
        enterRuleSetDesc.clear();
        enterRuleSetDesc.sendKeys(ruleSetDescription);
    }

    public void clickOnAddButton() {
        clickAddBtn.click();
    }

    public void clickEditRounding() {
        clickEditRoundingRuleSet.click();

    }

    public void clickOnUpdateButton() {
        clickEditBtn.click();
    }
}
