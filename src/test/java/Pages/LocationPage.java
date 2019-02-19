package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LocationPage {
    public LocationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "ucPageHeader_ucRoleSwitcher_cboRole")
    //@CacheLookup
    public WebElement dropDownActingAs;

    @FindBy(how = How.ID, using = "lnkNew")
    public WebElement lnkCreateLocation;

    @FindBy(how = How.ID, using = "txtName")
    public WebElement txtName;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement txtDescription;

    @FindBy(how = How.ID, using = "cboTimeZone")
    public WebElement dropDownTimeZone;

    @FindBy(how = How.ID, using = "cboFirstDow")
    public WebElement dropDownFirstDayWeek;

    @FindBy(how = How.ID, using = "chkDisplayBid")
    public WebElement chkDisplayBid;

    @FindBy(how = How.ID, using = "chkDisplaySchedule")
    public WebElement chkDisplaySchedule;

    @FindBy(how = How.ID, using = "chkDisplayShiftLeveling")
    public WebElement chkDisplayShiftLeveling;

    @FindBy(how = How.ID, using = "chkDisplayAlternateScheduleBidding")
    public WebElement chkDisplayAlternateScheduleBidding;

    @FindBy(how = How.ID, using = "chkEditMultipleShifts")
    public WebElement chkEditMultipleShifts;

    @FindBy(how = How.ID, using = "cboNewEmployeeStatus")
    public WebElement dropDownNewEmployeeStatus;

    @FindBy(how = How.ID, using = "cboNewEmployeeJobTitle")
    public WebElement dropDownNewEmployeeJobTitle;

    @FindBy(how = How.ID, using = "btnAddEdit")
    public WebElement btnAddLocation;

    public void GetLocationURL(WebDriver driver) {
        //String locationLabel = getLocationLabel.getText().toLowerCase();
        String url = driver.getCurrentUrl();

        //System.out.println("You got this value: " + locationLabel);

        if (url.contains("Supervisor")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        } else if (url.contains("ScheduleView")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        } else if (url.contains("HumanResources")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        } else if (url.contains("Admin")) {
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
    }

    public void CreateNewLocation() {
        lnkCreateLocation.click();
    }

    public void enterLocationName(String locationName) {
        txtName.sendKeys(locationName);
    }

    public void enterLocationDescription(String locationDescription) {
        txtDescription.sendKeys(locationDescription);
    }

    public void selectLocationTimeZone() {
        Select timeZone = new Select(dropDownTimeZone);
        timeZone.selectByIndex(1);
    }

    public void selectFirstDayWeek() {
        Select firstDayWeek = new Select(dropDownFirstDayWeek);
        firstDayWeek.selectByIndex(1);
    }

    public void checkDisplaySchedule() {
        chkDisplaySchedule.click();
    }

    public void checkDisplayShiftLeveling() {
        chkDisplayShiftLeveling.click();
    }

    public void checkDisplayAlternateScheduleBidding() {
        chkDisplayAlternateScheduleBidding.click();
    }

    public void checkEditMultipleShifts() {
        chkEditMultipleShifts.click();
    }

    public void selectNewEmployeeStatus() {
        Select employeeStatus = new Select(dropDownNewEmployeeStatus);
        employeeStatus.selectByIndex(8);
    }

    public void selectNewEmployeeJobTitle() {
        Select employeeJobTitle = new Select(dropDownNewEmployeeJobTitle);
        employeeJobTitle.selectByIndex(4);
    }

    public void clickAddLocationButton() {
        btnAddLocation.click();
    }
}
