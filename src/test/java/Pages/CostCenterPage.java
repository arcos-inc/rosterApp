package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CostCenterPage extends BaseUtil {

    Helper help;

    public CostCenterPage (WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"PostForm\"]/table[1]/tbody/tr[3]/td/ul/li[6]")
    public WebElement clickCostCentersLinkText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divCostCenters\"]/div[1]/a")
    public WebElement clickCreateCostCenters;

    @FindBy(how = How.ID, using = "txtCostCenterName")
    public WebElement enterName;

    @FindBy(how = How.ID, using = "txtCostCenterDescription")
    public WebElement enterDescription;

    @FindBy(how = How.ID, using = "txtCostCenterDisplayOrder")
    public WebElement enterDisplayOrder;

    @FindBy(how = How.ID, using = "chkIsActive")
    public WebElement chkIsActive;

    @FindBy(how = How.ID, using = "btnUpdate")
    public WebElement btnUpdate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tblCostCenters\"]/tbody/tr[1]/td[5]/a")
    public WebElement btnEdit;

    public void clickCostCentersLinkText() {
        clickCostCentersLinkText.click();
    }

    public void clickCreateNewCostCenters() {
        clickCreateCostCenters.click();
    }

    public void enterCostCenterName(String enterCostCenterName) {
        enterName.clear();
        enterName.sendKeys(enterCostCenterName);
    }

    public void enterCostCenterDescription(String enterCostCenterDesc) {
        enterDescription.clear();
        enterDescription.sendKeys(enterCostCenterDesc);
    }

    public void enterDisplayOrder(String enterDispOrder) {
        enterDisplayOrder.clear();
        enterDisplayOrder.sendKeys(enterDispOrder);
    }

    public void checkIsActive() {
        chkIsActive.click();
    }

    public void clickSaveButton() {
        btnUpdate.click();
    }

    public void clickEditButton() {
        btnEdit.click();
    }
}
