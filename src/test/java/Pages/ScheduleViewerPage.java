package Pages;

import Base.BaseUtil;
import Utilities.Helper;
import Utilities.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ScheduleViewerPage extends BaseUtil {

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

    @FindBy(how = How.ID, using = "lnkMultipleNew")
    public WebElement clickAddScheduleViewerMultipleLocation;

    @FindBy(how = How.ID, using = "btnNext")
    public WebElement nextBtn;

    @FindBy(how = How.ID, using = "ucLocationPicker_lstLocations_1")
    public WebElement selectMultipleLocation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gridBody\"]/tbody/tr[2]/td[2]/a")
    public WebElement editAssignmentLinkText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gridBody\"]/tbody/tr[2]/td[3]/a")
    public WebElement editProfileLinkText;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement clickUpdateBtn;

    @FindBy(how = How.ID, using = "btnCancel")
    public WebElement clickCancelBtn;

    @FindBy(how = How.ID, using = "ucProfile_txtFirstName")
    public WebElement editFirstName;

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
        Select lastName = new Select(selectFromList);
        lastName.selectByIndex(1);
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

    public void clickOnTheAddScheduleViewerToMultipleLocation() {
        clickAddScheduleViewerMultipleLocation.click();
    }

    public void clickNextButton() {
        nextBtn.click();
    }

    public void selectLocationsFromList() {
        selectMultipleLocation.click();
//        Select multipleLocations = new Select(selectMultipleLocation);
//        multipleLocations.selectByIndex(1);
    }

    public void editAssignmentLink() {
        editAssignmentLinkText.click();
    }

    public void editSchedule() {
        selectMultipleLocation.click();
    }

    public void editProfileLink() {
        editProfileLinkText.click();
    }

    public void editProfile(String editName) throws InterruptedException {
        editFirstName.clear();
        editFirstName.sendKeys(editName);
        Scroll.scrollDown();
    }

    public void clickOnTheUpdateButton() {
        clickUpdateBtn.click();
    }

    public void clickOnTheCancelButton() {
        clickCancelBtn.click();
    }
}
