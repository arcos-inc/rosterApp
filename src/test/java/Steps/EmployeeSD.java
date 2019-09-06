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

}