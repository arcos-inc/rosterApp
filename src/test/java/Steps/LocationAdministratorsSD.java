package Steps;

import Base.BaseUtil;
import Pages.LocationAdministratorsPage;
import Pages.LocationPageEdit;
import Utilities.RDTLocationsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class LocationAdministratorsSD {

    //region Location Administrators
    private BaseUtil base;
    LocationAdministratorsPage page;
    RDTLocationsTab RDT;

    public LocationAdministratorsSD(BaseUtil base) {
        page = new LocationAdministratorsPage(base.Web_Driver);
        RDT = new RDTLocationsTab();
        this.base = base;
    }

    //endregion

    //region Add Administrator to this Location

    @Given("^User should be on Location Administrator page$")
    public void userShouldBeOnLocationAdministratorPage() throws Throwable {
        System.out.println("User Should Click on Administrators Link");
        WebElement locationAdministratorLink = RDT.getLocationTabAdministratorsLink(base.Web_Driver);
        if (locationAdministratorLink != null) {
            locationAdministratorLink.click();
        }
    }

    @When("^User click on Add Administrator to this Location$")
    public void userClickOnAddAdministratorToThisLocation() {
        System.out.println("User click on Add Administrator to this Location");
        page.clickAddAdministrator();
    }

    @Then("^Find New Location Administrator search box will appear$")
    public void findNewLocationAdministratorSearchBoxWillAppear() {
        System.out.println("Find New Location Administrator search box will appear");
        page.getAdministratorSearchBox();
    }

    @And("^User should enter the Registered Administrator name$")
    public void userShouldEnterTheRegisteredAdministratorName() throws Throwable {
        System.out.println("User Should Enter the Registered Administrator Name");
        page.enterAdministratorName(RDT.generateRandomCharacter(base.Web_Driver));
        //page.enterAdministratorName('x');
    }

    @And("^User should press the search button$")
    public void userShouldPressTheSearchButton() {
        System.out.println("User Should Press the Search Button");
        page.clickSearchButton();
    }

    @Then("^List of Registered Administrators will display$")
    public void listOfRegisteredAdministratorsWillDisplay() throws Throwable {
System.out.println("List of Registered Administrators will display");
        while (page.sizeAdministratorList() == 1) {
            System.out.println("Administrator List is Empty");
            page.enterAdministratorName(RDT.generateRandomCharacter(base.Web_Driver));
            page.clickSearchButton();
        }
    }

    @And("^User should select the Administrator$")
    public void userShouldSelectTheAdministrator() {
        System.out.println("User Should Select the Administrator");
        page.selectAdministrator();
    }

    @And("^User should press the Create Button$")
    public void userShouldPressTheCreateButton() {
        System.out.println("User Should Press the Create Button");
        page.clickOnCreateButton();
    }

    //endregion

    //region Add Administrator to Multiple Locations

    @When("^User click on Add Administrator to Multiple Locations$")
    public void userClickOnAddAdministratorToMultipleLocations() {
        System.out.println("User click on Add Administrator to Multiple Locations");
        page.clickOnAddMultipleLocation();
    }

    @When("^User press Next Button$")
    public void userShouldPressNextButton() {
        System.out.println("User press Next Button");
        page.clickOnNextButton();
    }

    @Then("^User should select multiple Locations$")
    public void userShouldSelectMultipleLocations() throws Throwable{
        System.out.println("User Should Click on Add Administrator to Multiple Locations");
        WebElement multipleLocation = RDT.getAllLocationCheckbox(base.Web_Driver);
        if (multipleLocation != null) {
            System.out.println("User Select: " + multipleLocation.getText());
            multipleLocation.click();
        }
    }

    @Then("^User should press the cancel button to redirect on Location Tab$")
    public void userShouldPressTheCancelButtonToRedirectOnLocationTab() {
        System.out.println("User should press the cancel button to redirect on Location Tab");
        page.clickCancelButton();
    }
    //endregion
}
