package Steps;

import Base.BaseUtil;
import Pages.SettingsPage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SettingsSD extends BaseUtil {

    SettingsPage settingsPage;
    Helper helper;
    private BaseUtil base;

    public SettingsSD(){
        settingsPage = new SettingsPage(Web_Driver);
        helper = new Helper();
        this.base = base;
    }

    @Given("^User see the Settings Tab$")
    public void userSeeTheSettingsTab() throws Throwable {

        System.out.println("User see the Settings Tab");
        Thread.sleep(1000);
    }

    @When("^User click on the Settings Tab$")
    public void userClickOnTheSettingsTab() throws Throwable {

        System.out.println("User click on the Settings Tab");
        settingsPage.clickSettingsTabLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Settings Screen$")
    public void userIsOnTheSettingsScreen() throws Throwable {

        System.out.println("User is on the Settings Screen");
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Employee Profile Settings$")
    public void userShouldClickOnTheEditEmployeeProfileSettings() throws Throwable {

        System.out.println("User should click on the Edit Employee Profile Settings");
        settingsPage.clickEditEmployeeProfileSettings();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Employee Profile Settings Screen$")
    public void userIsOnTheEditEmployeeProfileSettingsScreen() throws Throwable {

        System.out.println("User is on the Edit Employee Profile Settings Screen");
        Thread.sleep(1000);
    }

    @And("^User make some changes to profile settings$")
    public void userMakeSomeChangesToProfileSettings() throws Throwable {

        System.out.println("User make some changes to profile settings");
        settingsPage.clickOnCheckboxes();
        Thread.sleep(1000);
    }

    @Then("^User click on the Update Button to update Settings$")
    public void userClickOnTheUpdateButtonToUpdateSettings() throws Throwable {

        System.out.println("User click on the Update Button to update Settings");
        settingsPage.clickUpdateButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Absent Reasons Link Text$")
    public void userShouldClickOnTheEditAbsentReasonsLinkText() throws Throwable {

        System.out.println("User should click on the Edit Absent Reasons Link Text");
        settingsPage.clickEditAbsentReasonsLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Absent Reasons Screen$")
    public void userIsOnTheEditAbsentReasonsScreen() throws Throwable {

        System.out.println("User is on the Edit Absent Reasons Screen");
        Thread.sleep(1000);
    }

    @And("^User should click on the Create New Absent Reason$")
    public void userShouldClickOnTheCreateNewAbsentReason() throws Throwable {

        System.out.println("User should click on the Create New Absent Reason");
        settingsPage.clickCreateNewAbsentReason();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Absent Reason Screen$")
    public void userIsOnTheNewAbsentReasonScreen() throws Throwable {

        System.out.println("User is on the New Absent Reason Screen");
        Thread.sleep(1000);
    }

    @And("^User enter the Absent Reason Code$")
    public void userEnterTheAbsentReasonCode() throws Throwable {

        System.out.println("User enter the Absent Reason Code");
        settingsPage.enterCode();
        Thread.sleep(1000);
    }

    @And("^User enter the Absent Reason Description$")
    public void userEnterTheAbsentReasonDescription() throws Throwable {

        System.out.println("User enter the Absent Reason Description");
        settingsPage.enterDescription();
        Thread.sleep(1000);
    }

    @And("^User enter the Display Order for Absent Reason \"([^\"]*)\"$")
    public void userEnterTheDisplayOrderForAbsentReason(String enterOrder) throws Throwable {

        System.out.println("User enter the Display Order for Absent Reason");
        settingsPage.enterDisplayOrder(enterOrder);
        Thread.sleep(1000);
    }

    @And("^User click on the Add Button to add Absent Reason$")
    public void userClickOnTheAddButtonToAddAbsentReason() throws Throwable {

        System.out.println("User click on the Add Button to add Absent Reason");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @And("^User click on the Cancel Button to return to the Settings Screen$")
    public void userClickOnTheCancelButtonToReturnToTheSettingsScreen() throws Throwable {

        System.out.println("User click on the Cancel Button to return to the Settings Screen");
        settingsPage.clickCancelButton();
        Thread.sleep(1000);
    }

    @And("^User should click on the Edit Link Text$")
    public void userShouldClickOnTheEditLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Absent Reason Screen$")
    public void userIsOnTheEditAbsentReasonScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to Update Absent Reason$")
    public void userClickOnTheUpdateButtonToUpdateAbsentReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Paid Time Off Reasons Link Text$")
    public void userShouldClickOnTheEditPaidTimeOffReasonsLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditPaidTimeOffReasons();
        Thread.sleep(1000);
    }

    @Then("^User is on the Paid Time Off Reasons Screen$")
    public void userIsOnThePaidTimeOffReasonsScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User should click on the New Paid Time Off Reason Link Text$")
    public void userShouldClickOnTheNewPaidTimeOffReasonLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickNewPaidTimeOffReason();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Paid Time Off Reason Screen$")
    public void userIsOnTheNewPaidTimeOffReasonScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Paid Time Reason Code$")
    public void userEnterThePaidTimeReasonCode() throws Throwable {

        System.out.println("");
        settingsPage.enterCode();
        Thread.sleep(1000);
    }

    @And("^User enter the Paid Time Reason Description$")
    public void userEnterThePaidTimeReasonDescription() throws Throwable {

        System.out.println("");
        settingsPage.enterDescription();
        Thread.sleep(1000);
    }

    @And("^User enter the Display Order for Paid Time Reason \"([^\"]*)\"$")
    public void userEnterTheDisplayOrderForPaidTimeReason(String enterOrder) throws Throwable {

        System.out.println("");
        settingsPage.enterDisplayOrder(enterOrder);
        Thread.sleep(1000);
    }

    @And("^User click on the Add Button to add Paid Time Reason$")
    public void userClickOnTheAddButtonToAddPaidTimeReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @And("^User should click on the Edit Paid Time Off Link Text$")
    public void userShouldClickOnTheEditPaidTimeOffLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditPaidTimeOffLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Paid Time Off Reason Screen$")
    public void userIsOnTheEditPaidTimeOffReasonScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to Update Paid Time Reason$")
    public void userClickOnTheUpdateButtonToUpdatePaidTimeReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Overtime Reasons Link Text$")
    public void userShouldClickOnTheEditOvertimeReasonsLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditOvertimeReasons();
        Thread.sleep(1000);
    }

    @Then("^User is on the Overtime Reasons Screen$")
    public void userIsOnTheOvertimeReasonsScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User should click on the New Overtime Reason Link Text$")
    public void userShouldClickOnTheNewOvertimeReasonLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickNewOvertimeReason();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Overtime Reason Screen$")
    public void userIsOnTheNewOvertimeReasonScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Display Order for Overtime Reasons \"([^\"]*)\"$")
    public void userEnterTheDisplayOrderForOvertimeReasons(String enterOrder) throws Throwable {

        System.out.println("");
        settingsPage.enterDisplayOrder(enterOrder);
        Thread.sleep(1000);
    }

    @And("^User click on the Add Button to add Overtime Reason$")
    public void userClickOnTheAddButtonToAddOvertimeReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @And("^User should click on the Edit Overtime Reason Link Text$")
    public void userShouldClickOnTheEditOvertimeReasonLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditOvertimeReasonLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Overtime Reason Screen$")
    public void userIsOnTheEditOvertimeReasonScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to Update Overtime Reason$")
    public void userClickOnTheUpdateButtonToUpdateOvertimeReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Unauthorized Hours Reasons Link Text$")
    public void userShouldClickOnTheEditUnauthorizedHoursReasonsLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditUnauthorizedHoursReasons();
        Thread.sleep(1000);
    }

    @Then("^User is on the Unauthorized Hours Reasons Screen$")
    public void userIsOnTheUnauthorizedHoursReasonsScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User should click on the New Unauthorized Hours Reason Link Text$")
    public void userShouldClickOnTheNewUnauthorizedHoursReasonLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickNewUnauthorizedHoursReason();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Unauthorized Hours Reason Screen$")
    public void userIsOnTheNewUnauthorizedHoursReasonScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Display Order for Unauthorized Hours Reason \"([^\"]*)\"$")
    public void userEnterTheDisplayOrderForUnauthorizedHoursReason(String enterOrder) throws Throwable {

        System.out.println("");
        settingsPage.enterDisplayOrder(enterOrder);
        Thread.sleep(1000);
    }

    @And("^User click on the Add Button to add Unauthorized Hours Reason$")
    public void userClickOnTheAddButtonToAddUnauthorizedHoursReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @And("^User should click on the Edit Unauthorized Hours Link Text$")
    public void userShouldClickOnTheEditUnauthorizedHoursLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditUnauthorizedHours();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Unauthorized Hours Reasons Screen$")
    public void userIsOnTheEditUnauthorizedHoursReasonsScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to Update Unauthorized Hours Reason$")
    public void userClickOnTheUpdateButtonToUpdateUnauthorizedHoursReason() throws Throwable {

        System.out.println("");
        settingsPage.clickAddButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Password Policy Link Text$")
    public void userShouldClickOnTheEditPasswordPolicyLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditPasswordPolicy();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Password Policy Screen$")
    public void userIsOnTheEditPasswordPolicyScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User check on the checkboxes to update Password Policy$")
    public void userCheckOnTheCheckboxesToUpdatePasswordPolicy() throws Throwable {

        System.out.println("");
        settingsPage.checkCheckboxes();
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to Update Password Policy$")
    public void userClickOnTheUpdateButtonToUpdatePasswordPolicy() throws Throwable {

        System.out.println("");
        settingsPage.clickButtonUpdate();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Company Terminology Link Text$")
    public void userShouldClickOnTheEditCompanyTerminologyLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditCompanyTerminology();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Company Terminology Screen$")
    public void userIsOnTheEditCompanyTerminologyScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Department \"([^\"]*)\"$")
    public void userEnterTheDepartment(String department) throws Throwable {

        System.out.println("");
        settingsPage.enterDepartment(department);
        Thread.sleep(1000);
    }

    @And("^User enter the Dependability Point \"([^\"]*)\"$")
    public void userEnterTheDependabilityPoint(String dependability) throws Throwable {

        System.out.println("");
        settingsPage.enterDependability(dependability);
        Thread.sleep(1000);
    }

    @And("^User enter the Disciplinary Action \"([^\"]*)\"$")
    public void userEnterTheDisciplinaryAction(String disciplinary) throws Throwable {

        System.out.println("");
        settingsPage.enterDisciplinary(disciplinary);
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to Update Company Terminology Settings$")
    public void userClickOnTheUpdateButtonToUpdateCompanyTerminologySettings() throws Throwable {

        System.out.println("");
        settingsPage.clickButtonUpdate();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Quarter Dates Link Text$")
    public void userShouldClickOnTheEditQuarterDatesLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditQuarterDates();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Quarter Dates Screen$")
    public void userIsOnTheEditQuarterDatesScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User select options from dropdown to Edit Quarter Start Dates$")
    public void userSelectOptionsFromDropdownToEditQuarterStartDates() throws Throwable {

        System.out.println("");
        settingsPage.selectDropdownToEditQuarterStartDates();
        Thread.sleep(1000);
    }

    @And("^User click on the Save Button to Save Quarter Dates$")
    public void userClickOnTheSaveButtonToSaveQuarterDates() throws Throwable {

        System.out.println("");
        settingsPage.clickSaveButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Seniority Rank Link Text$")
    public void userShouldClickOnTheEditSeniorityRankLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditSeniorityRank();
        Thread.sleep(1000);
    }

    @Then("^User is on the Seniority Rank Rules Screen$")
    public void userIsOnTheSeniorityRankRulesScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @When("^User should click on the Add New Seniority Rank Rule Link Text$")
    public void userShouldClickOnTheAddNewSeniorityRankRuleLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickAddNewSeniorityRankRule();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Seniority Rule Screen$")
    public void userIsOnTheNewSeniorityRuleScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Seniority Rule Name \"([^\"]*)\"$")
    public void userEnterTheSeniorityRuleName(String companyHireDate) throws Throwable {

        System.out.println("");
        settingsPage.enterSeniorityRuleName(companyHireDate);
        Thread.sleep(1000);
    }

    @And("^User select Main Seniority Rank$")
    public void userSelectMainSeniorityRank() throws Throwable {

        System.out.println("");
        settingsPage.selectMainSeniorityRank();
        Thread.sleep(1000);
    }

    @And("^User click on the Save Button to Save Seniority Rule$")
    public void userClickOnTheSaveButtonToSaveSeniorityRule() throws Throwable {

        System.out.println("");
        settingsPage.clickSaveButton();
        Thread.sleep(1000);
    }

    @And("^User click on the Done Button to Save Seniority Rule$")
    public void userClickOnTheDoneButtonToSaveSeniorityRule() throws Throwable {

        System.out.println("");
        settingsPage.clickButtonDone();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Seniority Rank Rule Link Text$")
    public void userShouldClickOnTheEditSeniorityRankRuleLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditSeniorityRankRule();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Break Classifications Link Text$")
    public void userShouldClickOnTheEditBreakClassificationsLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditBreakClassifications();
        Thread.sleep(1000);
    }

    @Then("^User is on the Break Classification Screen$")
    public void userIsOnTheBreakClassificationScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @When("^User should click on the Add New Break Classification Link Text$")
    public void userShouldClickOnTheAddNewBreakClassificationLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickAddNewBreakClassification();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Break Classification Screen$")
    public void userIsOnTheNewBreakClassificationScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Break Classification Name \"([^\"]*)\"$")
    public void userEnterTheBreakClassificationName(String breakClassificationName) throws Throwable {

        System.out.println("");
        settingsPage.enterBreakClassificationName(breakClassificationName);
        Thread.sleep(1000);
    }

    @And("^User enter the Break Classification Description \"([^\"]*)\"$")
    public void userEnterTheBreakClassificationDescription(String breakClassificationDescription) throws Throwable {

        System.out.println("");
        settingsPage.enterBreakClassificationDescription(breakClassificationDescription);
        Thread.sleep(1000);
    }

    @And("^User select Locations for Break Classification$")
    public void userSelectLocationsForBreakClassification() throws Throwable {

        System.out.println("");
        settingsPage.selectLocationsForBreakClassification();
        Thread.sleep(1000);
    }

    @And("^User click on the Save Button to Save Break Classification$")
    public void userClickOnTheSaveButtonToSaveBreakClassification() throws Throwable {

        System.out.println("");
        settingsPage.clickSaveButton();
        Thread.sleep(1000);
    }

    @And("^User click on the Done Button to Save Break Classification$")
    public void userClickOnTheDoneButtonToSaveBreakClassification() throws Throwable {

        System.out.println("");
        settingsPage.clickButtonDone();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Break Classification Link Text$")
    public void userShouldClickOnTheEditBreakClassificationLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditBreakClassification();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Break Classification Screen$")
    public void userIsOnTheEditBreakClassificationScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Default Break Settings Link Text$")
    public void userShouldClickOnTheEditDefaultBreakSettingsLinkText() throws Throwable {

        System.out.println("");
        settingsPage.clickEditDefaultBreakSettings();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Default Break Settings Screen$")
    public void userIsOnTheEditDefaultBreakSettingsScreen() throws Throwable {

        System.out.println("");
        Thread.sleep(1000);
    }

    @And("^User enter the Shift Hours \"([^\"]*)\"$")
    public void userEnterTheShiftHours(String shiftHours) throws Throwable {

        System.out.println("");
        settingsPage.enterShiftHours(shiftHours);
        Thread.sleep(1000);
    }

    @And("^User enter the Break Length \"([^\"]*)\"$")
    public void userEnterTheBreakLength(String breakLength) throws Throwable {

        System.out.println("");
        settingsPage.enter(breakLength);
        Thread.sleep(1000);
    }

    @Then("^User click on the Update Button to update Break Settings$")
    public void userClickOnTheUpdateButtonToUpdateBreakSettings() throws Throwable {

        System.out.println("");
        settingsPage.clickButtonUpdate();
        Thread.sleep(1000);
    }
}
