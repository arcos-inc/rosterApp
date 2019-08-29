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

public class SupervisorPage extends BaseUtil {

    Helper help;

    public SupervisorPage(WebDriver driver){
        help = new Helper();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"grdWorkgroups\"]/tbody/tr[2]/td[6]/a")
    public WebElement clickSupervisor;

    @FindBy(how = How.ID, using = "lnkNew")
    public WebElement clickAddSupervisor;

    @FindBy(how = How.ID, using = "txtSearch")
    public WebElement enterLastName;

    @FindBy(how = How.ID, using = "btnSearch")
    public WebElement clickSearchBtn;

    @FindBy(how = How.ID, using = "lstEmployees")
    public WebElement selectFromList;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement clickCreateBtn;

    @FindBy(how = How.ID, using = "repItems_ctl17_btnRemove")
    public WebElement removeBtn;

    @FindBy(how = How.ID, using = "lnkMultipleNew")
    public WebElement clickAddScheduleViewerMultipleLocation;

    @FindBy(how = How.ID, using = "btnNext")
    public WebElement nextBtn;

    @FindBy(how = How.ID, using = "ucGroupPicker_lstGroups_0")
    public WebElement selectMultipleLocation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gridBody\"]/tbody/tr[2]/td[2]/a")
    public WebElement editAssignmentLinkText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gridBody\"]/tbody/tr[2]/td[3]/a")
    public WebElement editProfileLinkText;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement clickUpdateBtn;

    @FindBy(how = How.ID, using = "ucProfile_txtFirstName")
    public WebElement editFirstName;

    public void clickOnSupervisors() {
        clickSupervisor.click();
    }

    public void clickOnTheAddSupervisorToThisLocation() {
        clickAddSupervisor.click();
    }

    public void findByLastName(String lastname) {
        enterLastName.clear();
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

    public void removeSupervisor() {
        removeBtn.click();
    }

    public void clickOKButton() {
        Web_Driver.switchTo().alert().accept();
    }

    public void clickOnTheAddSupervisorToMultipleLocation() {
        clickAddScheduleViewerMultipleLocation.click();
    }

    public void clickNextButton() {
        nextBtn.click();
    }

    public void selectLocationsFromList() {
        selectMultipleLocation.click();
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

    public void editProfile(String editName) {
        editFirstName.clear();
        editFirstName.sendKeys(editName);
        Scroll.scrollDown();
    }

    public void clickOnTheUpdateButton() {
        clickUpdateBtn.click();
    }
}
