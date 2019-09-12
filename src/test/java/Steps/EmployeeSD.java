package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.EmployeePage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class EmployeeSD extends BaseUtil {

    private BaseUtil base;
    EmployeePage page;
    Helper help;

    public EmployeeSD(BaseUtil base) {
        page = new EmployeePage(Web_Driver);
        help = new Helper();
        this.base = base;
    }

    @Given("^User should select acting role as Location Admin$")
    public void userShouldSelectActingRoleAsLocationAdmin() throws Exception {
        page.GetLocationURL();
        Web_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^User see the Employee Tab$")
    public void userSeeTheEmployeeTab() {
        System.out.println("Clicking Employee Tab");
        page.clickEmployeeTab();
    }

    @Then("^User should select the Work Group from the DropDown$")
    public void userShouldSelectTheWorkGroupFromTheDropDown() {
        System.out.println("Selecting Work Group");
        page.clickWorkGroupDropDown();
        page.selectWorkGroup();
    }

    @And("^User should click on Create Employee link$")
    public void userShouldClickOnCreateEmployeeLink() {
        System.out.println("Clicking Create New Employee");
        page.clickCreateEmployee();
    }

    @And("^User should enter the employee First Name$")
    public void userShouldEnterTheEmployeeFirstName() throws Exception {
        System.out.println("Entering Employee First Name");
        page.enterEmployeeFirstName(help.generateNames());
    }

    @And("^User should enter the employee Last Name$")
    public void userShouldEnterTheEmployeeLastName() throws Exception {
        System.out.println("Entering Employee Last Name");
        page.enterEmployeeLastName(help.generateNames());
    }

    @And("^User should enter the employee User Name$")
    public void userShouldEnterTheEmployeeUserName() throws Exception {
        System.out.println("Entering Employee User Name");
        page.enterEmployeeUserName(help.generateNames());
    }

    @And("^User should enter the employee Password \"([^\"]*)\"$")
    public void userShouldEnterTheEmployeePassword(String pass) throws Exception {
        System.out.println("Entering Employee Password");
        page.enterEmployeePassword(pass);
    }

    @And("^User should enter the employee Email Address \"([^\"]*)\"$")
    public void userShouldEnterTheEmployeeEmailAddress(String email) throws Exception {
        System.out.println("Entering Employee Email Address");
        page.enterEmployeeEmailAddress(email);
    }

    @And("^User should enter the employee Number$")
    public void userShouldEnterTheEmployeeNumber() throws Exception {
        System.out.println("Entering Employee Number");
        page.enterEmployeeNumber(help.randomString(5));
    }

    @And("^User should enter the CellPhone Number \"([^\"]*)\"$")
    public void userShouldEnterTheCellPhoneNumber(String cellNumber) throws Throwable {
        System.out.println("User should enter the CellPhone Number");
        page.enterEmployeeCellNumber(cellNumber);
    }

    @And("^User should select the employee Phone Carrier$")
    public void userShouldSelectTheEmployeePhoneCarrier() {
        System.out.println("Selecting Employee Phone Carrier");
        page.clickEmployeePhoneCarrier();
        page.selectEmployeePhoneCarrier();
    }

    @And("^User should select the employee Hair Date$")
    public void userShouldSelectTheEmployeeHairDate() {
        System.out.println("Selecting Employee Hair Date");
        page.clickEmployeeHairDate();
        page.selectEmployeeHairDate();
    }

    @And("^User should select the Skill Set$")
    public void userShouldSelectTheSkillSet() {
        System.out.println("Selecting Employee Skill Set");
        page.selectEmployeeSkill();
    }

    @And("^User should select the Work Group$")
    public void userShouldSelectTheWorkGroup() {
        System.out.println("Selecting Employee Work Group");
        page.clickEmployeeWorkGroup();
        page.selectEmployeeWorkGroup();
    }

    @And("^User should select the Job Title$")
    public void userShouldSelectTheJobTitle() {
        System.out.println("Selecting Employee Job Title");
        page.clickEmployeeJobTitle();
        page.selectEmployeeJobTitle();
    }

    @And("^User should select the Shift Rule Set from the DropDown$")
    public void userShouldSelectTheShiftRuleSetFromTheDropDown() {
        System.out.println("Selecting Shift Rule Set");
        page.clickShiftRuleSet();
        page.selectShiftRuleSet();
    }

    @And("^User should select the PTO Rule Set from the DropDown$")
    public void userShouldSelectThePTORuleSetFromTheDropDown() {
        System.out.println("Selecting PTO Rule Set");
        page.clickPTORuleSet();
        page.selectPTORuleSet();
    }

    @And("^User should select the UTO Rule Set from the DropDown$")
    public void userShouldSelectTheUTORuleSetFromTheDropDown() {
        System.out.println("Selecting UTO Rule Set");
        page.clickUTORuleSet();
        page.selectUTORuleSet();
    }

    @And("^User should select the VTO Slot Rule Set form the DropDown$")
    public void userShouldSelectTheVTOSlotRuleSetFormTheDropDown() {
        System.out.println("Selecting VTO Rule Set");
        page.clickVTOSlotRuleSet();
        page.selectVTOSlotRuleSet();
    }

    @And("^User should select the Trade Work Group$")
    public void userShouldSelectTheTradeWorkGroup() {
        System.out.println("Selecting Employee Trade Work Group");
        page.clickTradeGroup();
        page.selectTradeGroup();
        page.selectAvailableGroups();
        page.clickShiftButton();
    }

    @And("^User should enter Employee Note \"([^\"]*)\"$")
    public void userShouldEnterEmployeeNote(String note) throws Exception {
        System.out.println("Entering Employee Notes");
        page.enterEmployeeNotes(note);
    }

    @And("^User should click on Create Button$")
    public void userShouldClickOnCreateButton() {
        System.out.println("Clicking Create Button");
        page.clickCreateButton();
    }

    @When("^User should click on the Edit Employee$")
    public void userShouldClickOnTheEditEmployee() throws Throwable {
        page.clickOnTheEdit();
        Thread.sleep(1000);
    }

    @Then("^User should be on Edit Employee Screen$")
    public void userShouldBeOnEditEmployeeScreen() throws Throwable {

    }

    @When("^User should click on the Add Notes Text Link$")
    public void userShouldClickOnTheAddNotesTextLink() throws Throwable {
        page.clickAddNotes();
        Thread.sleep(1000);
    }

    @Then("^User should be on the Notes for Employee Screen$")
    public void userShouldBeOnTheNotesForEmployeeScreen() throws Throwable {

    }

    @And("^User click on the Create new note Text link$")
    public void userClickOnTheCreateNewNoteTextLink() throws Throwable {
        page.clickCreateNewNote();
        Thread.sleep(1000);
    }



    @And("^User add note \"([^\"]*)\"$")
    public void userAddNote(String notes) throws Throwable {
        page.enterNotes(notes);
        Thread.sleep(1000);
    }

    @And("^User click on the OK Button to save note$")
    public void userClickOnTheOKButtonToSaveNote() throws Throwable {
        page.clickOkButton();
        Thread.sleep(1000);
    }

    @And("^User check on the Show On Employee List checkbox$")
    public void userCheckOnTheShowOnEmployeeListCheckbox() throws Throwable {
        page.clickEmployeeListCheckbox();
        Thread.sleep(1000);
    }

    @Then("^User click on the Update button to return on the Edit Employee Screen$")
    public void userClickOnTheUpdateButtonToReturnOnTheEditEmployeeScreen() throws Throwable {
        page.clickSaveUpdate();
        Thread.sleep(1000);
    }

    @Then("^User click on the Cancel button to return on the Edit Employee Screen$")
    public void userClickOnTheCancelButtonToReturnOnTheEditEmployeeScreen() throws Throwable {
        page.clickCancel();
        Thread.sleep(1000);
    }

    @When("^User should click on the Notes$")
    public void userShouldClickOnTheNotes() throws Throwable {
        page.clickNotes();
        Thread.sleep(1000);
    }

    @And("^User click on the checkbox$")
    public void userClickOnTheCheckbox() throws Throwable {
        page.clickCheckbox();
        Thread.sleep(1000);
    }

    @And("^User click on the Update Button to save update$")
    public void userClickOnTheUpdateButtonToSaveUpdate() throws Throwable {
        page.clickSaveUpdate();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Overtime Bank Text Link$")
    public void userShouldClickOnTheEditOvertimeBankTextLink() throws Throwable {
        page.editOvertimeBankTextLink();
        Thread.sleep(1000);
    }

    @Then("^User should be on the Edit Overtime Bank for Employee Screen$")
    public void userShouldBeOnTheEditOvertimeBankForEmployeeScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User Select the Adjustment Date$")
    public void userSelectTheAdjustmentDate() throws Throwable {
        page.selectAdjustmentDate();
        Thread.sleep(1000);
    }

    @And("^User enter the hours \"([^\"]*)\"$")
    public void userEnterTheHours(String hours) throws Throwable {
        page.enterHours(hours);
        Thread.sleep(1000);
    }

    @And("^User enter the comments \"([^\"]*)\"$")
    public void userEnterTheComments(String comments) throws Throwable {
        page.enterComments(comments);
        Thread.sleep(1000);
    }

    @And("^User click on the Apply and Return button$")
    public void userClickOnTheApplyAndReturnButton() throws Throwable {
        page.clickApplyAndReturnButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Skills Link Text$")
    public void userShouldClickOnTheEditSkillsLinkText() throws Throwable {
        page.clickEditSkills();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Skills Screen$")
    public void userIsOnTheEditSkillsScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User check on the checkboxes to update skills$")
    public void userCheckOnTheCheckboxesToUpdateSkills() throws Throwable {
        page.clickCheckboxes();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to update Skills$")
    public void userClickOnTheUpdateButtonToUpdateSkills() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Qualifications Link Text$")
    public void userShouldClickOnTheEditQualificationsLinkText() throws Throwable {
        page.clickEditQualifications();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Qualifications Screen$")
    public void userIsOnTheEditQualificationsScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User click on the Add New Qualification Link Text$")
    public void userClickOnTheAddNewQualificationLinkText() throws Throwable {
        page.clickAddNewQualification();
        Thread.sleep(1000);
    }

    @Then("^User is on the Add Qualification Screen$")
    public void userIsOnTheAddQualificationScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User click on the Code Dropdown to select the code$")
    public void userClickOnTheCodeDropdownToSelectTheCode() throws Throwable {
        page.clickCodeDropdown();
        Thread.sleep(1000);
    }

    @And("^User click on the Add Button to add Qualification$")
    public void userClickOnTheAddButtonToAddQualification() throws Throwable {
        page.clickAddButton();
        Thread.sleep(1000);
    }

    @When("^User click on the Edit New Qualification Link Text$")
    public void userClickOnTheEditNewQualificationLinkText() throws Throwable {
        page.clickEditNewQualification();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Qualification Screen$")
    public void userIsOnTheEditQualificationScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User click on the remove button to remove Qualification$")
    public void userClickOnTheRemoveButtonToRemoveQualification() throws Throwable {
        page.clickRemoveButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Trade Work Groups Link Text$")
    public void userShouldClickOnTheEditTradeWorkGroupsLinkText() throws Throwable {
        page.clickEditTradeWorkGroups();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Trade Work Groups Screen$")
    public void userIsOnTheEditTradeWorkGroupsScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User select from the Available group$")
    public void userSelectFromTheAvailableGroup() throws Throwable {
        page.selectAvailableGroups();
        page.clickShiftButton();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to update Trade Work Group$")
    public void userClickOnTheUpdateButtonToUpdateTradeWorkGroup() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to update Pay Rate$")
    public void userClickOnTheUpdateButtonToUpdatePayRate() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to update Job Title$")
    public void userClickOnTheUpdateButtonToUpdateJobTitle() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @And("^User click on the Employees tab$")
    public void userClickOnTheEmployeesTab() throws Throwable {
        page.clickEmployeesTab();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Pay Rate Link Text$")
    public void userShouldClickOnTheEditPayRateLinkText() throws Throwable {
        page.clickEditPayRate();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Pay Rate Screen$")
    public void userIsOnTheEditPayRateScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User enter the Pay Rate \"([^\"]*)\"$")
    public void userEnterThePayRate(String payRate) throws Throwable {
        page.enterPayRate(payRate);
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Job Title Link Text$")
    public void userShouldClickOnTheEditJobTitleLinkText() throws Throwable {
        page.clickEditJobTitle();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Job Title Screen$")
    public void userIsOnTheEditJobTitleScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User select Job Title from the dropdown$")
    public void userSelectJobTitleFromTheDropdown() throws Throwable {
        page.selectJobTitle();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Employee Status Link Text$")
    public void userShouldClickOnTheEditEmployeeStatusLinkText() throws Throwable {
        page.clickEditEmployeeStatus();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Employee Status Screen$")
    public void userIsOnTheEditEmployeeStatusScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User select Employee Status from the dropdown$")
    public void userSelectEmployeeStatusFromTheDropdown() throws Throwable {
        page.selectEmployeeStatus();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to update Employee Status$")
    public void userClickOnTheUpdateButtonToUpdateEmployeeStatus() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Employee Cost Center Link Text$")
    public void userShouldClickOnTheEditEmployeeCostCenterLinkText() throws Throwable {
        page.clickEditEmployeeCostCenter();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Employee Cost Center Screen$")
    public void userIsOnTheEditEmployeeCostCenterScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User select Employee Cost Center from the dropdown$")
    public void userSelectEmployeeCostCenterFromTheDropdown() throws Throwable {
        page.CostCenter();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to update Employee Cost Center$")
    public void userClickOnTheUpdateButtonToUpdateEmployeeCostCenter() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Cross-Trained Departments Link Text$")
    public void userShouldClickOnTheEditCrossTrainedDepartmentsLinkText() throws Throwable {
        page.clickEditCrossTrained();
        Thread.sleep(1000);
    }

    @Then("^User is on the View Cross-Trained Departments Screen$")
    public void userIsOnTheViewCrossTrainedDepartmentsScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User click on the Done button to update Cross-Trained Departments$")
    public void userClickOnTheDoneButtonToUpdateCrossTrainedDepartments() throws Throwable {
        page.clickDoneButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the View Dependability History Link Text$")
    public void userShouldClickOnTheViewDependabilityHistoryLinkText() throws Throwable {
        page.clickViewDependabilityHistory();
        Thread.sleep(1000);
    }

    @Then("^User is on the View Dependability History Screen$")
    public void userIsOnTheViewDependabilityHistoryScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User click on the Done button to update View Dependability History$")
    public void userClickOnTheDoneButtonToUpdateViewDependabilityHistory() throws Throwable {
        page.clickDoneButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Employee Schedule Availability Link Text$")
    public void userShouldClickOnTheEditEmployeeScheduleAvailabilityLinkText() throws Throwable {
        page.clickEditEmployeeSchedule();
        Thread.sleep(1000);
    }

    @Then("^User is on the Availability Patterns Screen$")
    public void userIsOnTheAvailabilityPatternsScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User click on the View Link Text$")
    public void userClickOnTheViewLinkText() throws Throwable {
        page.clickViewLink();
        Thread.sleep(1000);
    }

    @And("^User click on the Return Button$")
    public void userClickOnTheReturnButton() throws Throwable {
        page.clickReturnButton();
        Thread.sleep(1000);
    }

    @And("^User click on the Done button to return on the Edit Employee Screen$")
    public void userClickOnTheDoneButtonToReturnOnTheEditEmployeeScreen() throws Throwable {
        page.clickDoneButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Rule Sets Link Text$")
    public void userShouldClickOnTheEditRuleSetsLinkText() throws Throwable {
        page.clickEditRuleSets();
        Thread.sleep(1000);
    }

    @Then("^User is on the Edit Rule Sets Screen$")
    public void userIsOnTheEditRuleSetsScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User select Shift Rule Set$")
    public void userSelectShiftRuleSet() throws Throwable {
        page.selectShiftRuleSets();
        Thread.sleep(1000);
    }

    @And("^User select PTO Rule Set$")
    public void userSelectPTORuleSet() throws Throwable {
        page.selectPTORuleSets();
        Thread.sleep(1000);
    }

    @And("^User select UTO Rule Set$")
    public void userSelectUTORuleSet() throws Throwable {
        page.selectUTORuleSets();
        Thread.sleep(1000);
    }

    @And("^User select VTO Slot Rule Set$")
    public void userSelectVTOSlotRuleSet() throws Throwable {
        page.selectVTOSlotRuleSets();
        Thread.sleep(1000);
    }

    @And("^User select Dependability Rule Set$")
    public void userSelectDependabilityRuleSet() throws Throwable {
        page.selectDependabilityRuleSets();
        Thread.sleep(1000);
    }

    @And("^User click on the Update button to Update Rule Sets$")
    public void userClickOnTheUpdateButtonToUpdateRuleSets() throws Throwable {
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Employee to terminate$")
    public void userShouldClickOnTheEditEmployeeToTerminate() throws Throwable {
        page.clickEditEmployeeToTerminate();
        Thread.sleep(1000);
    }

    @When("^User should click on the Terminate Employee Link Text$")
    public void userShouldClickOnTheTerminateEmployeeLinkText() throws Throwable {
        page.clickTerminateEmployeeLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Terminate Employee Screen$")
    public void userIsOnTheTerminateEmployeeScreen() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^User select the status of the employee termination$")
    public void userSelectTheStatusOfTheEmployeeTermination() throws Throwable {
        page.selectStatusOfTheEmployeeTermination();
        Thread.sleep(1000);
    }

    @And("^User click on the Terminate Button$")
    public void userClickOnTheTerminateButton() throws Throwable {
        page.clickTerminateButton();
        Thread.sleep(1000);
        Web_Driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }
}