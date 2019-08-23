package Steps;

import Base.BaseUtil;
import Pages.DependabilityRuleSetPage;
import Utilities.Scroll;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DependabilityRuleSetSD extends BaseUtil {

    private BaseUtil base;
    DependabilityRuleSetPage dependabilityRuleSetPage;

    public DependabilityRuleSetSD(BaseUtil base){
        dependabilityRuleSetPage = new DependabilityRuleSetPage(Web_Driver);
        this.base = base;
    }

    @When("^User should click on the Create New Dependability Rule Set$")
    public void userShouldClickOnTheCreateNewDependabilityRuleSet() throws Throwable {

        System.out.println("User should click on the Create New Dependability Rule Set");
        dependabilityRuleSetPage.clickNewDependabilityRuleSets();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Dependability Rule Set Screen$")
    public void userIsOnTheNewDependabilityRuleSetScreen() throws Throwable {

        System.out.println("User is on the New Dependability Rule Set Screen");
    }

    @And("^User enter the Dependability Rule Set Name \"([^\"]*)\"$")
    public void userEnterTheDependabilityRuleSetName(String ruleSetName) throws Throwable {

        System.out.println("User enter the Dependability Rule Set Name");
        dependabilityRuleSetPage.enterDependabilityRuleSetName(ruleSetName);
        Thread.sleep(1000);
    }

    @And("^User enter the Dependability Rule Set Description \"([^\"]*)\"$")
    public void userEnterTheDependabilityRuleSetDescription(String ruleSetDesc) throws Throwable {

        System.out.println("User enter the Dependability Rule Set Description");
        dependabilityRuleSetPage.enterDependabilityRuleSetDescription(ruleSetDesc);
        Thread.sleep(1000);
    }

    @And("^User check on the Expire points on a rolling basis$")
    public void userCheckOnTheExpirePointsOnARollingBasis() throws Throwable {

        System.out.println("User check on the Expire points on a rolling basis");
        dependabilityRuleSetPage.checkExpirePoints();
        Thread.sleep(1000);
    }

    @And("^User enter the Points valid for \"([^\"]*)\"$")
    public void userEnterThePointsValidFor(String points) throws Throwable {

        System.out.println("User enter the Points valid for");
        dependabilityRuleSetPage.enterThePointsValid(points);
        Thread.sleep(1000);
    }

    @And("^User select an option of Seconds$")
    public void userSelectAnOptionOfSeconds() throws Throwable {

        System.out.println("User select an option of Seconds");
        dependabilityRuleSetPage.selectSeconds();
        Thread.sleep(1000);
    }

    @And("^User select an option of day$")
    public void userSelectAnOptionOfDay() throws Throwable {

        System.out.println("User select an option of day");
        dependabilityRuleSetPage.selectDay();
        Thread.sleep(1000);
    }

    @And("^User check on the Freeze Points$")
    public void userCheckOnTheFreezePoints() throws Throwable {

        System.out.println("User check on the Freeze Points");
        dependabilityRuleSetPage.checkFreezePoints();
        Thread.sleep(1000);
    }

    @Then("^User click on the Save Button to Add Dependability Rule Set$")
    public void userClickOnTheSaveButtonToAddDependabilityRuleSet() throws Throwable {

        System.out.println("User click on the Save Button to Add Dependability Rule Set");
        dependabilityRuleSetPage.saveBtn();
        Thread.sleep(2000);
        Scroll.scrollDown();
    }

    @When("^User should click on the Edit New Dependability Rule Set$")
    public void userShouldClickOnTheEditNewDependabilityRuleSet() throws Throwable {

        System.out.println("User should click on the Edit New Dependability Rule Set");
        dependabilityRuleSetPage.clickEditNewDependability();
        Thread.sleep(1000);
    }

    @And("^User check on the dependability history$")
    public void userCheckOnTheDependabilityHistory() throws Throwable {

        System.out.println("User check on the dependability history");
        dependabilityRuleSetPage.checkDependabilityHistory();
        Thread.sleep(3000);
    }

    @And("^User check on the dependability occurances$")
    public void userCheckOnTheDependabilityOccurances() throws Throwable {

        System.out.println("User check on the dependability occurances");
        dependabilityRuleSetPage.CheckOnTheDependabilityOccurances();
        Thread.sleep(3000);
    }

    @And("^User check on the disciplinary actions$")
    public void userCheckOnTheDisciplinaryActions() throws Throwable {

        System.out.println("User check on the disciplinary actions");
        dependabilityRuleSetPage.CheckDisciplinaryActions();
        Thread.sleep(3000);
    }

    @And("^User click on the Add new dependability occurance rule$")
    public void userClickOnTheAddNewDependabilityOccuranceRule() throws Throwable {

        System.out.println("User click on the Add new dependability occurance rule");
        dependabilityRuleSetPage.clickAddNewDependability();
        Thread.sleep(1000);
    }

    @And("^User enter Add dependability Name \"([^\"]*)\"$")
    public void userEnterAddDependabilityName(String addDependability) throws Throwable {

        System.out.println("User enter Add dependability Name");
        dependabilityRuleSetPage.enterAddDependabilityName(addDependability);
        Thread.sleep(1000);
    }

    @And("^User check on the Infraction Types$")
    public void userCheckOnTheInfractionTypes() throws Throwable {

        System.out.println("User check on the Infraction Types");
        dependabilityRuleSetPage.checkInfractionTypes();
        Thread.sleep(1000);
    }

    @And("^User check on the Absent Reasons$")
    public void userCheckOnTheAbsentReasons() throws Throwable {

        System.out.println("User check on the Absent Reasons");
        dependabilityRuleSetPage.checkAbsentReasons();
        Thread.sleep(1000);
    }

    @And("^User check on the Shift Classifications$")
    public void userCheckOnTheShiftClassifications() throws Throwable {

        System.out.println("User check on the Shift Classifications");
        dependabilityRuleSetPage.checkShiftClassifications();
        Thread.sleep(1000);
    }

    @And("^User enter the Points \"([^\"]*)\"$")
    public void userEnterThePoints(String points) throws Throwable {

        System.out.println("User enter the Points ");
        dependabilityRuleSetPage.enterPoints(points);
        Thread.sleep(1000);
    }

    @And("^User enter the Min Length of Absence \"([^\"]*)\"$")
    public void userEnterTheMinLengthOfAbsence(String minAbsence) throws Throwable {

        System.out.println("User enter the Min Length of Absence");
        dependabilityRuleSetPage.enterTheMinLengthOfAbsence(minAbsence);
        Thread.sleep(1000);
    }

    @And("^User enter the Max Length of Absence \"([^\"]*)\"$")
    public void userEnterTheMaxLengthOfAbsence(String maxAbsence) throws Throwable {

        System.out.println("User enter the Max Length of Absence");
        dependabilityRuleSetPage.enterTheMaxLengthOfAbsence(maxAbsence);
        Thread.sleep(1000);
    }

    @And("^User select an option from dropdown$")
    public void userSelectAnOptionFromDropdown() throws Throwable {

        System.out.println("User select an option from dropdown");
        dependabilityRuleSetPage.selectAnOptionFromDropdown();
        Thread.sleep(1000);
    }

    @And("^User select an option from dropdown of Max length$")
    public void userSelectAnOptionFromDropdownOfMaxLength() throws Throwable {

        System.out.println("User select an option from dropdown of Max length");
        dependabilityRuleSetPage.selectAnOptionFromDropdownMaxLength();
        Thread.sleep(1000);
    }

    @Then("^User click on the Done Button to Add dependability occurance rule$")
    public void userClickOnTheDoneButtonToAddDependabilityOccuranceRule() throws Throwable {

        System.out.println("User click on the Done Button to Add dependability occurance rule");
        dependabilityRuleSetPage.clickDoneButton();
        Thread.sleep(1000);
    }
}
