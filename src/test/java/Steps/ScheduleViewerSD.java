package Steps;

import Base.BaseUtil;
import Pages.LocationPage;
import Pages.ScheduleViewerPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScheduleViewerSD extends BaseUtil {

    private BaseUtil base;
    ScheduleViewerPage scheduleViewerPage;

    public ScheduleViewerSD(BaseUtil base) {
        scheduleViewerPage = new ScheduleViewerPage(Web_Driver);
        this.base = base;
    }

    @Then("^User should click on Schedule Viewer$")
    public void userShouldClickOnScheduleViewer() throws Throwable {

        System.out.println("Clicking on Schedule viewer");
        scheduleViewerPage.clickOnScheduleViewer();
    }

    @When("^User is on the Schedule Viewers Screen$")
    public void userIsOnTheScheduleViewersScreen() throws Throwable {

        System.out.println("User is on the Schedule Viewers Screen");
    }

    @Then("^User click on the Add Schedule Viewer to this Location$")
    public void userClickOnTheAddScheduleViewerToThisLocation() throws Throwable {

        System.out.println("User click on the Add Schedule Viewer to this Location");
        scheduleViewerPage.clickOnTheAddScheduleViewerToThisLocation();
    }

    @When("^User is on the Find New Schedule Viewer Screen$")
    public void userIsOnTheFindNewScheduleViewerScreen() throws Throwable {

        System.out.println("User is on the Find New Schedule Viewer Screen");
    }

    @And("^User find new schedule by last name \"([^\"]*)\"$")
    public void userFindNewScheduleByLastName(String lastname) throws Throwable {

        System.out.println("User find new schedule by last name");
        scheduleViewerPage.findByLastName(lastname);
    }

    @And("^User click on the Search Button$")
    public void userClickOnTheSearchButton() throws Throwable {

        System.out.println("User click on the Search Button");
        scheduleViewerPage.clickOnSearch();
    }

    @And("^User select the new schedule viewer$")
    public void userSelectTheNewScheduleViewer() throws Throwable {

        System.out.println("User select the new schedule viewer");
        scheduleViewerPage.selectNameFromList();
    }

    @Then("^User click on the Create button$")
    public void userClickOnTheCreateButton() throws Throwable {

        System.out.println("User click on the Create button");
        scheduleViewerPage.clickOnTheCreateButton();
    }

    @When("^User click on the Remove Link Text$")
    public void userClickOnTheRemoveLinkText() throws Throwable {

        System.out.println("User click on the Remove Link Text");
        scheduleViewerPage.removeScheduleViewer();
    }

    @And("^User click on the OK Button$")
    public void userClickOnTheOKButton() throws Throwable {

        System.out.println("User click on the OK Button");
        scheduleViewerPage.clickOKButton();
    }

    @Then("^User click on the Add Schedule Viewer to Multiple Location$")
    public void userClickOnTheAddScheduleViewerToMultipleLocation() throws Throwable {

        scheduleViewerPage.clickOnTheAddScheduleViewerToMultipleLocation();
    }

    @Then("^User click on the Next button$")
    public void userClickOnTheNextButton() throws Throwable {

        scheduleViewerPage.clickNextButton();
    }

    @When("^User is on the Find New Schedule Viewer Next Screen$")
    public void userIsOnTheFindNewScheduleViewerNextScreen() throws Throwable {

        System.out.println("User is on the Find New Schedule Viewer Screen");
    }

    @And("^User select multiple locations$")
    public void userSelectMultipleLocations() throws Throwable {

        scheduleViewerPage.selectLocationsFromList();
    }

    @When("^User click on the Edit Assignment link text$")
    public void userClickOnTheEditAssignmentLinkText() throws Throwable {

        scheduleViewerPage.editAssignmentLink();
    }

    @Then("^User is on the Edit Schedule Viewer Screen$")
    public void userIsOnTheEditScheduleViewerScreen() throws Throwable {

    }

    @And("^User edit locations$")
    public void userEditLocations() throws Throwable {

        scheduleViewerPage.editSchedule();
    }

    @When("^User click on the Edit Profile link text$")
    public void userClickOnTheEditProfileLinkText() throws Throwable {

        scheduleViewerPage.editProfileLink();
    }

    @Then("^User is on the Edit Profile Viewer Screen$")
    public void userIsOnTheEditProfileViewerScreen() throws Throwable {

    }


    @Then("^User click on the Update button$")
    public void userClickOnTheUpdateButton() throws Throwable {

        System.out.println("User click on the Update button");
        scheduleViewerPage.clickOnTheUpdateButton();
    }

    @And("^User edit Profile \"([^\"]*)\"$")
    public void userEditProfile(String editName) throws Throwable {

        scheduleViewerPage.editProfile(editName);
    }
}
