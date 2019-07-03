package Steps;

import Base.BaseUtil;
import Pages.RuleSetsPage_UTORuleSet;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RuleSetsSD_UTORuleSet extends BaseUtil {

    private BaseUtil base;
    RuleSetsPage_UTORuleSet page;

    public RuleSetsSD_UTORuleSet(BaseUtil base) {
        page = new RuleSetsPage_UTORuleSet(Web_Driver);
        this.base = base;
    }

    @When("^User clicks on Create New UTO Rule Set$")
    public void userClicksOnCreateNewUTORuleSet() {
        System.out.println("Click Create New UTO Rule Set");
        page.clickCreateNewUTORuleSet();
    }

    @Then("^User should be navigated to New UTO Rule Set page$")
    public void userShouldBeNavigatedToNewUTORuleSetPage() {
        String newShiftLable = page.lbNewUTORuleSet.getText();
        if (newShiftLable.equals("New UTO Rule Set")) {
            System.out.println("User is on right page");
        }
    }

    @And("^User should be able to enter UTO \"([^\"]*)\"$")
    public void userShouldBeAbleToEnterUTO(String ruleSetName) throws Exception {
        System.out.println("Entering UTO Rule Set Name");
        page.enteringUTORuleSetName(ruleSetName);
    }

    @And("^User should be able to enter \"([^\"]*)\" Before Shift Start UTO Request$")
    public void userShouldBeAbleToEnterBeforeShiftStartUTORequest(String minHrs) throws Exception {
        System.out.println("Entering Min Hours Before Shift Start UTO Request");
        page.enteringMinHoursBeforeShiftStartUTORequest(minHrs);
    }

    @And("^User should be able to enter \"([^\"]*)\" Before UTO Request$")
    public void userShouldBeAbleToEnterBeforeUTORequest(String maxHrs) throws Exception {
        System.out.println("Entering Max Hours Before UTO Request");
        page.enteringMaxHoursBeforeUTORequest(maxHrs);
    }

    @And("^User should be able to enter \"([^\"]*)\" in Window$")
    public void userShouldBeAbleToEnterInWindow(String maxOccurrences) throws Exception {
        System.out.println("Entering Max Occurrences in Window");
        page.enteringMaxOccurrencesWindow(maxOccurrences);
    }

    @And("^User should be able to enter \"([^\"]*)\" days$")
    public void userShouldBeAbleToEnterDays(String windowForOccurrences) throws Exception {
        System.out.println("Entering Window for Occurrences Days");
        page.enteringWindowOccurrencesDays(windowForOccurrences);
    }

    @And("^User should be able to check Count Same Day Occurrences As One$")
    public void userShouldBeAbleToCheckCountSameDayOccurrencesAsOne() {
        System.out.println("Checked Count Same-Day Occurrences as One");
        page.checkedCountSameDayOccurrencesOne();
    }

    @Then("^User should be able to click Add button$")
    public void userShouldBeAbleToClickAddButton() {
        System.out.println("Clicking Add Button");
        page.clickingAddButton();
    }
}
