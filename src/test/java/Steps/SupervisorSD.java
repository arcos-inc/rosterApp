package Steps;

import Base.BaseUtil;
import Pages.SupervisorPage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupervisorSD extends BaseUtil {

    private BaseUtil base;
    SupervisorPage supervisorPage;
    Helper help;

    public SupervisorSD(BaseUtil base){
        supervisorPage = new SupervisorPage(Web_Driver);
        help =new Helper();
        this.base = base;
    }


    @Then("^User should click on Supervisors Link Text$")
    public void userShouldClickOnSupervisorsLinkText() throws Throwable {

        System.out.println("User should click on Supervisors Link Text");
        supervisorPage.clickOnSupervisors();
        Thread.sleep(1000);
    }

    @When("^User is on the Supervisors Screen$")
    public void userIsOnTheSupervisorsScreen() throws Throwable {

        System.out.println("User is on the Supervisors Screen");
        Thread.sleep(1000);
    }

    @Then("^User click on the Add Supervisor to this Work Group$")
    public void userClickOnTheAddSupervisorToThisWorkGroup() throws Throwable {

        System.out.println("User click on the Add Supervisor to this Work Group");
        supervisorPage.clickOnTheAddSupervisorToThisLocation();
        Thread.sleep(1000);
    }

    @When("^User is on the Find New Supervisor Screen$")
    public void userIsOnTheFindNewSupervisorScreen() throws Throwable {

        System.out.println("User is on the Find New Supervisor Screen");
        Thread.sleep(1000);
    }

    @And("^User find new schedule by last name of Supervisor \"([^\"]*)\"$")
    public void userFindNewScheduleByLastNameOfSupervisor(String lastname) throws Throwable {

        System.out.println("User find new schedule by last name of Supervisor");
        supervisorPage.findByLastName(lastname);
        Thread.sleep(1000);
    }

    @And("^User click on the Search Button to Find a New Supervisor$")
    public void userClickOnTheSearchButtonToFindANewSupervisor() throws Throwable {

        System.out.println("User click on the Search Button to Find a New Supervisor");
        supervisorPage.clickOnSearch();
        Thread.sleep(1000);
    }

    @And("^User select the new Supervisor$")
    public void userSelectTheNewSupervisor() throws Throwable {

        System.out.println("User select the new Supervisor");
        supervisorPage.selectNameFromList();
        Thread.sleep(1000);
    }

    @Then("^User click on the Create button to add Supervisor$")
    public void userClickOnTheCreateButtonToAddSupervisor() throws Throwable {

        System.out.println("User click on the Create button to add Supervisor");
        supervisorPage.clickOnTheCreateButton();
        Thread.sleep(1000);
    }

    @When("^User click on the Remove Link Text on Supervisor Screen$")
    public void userClickOnTheRemoveLinkTextOnSupervisorScreen() throws Throwable {

        System.out.println("User click on the Remove Link Text on Supervisor Screen");
        supervisorPage.removeSupervisor();
        Thread.sleep(1000);
    }

    @And("^User click on the OK Button on Supervisor Screen$")
    public void userClickOnTheOKButtonOnSupervisorScreen() throws Throwable {

        System.out.println("User click on the OK Button on Supervisor Screen");
        supervisorPage.clickOKButton();
        Thread.sleep(1000);
    }

    @Then("^User click on the Add Supervisor to Multiple Work Groups$")
    public void userClickOnTheAddSupervisorToMultipleWorkGroups() throws Throwable {

        System.out.println("User click on the Add Supervisor to Multiple Work Groups");
        supervisorPage.clickOnTheAddSupervisorToMultipleLocation();
        Thread.sleep(1000);
    }

    @Then("^User click on the Next button on Supervisor Screen$")
    public void userClickOnTheNextButtonOnSupervisorScreen() throws Throwable {

        System.out.println("User click on the Next button on Supervisor Screen");
        supervisorPage.clickNextButton();
        Thread.sleep(1000);
    }

    @When("^User is on the Find New Supervisor Next Screen$")
    public void userIsOnTheFindNewSupervisorNextScreen() throws Throwable {

        System.out.println("User is on the Find New Supervisor Next Screen");
        Thread.sleep(1000);
    }

    @And("^User select multiple locations on Supervisor Screen$")
    public void userSelectMultipleLocationsOnSupervisorScreen() throws Throwable {

        System.out.println("User select multiple locations on Supervisor Screen");
        supervisorPage.selectLocationsFromList();
        Thread.sleep(1000);
    }

    @When("^User click on the Edit Assignment link text on Supervisor Screen$")
    public void userClickOnTheEditAssignmentLinkTextOnSupervisorScreen() throws Throwable {

        System.out.println("User click on the Edit Assignment link text on Supervisor Screen");
        supervisorPage.editAssignmentLink();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Supervisor Screen$")
    public void userIsOnTheEditSupervisorScreen() throws Throwable {

        System.out.println("User is on the Edit Supervisor Screen");
        Thread.sleep(1000);
    }

    @And("^User edit locations on Supervisor Screen$")
    public void userEditLocationsOnSupervisorScreen() throws Throwable {

        System.out.println("User edit locations on Supervisor Screen");
        supervisorPage.editSchedule();
        Thread.sleep(1000);
    }

    @When("^User click on the Edit Profile link text on Supervisor Screen$")
    public void userClickOnTheEditProfileLinkTextOnSupervisorScreen() throws Throwable {

        System.out.println("User click on the Edit Profile link text on Supervisor Screen");
        supervisorPage.editProfileLink();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Supervisor Profile Screen$")
    public void userIsOnTheEditSupervisorProfileScreen() throws Throwable {

        System.out.println("User is on the Edit Supervisor Profile Screen");
        Thread.sleep(1000);
    }

    @And("^User edit Profile on Supervisor Screen$")
    public void userEditProfileOnSupervisorScreen() throws Throwable {

        System.out.println("User edit Profile on Supervisor Screen");
        supervisorPage.editProfile(help.generateNames() + " "+ help.randomString(2));
        Thread.sleep(1000);
    }

    @Then("^User click on the Update button to add Supervisor$")
    public void userClickOnTheUpdateButtonToAddSupervisor() throws Throwable {

        System.out.println("User click on the Update button to add Supervisor");
        supervisorPage.clickOnTheUpdateButton();
        Thread.sleep(1000);
    }
}
