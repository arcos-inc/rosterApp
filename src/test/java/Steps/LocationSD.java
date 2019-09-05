package Steps;

import Base.BaseUtil;
import Pages.LocationPage;
import Utilities.Helper;
import Utilities.ReadDynamicTables;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocationSD extends BaseUtil {

    private BaseUtil base;
    LocationPage page;
    Helper helper;

    public LocationSD(BaseUtil base) {
        page = new LocationPage(Web_Driver);
        this.base = base;
        helper = new Helper();
    }

    @Given("^User Should select Acting roles$")
    public void userShouldSelectActingRoles() throws Throwable {
        page.GetLocationURL();
        Web_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^User see the Location Tab$")
    public void userSeeTheLocationTab() throws Throwable {
        System.out.println("Check Add Location Tab");
        Thread.sleep(1000);
    }

    @Then("^User should click on Create New Location$")
    public void userShouldClickOnCreateNewLocation() throws Throwable {
        System.out.println("Clicking on Create New Location");
        page.CreateNewLocation();
        Thread.sleep(1000);
    }

    @When("^User gets the New Location Label$")
    public void userGetsTheNewLocationLabel() throws Throwable {
        System.out.println("User got the New Location Form");
        Thread.sleep(1000);
    }

    @Then("^User enter the Name$")
    public void userEnterTheName() throws Throwable {
        System.out.println("User can enter Location Name");
        page.enterLocationName(helper.generateDepartments());
        Thread.sleep(1000);
    }

    @And("^User enters \"([^\"]*)\" Description$")
    public void userEntersDescription(String locationDescription) throws Throwable {
        System.out.println("User can enter Location Name");
        page.enterLocationDescription(locationDescription);
        Thread.sleep(1000);
    }

    @And("^User select Time Zone$")
    public void userSelectTimeZone() throws Throwable {
        System.out.println("User Select Time Zone");
        page.selectLocationTimeZone();
        Thread.sleep(1000);
    }

    @And("^User select First day of Week$")
    public void userSelectFirstDayOfWeek() throws Throwable {
        System.out.println("User select First Day of Week");
        page.selectFirstDayWeek();
        Thread.sleep(1000);
    }

    @And("^User mark/unmark check on Display Bid Packages$")
    public void userMarkUnmarkCheckOnDisplayBidPackages() throws Throwable {
        System.out.println("User mark and unmark Bid Package visibility");
        Thread.sleep(1000);
    }

    @And("^User mark check on Display Schedule Builder$")
    public void userMarkCheckOnDisplayScheduleBuilder() throws Throwable {
        System.out.println("User Mark Display Schedule");
        page.checkDisplaySchedule();
        Thread.sleep(1000);
    }

    @And("^User mark check on Display Shift Leveling$")
    public void userMarkCheckOnDisplayShiftLeveling() throws Throwable {
        System.out.println("User Mark Display Shift");
        page.checkDisplayShiftLeveling();
        Thread.sleep(1000);
    }

    @And("^User mark check on Display Alternate Schedule Bidding$")
    public void userMarkCheckOnDisplayAlternateScheduleBidding() throws Throwable {
        System.out.println("User Mark Alternate Schedule Bidding");
        page.checkDisplayAlternateScheduleBidding();
        Thread.sleep(1000);
    }

    @And("^User mark check on Allow Multiple Shift Edit$")
    public void userMarkCheckOnAllowMultipleShiftEdit() throws Throwable {
        System.out.println("User Mark Allow Multiple Shift");
        page.checkEditMultipleShifts();
        Thread.sleep(1000);
    }

    @And("^User select New Employee Work Group$")
    public void userSelectNewEmployeeWorkGroup() throws Throwable {
        System.out.println("User Select New Employee Work Group");
        Thread.sleep(1000);
    }

    @And("^User select New Employee Status Code$")
    public void userSelectNewEmployeeStatusCode() throws Throwable {
        System.out.println("User Select New Employee Status Code");
        page.selectNewEmployeeStatus();
        Thread.sleep(1000);
    }

    @And("^User select New Employee Job Title$")
    public void userSelectNewEmployeeJobTitle() throws Throwable {
        System.out.println("User Select New Employee Job Title");
        page.selectNewEmployeeJobTitle();
        Thread.sleep(1000);
    }

    @And("^User click on Add Button$")
    public void userClickOnAddButton() throws Throwable {
        System.out.println("Clicking on Add Location Button");
        page.clickAddLocationButton();
        Thread.sleep(1000);
    }
}
