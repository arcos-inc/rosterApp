package Steps;

import Base.BaseUtil;
import Pages.WorkGroupPage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkGroupSD extends BaseUtil {

    private BaseUtil base;
    WorkGroupPage page;
    Helper help;

    public WorkGroupSD(BaseUtil base) {
        page = new WorkGroupPage(Web_Driver);
        help = new Helper();
        this.base = base;
    }

    @When("^User see the Work Group Tab$")
    public void userSeeTheWorkGroupTab() throws Throwable{
        System.out.println("Check Work Group Tab");
        page.clickWorkGroupTab();
        Thread.sleep(1000);
    }

    @Then("^User should click on Create New Work Group$")
    public void userShouldClickOnCreateNewWorkGroup() throws Throwable {
        System.out.println("Click on Create New Work Group");
        page.clickCreateNewWorkGroup();
        Thread.sleep(1000);
    }

    @And("^User should enter work group$")
    public void userShouldEnterWorkGroup() throws Exception {
        System.out.println("Entering Work Group Name");
        page.enterWorkGroupName(help.randomString(5));
        Thread.sleep(1000);
    }

    @And("^User should enter work group description \"([^\"]*)\"$")
    public void userShouldEnterWorkGroupDescription(String description) throws Exception {
        System.out.println("Entering Work Group Description");
        page.enterWorkGroupDescription(description);
        Thread.sleep(1000);
    }

    @And("^User should select the Seniority Rule$")
    public void userShouldSelectTheSeniorityRule() throws Exception {
        System.out.println("Selecting Seniority Rule");
        page.clickSeniorityRule();
        page.selectSeniorityRule();
        Thread.sleep(1000);
    }

    @And("^User should select the Shift Rule Set$")
    public void userShouldSelectTheShiftRuleSet() throws Exception {
        System.out.println("Selecting Shift Rule Set");
        page.clickShiftRuleSet();
        page.selectShiftRuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the PTO Rule Set$")
    public void userShouldSelectThePTORuleSet() throws Throwable {
        System.out.println("Selecting PTO Rule Set");
        page.clickPTORuleSet();
        page.selectPTORuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the UTO Rule Set$")
    public void userShouldSelectTheUTORuleSet() throws Throwable {
        System.out.println("Selecting UTO Rule Set");
        page.clickUTORuleSet();
        page.selectUTORuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the VTO Slot Rule Set$")
    public void userShouldSelectTheVTOSlotRuleSet() throws Throwable {
        System.out.println("Selecting VTO Slot Rule Set");
        page.clickVTOSlotRuleSet();
        page.selectVTOSlotRuleSet();
        Thread.sleep(1000);
    }

    @And("^User should select the Add Button$")
    public void userShouldSelectTheAddButton() throws Throwable{
        System.out.println("Clicking Add Button");
        page.clickAddButton();
        Thread.sleep(1000);
    }

    @Then("^User should click on Edit Work Group$")
    public void userShouldClickOnEditWorkGroup() throws Throwable {
        System.out.println("User should click on Edit Work Group");
        page.clickEditLinkText();
        Thread.sleep(1000);
    }

    @And("^User should select the Update Button$")
    public void userShouldSelectTheUpdateButton() throws Throwable {
        System.out.println("User should select the Update Button");
        page.clickUpdateBtn();
        Thread.sleep(1000);
    }

    @And("^User should select the Cancel Button$")
    public void userShouldSelectTheCancelButton() throws Throwable {
        System.out.println("User should select the Cancel Button");
        page.clickCancelBtn();
        Thread.sleep(1000);
    }

    @Then("^User should click on Hide Inactive Work Group$")
    public void userShouldClickOnHideInactiveWorkGroup() throws Throwable {
        System.out.println("User should click on Hide Inactive Work Group");
        page.checkHideInactiveBtn();
        Thread.sleep(1000);
    }

    @Then("^User click on the Add/Remove Skills For Employees$")
    public void userClickOnTheAddRemoveSkillsForEmployees() throws Throwable {
        System.out.println("User click on the Add Skills For Employees");
        page.clickAddSkillsLinkText();
        Thread.sleep(1000);
    }

    @When("^User is on the Add/Remove Skills for Employees$")
    public void userIsOnTheAddRemoveSkillsForEmployees() throws Throwable {
        System.out.println("User is on the Add/Remove Skills for Employees");
        Thread.sleep(1000);
    }

    @And("^User click on the Add Skills Radio Button$")
    public void userClickOnTheAddSkillsRadioButton() throws Throwable {
        System.out.println("User click on the Add Skills Radio Button");
        page.clickAddSkills();
        Thread.sleep(1000);
    }

    @And("^User click on the Remove Skills Radio Button$")
    public void userClickOnTheRemoveSkillsRadioButton() throws Throwable {
        System.out.println("User click on the Remove Skills Radio Button");
        page.clickRemoveSkills();
        Thread.sleep(1000);
    }

    @And("^User select skills$")
    public void userSelectSkills() throws Throwable {
        System.out.println("User select skills");
        page.selectSkills();
        Thread.sleep(1000);
    }

    @And("^User select employees$")
    public void userSelectEmployees() throws Throwable {
        System.out.println("User select employees");
        page.selectEmployee();
        Thread.sleep(1000);
    }

    @Then("^User click on the Submit button$")
    public void userClickOnTheSubmitButton() throws Throwable {
        System.out.println("User click on the Submit button");
        page.clickSubmit();
        Thread.sleep(1000);
    }

    @Given("^User is on the Workgroup Page$")
    public void userIsOnTheWorkgroupPage() throws Throwable {
        System.out.println("User is on the Workgroup Page");
    }

    @When("^User click on the Add/Remove Trade Work Groups For Employees$")
    public void userClickOnTheAddRemoveTradeWorkGroupsForEmployees() throws Throwable {
        System.out.println("User click on the Add/Remove Trade Work Groups For Employees");
        page.clickAddRemoveTradeWork();
        Thread.sleep(1000);
    }

    @Then("^User is on the Add/Remove Trade Work Groups For Employees$")
    public void userIsOnTheAddRemoveTradeWorkGroupsForEmployees() throws Throwable {
        System.out.println("User is on the Add/Remove Trade Work Groups For Employees");
        Thread.sleep(1000);
    }

    @And("^User click on the Add Trade Radio Button$")
    public void userClickOnTheAddTradeRadioButton() throws Throwable {
        System.out.println("User click on the Add Trade Radio Button");
        page.addTradeRadioButton();
        Thread.sleep(1000);
    }

    @And("^User select Date Effective$")
    public void userSelectDateEffective() throws Throwable {
        System.out.println("User select Date Effective");
        page.dateEffective();
        Thread.sleep(1000);
        page.selectDateEffective();
        Thread.sleep(1000);
    }

    @And("^User click on the Remove Trade Radio Button$")
    public void userClickOnTheRemoveTradeRadioButton() throws Throwable {
        System.out.println("User click on the Remove Trade Radio Button");
        page.removeTradeRadioButton();
        Thread.sleep(1000);
    }

    @And("^User select Shift Permissions$")
    public void userSelectShiftPermissions() throws Throwable {
        System.out.println("User select Shift Permissions");
        page.selectShiftPermissions();
        page.clickOnArrow();
        Thread.sleep(1000);
    }

    @When("^User click on the Reset Overtime Bank$")
    public void userClickOnTheResetOvertimeBank() throws Throwable {
        System.out.println("User click on the Reset Overtime Bank");
        page.clickResetOTBank();
        Thread.sleep(1000);
    }

    @Then("^User is on the Reset Overtime Bank$")
    public void userIsOnTheResetOvertimeBank() throws Throwable {
        System.out.println("User is on the Reset Overtime Bank");
        Thread.sleep(1000);
    }

    @When("^User click on the Add Qualifications For Employees$")
    public void userClickOnTheAddQualificationsForEmployees() throws Throwable {
        System.out.println("User click on the Add Qualifications For Employees");
        page.clickAddQualification();
        Thread.sleep(1000);
    }

    @Then("^User is on the Add Qualifications For Employees$")
    public void userIsOnTheAddQualificationsForEmployees() throws Throwable {
        System.out.println("User is on the Add Qualifications For Employees");
        Thread.sleep(1000);
    }

    @Then("^User click on the Update button to add Qualification$")
    public void userClickOnTheUpdateButtonToAddQualification() throws Throwable {
        System.out.println("User click on the Update button to add Qualification");
        page.clickAddBtn();
        Thread.sleep(1000);
    }
}
