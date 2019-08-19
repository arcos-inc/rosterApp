package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ScheduleViewerPage extends BaseUtil {
//    lnkNew
    Helper help;

    public ScheduleViewerPage(WebDriver driver) {
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdLocations\"]/tbody/tr[2]/td[6]/a")
    public WebElement clickScheduleViewer;

    @FindBy(how = How.ID, using = "lnkNew")
    public WebElement clickAddScheduleViewerLocation;

    @FindBy(how = How.ID, using = "txtSearch")
    public WebElement enterLastName;

    @FindBy(how = How.ID, using = "btnSearch")
    public WebElement clickSearchBtn;

    @FindBy(how = How.ID, using = "lstEmployees")
    public WebElement selectFromList;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement clickCreateBtn;

    @FindBy(how = How.ID, using = "repItems_ctl01_btnRemove")
    public WebElement removeBtn;

    public void clickOnScheduleViewer() {
        clickScheduleViewer.click();
    }

    public void clickOnTheAddScheduleViewerToThisLocation() {
        clickAddScheduleViewerLocation.click();
    }

    public void findByLastName(String lastname) {
        enterLastName.sendKeys(lastname);
    }

    public void clickOnSearch() {
        clickSearchBtn.click();
    }

    public void selectNameFromList() {
        Select firstName = new Select(selectFromList);
        firstName.selectByIndex(1);
    }

    public void clickOnTheCreateButton() {
        clickCreateBtn.click();
    }

    public void removeScheduleViewer() {
        removeBtn.click();
    }

    public void clickOKButton() {
        Web_Driver.switchTo().alert().accept();
    }
}
