package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage extends BaseUtil {

    Helper help;

    public DepartmentPage(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "DEPARTMENTS")
    public WebElement clickDepartmentsTab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divDepartments\"]/div[1]/a")
    public WebElement clickCreateNewDepartmentLink;

    @FindBy(how = How.ID, using = "txtDepartmentName")
    public WebElement enterDeptName;

    @FindBy(how = How.ID, using = "txtDepartmentDesc")
    public WebElement enterDeptDescription;

    @FindBy(how = How.ID, using = "chkAllowedForTransferBidding")
    public WebElement clickAllowedForTransferBidding;

    @FindBy(how = How.ID, using = "chkIsActive")
    public WebElement clickIsActive;

    @FindBy(how = How.ID, using = "btnUpdate")
    public WebElement saveBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tblDepartments\"]/tbody/tr[1]/td[5]/a")
    public WebElement editLinkText;

    public void clickOnDepartmentsTab() {
        clickDepartmentsTab.click();
    }

    public void createNewDepartment() {
        clickCreateNewDepartmentLink.click();
    }

    public void enterDepartmentName(String deptName) {
        enterDeptName.clear();
        enterDeptName.sendKeys(deptName);
    }

    public void enterDepartmentDescription(String deptDescription) {
        enterDeptDescription.clear();
        enterDeptDescription.sendKeys(deptDescription);
    }

    public void clickAllowedForTransferBiddingCheckbox() {
        clickAllowedForTransferBidding.click();
    }

    public void clickIsActiveCheckbox() {
        clickIsActive.click();
    }

    public void clickSaveButton() {
        saveBtn.click();
    }

    public void clickEditLinkText() {
        editLinkText.click();
    }
}
