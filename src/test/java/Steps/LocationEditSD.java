package Steps;

import Base.BaseUtil;
import Pages.LocationPageEdit;
import Utilities.RDTLocationsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class LocationEditSD extends BaseUtil {

    private BaseUtil base;
    LocationPageEdit page;
    RDTLocationsTab RDT;

    public LocationEditSD(BaseUtil base) {
        page = new LocationPageEdit(base.Web_Driver);
        RDT = new RDTLocationsTab();
        this.base = base;
    }

    @When("^User click on Edit link of an existing location$")
    public void userClickOnEditLinkOfAnExistingLocation() throws Throwable {
        System.out.println("User Should Click on Edit Link");
        WebElement locationEditLink = RDT.getLocationTabEditLink(base.Web_Driver);
        if (locationEditLink != null) {
            locationEditLink.click();
        }
    }

    @Then("^User should see the edit location window$")
    public void userShouldSeeTheEditLocationWindow() throws Throwable {
        System.out.println("User Should See Edit Page");
        page.getEditLocationLabel();
    }

    @And("^User should edit details and rules$")
    public void userShouldEditDetailsAndRules() throws Throwable {
        System.out.println("User Should Edit details and rules");
        page.changeSelection();
    }

    @And("^User should click on Add button$")
    public void userShouldClickOnAddButton() throws Throwable {
        System.out.println("User Should Click on Update Button");
        page.clickOnUpdateButton();
    }
}
