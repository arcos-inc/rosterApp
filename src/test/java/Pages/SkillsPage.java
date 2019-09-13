package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SkillsPage extends BaseUtil {

    Helper help;

    public SkillsPage(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "SKILLS")
    public WebElement clickSkillsTab;

    @FindBy(how = How.ID, using = "lnkNew")
    public WebElement clickCreateNewSkillLink;

    @FindBy(how = How.ID, using = "txtCode")
    public WebElement enterCode;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement enterDescription;

    @FindBy(how = How.ID, using = "txtOutsideCode")
    public WebElement enterPartyCode;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement addBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdSkills\"]/tbody/tr[2]/td[5]/a")
    public WebElement editLinkText;

    @FindBy(how = How.ID, using = "cboFilterActivity")
    public WebElement filterCombo;

    @FindBy(how = How.ID, using = "btnFilter")
    public WebElement filterBtn;


    public void clickOnSkillsTab() {
        clickSkillsTab.click();
    }

    public void createNewSkill() {
        clickCreateNewSkillLink.click();
    }

    public void enterCode(String code) {
        enterCode.clear();
        enterCode.sendKeys(code);
    }

    public void enterDescription(String description) {
        enterDescription.clear();
        enterDescription.sendKeys(description);
    }

    public void enterPartyCode(String partyCode) {
        enterPartyCode.clear();
        enterPartyCode.sendKeys(partyCode);
    }

    public void addBtn() {
        addBtn.click();
    }

    public void clickEditLinkText() {
        editLinkText.click();
    }

    public void activeSkills() {
        filterCombo.click();
        Select lastName = new Select(filterCombo);
        lastName.selectByIndex(1);
    }

    public void inactiveSkills() {
        filterCombo.click();
        Select lastName = new Select(filterCombo);
        lastName.selectByIndex(2);
    }

    public void filterButton() {
        filterBtn.click();
    }
}
