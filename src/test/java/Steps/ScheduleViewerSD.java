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
        Thread.sleep(1000);
    }

    @When("^User is on the Schedule Viewers Screen$")
    public void userIsOnTheScheduleViewersScreen() throws Throwable {

        System.out.println("User is on the Schedule Viewers Screen");
    }

    @Then("^User click on the Add Schedule Viewer to this Location$")
    public void userClickOnTheAddScheduleViewerToThisLocation() throws Throwable {

        System.out.println("User click on the Add Schedule Viewer to this Location");
        scheduleViewerPage.clickOnTheAddScheduleViewerToThisLocation();
        Thread.sleep(1000);
    }

    @When("^User is on the Find New Schedule Viewer Screen$")
    public void userIsOnTheFindNewScheduleViewerScreen() throws Throwable {

        System.out.println("User is on the Find New Schedule Viewer Screen");
        Thread.sleep(1000);
    }

    @And("^User find new schedule by last name \"([^\"]*)\"$")
    public void userFindNewScheduleByLastName(String lastname) throws Throwable {

        System.out.println("User find new schedule by last name");
        scheduleViewerPage.findByLastName(lastname);
        Thread.sleep(1000);
    }

    @And("^User click on the Search Button$")
    public void userClickOnTheSearchButton() throws Throwable {

        System.out.println("User click on the Search Button");
        scheduleViewerPage.clickOnSearch();
        Thread.sleep(1000);
    }

    @And("^User select the new schedule viewer$")
    public void userSelectTheNewScheduleViewer() throws Throwable {

        System.out.println("User select the new schedule viewer");
        scheduleViewerPage.selectNameFromList();
        Thread.sleep(1000);
    }

    @Then("^User click on the Create button$")
    public void userClickOnTheCreateButton() throws Throwable {

        System.out.println("User click on the Create button");
        scheduleViewerPage.clickOnTheCreateButton();
        Thread.sleep(1000);
    }

    @When("^User click on the Remove Link Text$")
    public void userClickOnTheRemoveLinkText() throws Throwable {

        System.out.println("User click on the Remove Link Text");
        scheduleViewerPage.removeScheduleViewer();
        Thread.sleep(1000);
    }

    @And("^User click on the OK Button$")
    public void userClickOnTheOKButton() throws Throwable {

        System.out.println("User click on the OK Button");
        scheduleViewerPage.clickOKButton();
        Thread.sleep(1000);
    }

    @Then("^User click on the Add Schedule Viewer to Multiple Location$")
    public void userClickOnTheAddScheduleViewerToMultipleLocation() throws Throwable {

        scheduleViewerPage.clickOnTheAddScheduleViewerToMultipleLocation();
        Thread.sleep(1000);
    }

    @Then("^User click on the Next button$")
    public void userClickOnTheNextButton() throws Throwable {

        scheduleViewerPage.clickNextButton();
        Thread.sleep(1000);
    }

    @When("^User is on the Find New Schedule Viewer Next Screen$")
    public void userIsOnTheFindNewScheduleViewerNextScreen() throws Throwable {

        System.out.println("User is on the Find New Schedule Viewer Screen");
    }

    @And("^User select multiple locations$")
    public void userSelectMultipleLocations() throws Throwable {

        scheduleViewerPage.selectLocationsFromList();
        Thread.sleep(1000);
    }

    @When("^User click on the Edit Assignment link text$")
    public void userClickOnTheEditAssignmentLinkText() throws Throwable {

        scheduleViewerPage.editAssignmentLink();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Schedule Viewer Screen$")
    public void userIsOnTheEditScheduleViewerScreen() throws Throwable {

    }

    @And("^User edit locations$")
    public void userEditLocations() throws Throwable {

        scheduleViewerPage.editSchedule();
        Thread.sleep(1000);
    }

    @When("^User click on the Edit Profile link text$")
    public void userClickOnTheEditProfileLinkText() throws Throwable {

        scheduleViewerPage.editProfileLink();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Profile Viewer Screen$")
    public void userIsOnTheEditProfileViewerScreen() throws Throwable {

    }

    @And("^User edit Profile \"([^\"]*)\"$")
    public void userEditProfile(String editName) throws Throwable {

        scheduleViewerPage.editProfile(editName);
        Thread.sleep(1000);
    }

    @Then("^User click on the Update button$")
    public void userClickOnTheUpdateButton() throws Throwable {

        System.out.println("User click on the Update button");
        scheduleViewerPage.clickOnTheUpdateButton();
        Thread.sleep(1000);
    }

    @And("^User click on the Cancel button$")
    public void userClickOnTheCancelButton() throws Throwable {

        System.out.println("User click on the Cancel button");
        scheduleViewerPage.clickOnTheCancelButton();
        Thread.sleep(1000);
    }
}
