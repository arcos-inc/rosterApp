package Steps;

import Base.BaseUtil;
import Pages.DepartmentPage;
import Pages.SkillsPage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepartmentSD extends BaseUtil {

    private BaseUtil baseUtil;
    DepartmentPage departmentPage;
    Helper help;

    public DepartmentSD (BaseUtil baseUtil){
        departmentPage = new DepartmentPage(Web_Driver);
        help = new Helper();
        this.baseUtil = baseUtil;
    }

    @When("^User see the Departments Tab$")
    public void userSeeTheDepartmentsTab() throws Throwable {

        System.out.println("User see the Departments Tab");
    }

    @Then("^User should click on the Departments Tab$")
    public void userShouldClickOnTheDepartmentsTab() throws Throwable {

        System.out.println("User should click on the Departments Tab");
        departmentPage.clickOnDepartmentsTab();
        Thread.sleep(1000);
    }

    @When("^User is on the Departments Screen$")
    public void userIsOnTheDepartmentsScreen() throws Throwable {

        System.out.println("User is on the Departments Screen");
    }

    @Then("^User click on the Create New Department$")
    public void userClickOnTheCreateNewDepartment() throws Throwable {

        System.out.println("User click on the Create New Department");
        departmentPage.createNewDepartment();
        Thread.sleep(1000);
    }

    @When("^User is on the New Department Screen$")
    public void userIsOnTheNewDepartmentScreen() throws Throwable {

        System.out.println("User is on the New Department Screen");
    }

    @And("^User enter the Department Name$")
    public void userEnterTheDepartmentName() throws Throwable {

        System.out.println("User enter the Department Name");
        departmentPage.enterDepartmentName(help.generateDepartments() + " " + help.randomString(2));
        Thread.sleep(1000);
    }

    @And("^User enter the Department Description \"([^\"]*)\"$")
    public void userEnterTheDepartmentDescription(String deptDescription) throws Throwable {

        System.out.println("User enter the Department Description");
        departmentPage.enterDepartmentDescription(deptDescription);
        Thread.sleep(1000);
    }

    @And("^User check the Allowed for Transfer Bidding checkbox$")
    public void userCheckTheAllowedForTransferBiddingCheckbox() throws Throwable {

        System.out.println("User check the Allowed for Transfer Bidding checkbox");
        departmentPage.clickAllowedForTransferBiddingCheckbox();
        Thread.sleep(1000);
    }

    @And("^User check the Is Active checkbox$")
    public void userCheckTheIsActiveCheckbox() throws Throwable {

        System.out.println("User check the Is Active checkbox");
        departmentPage.clickIsActiveCheckbox();
        Thread.sleep(1000);
    }

    @Then("^User click on the Save Button$")
    public void userClickOnTheSaveButton() throws Throwable {

        System.out.println("User click on the Save Button");
        departmentPage.clickSaveButton();
        Thread.sleep(1000);
    }

    @Then("^User click on the Edit Department$")
    public void userClickOnTheEditDepartment() throws Throwable {

        System.out.println("User click on the Edit Department");
        departmentPage.clickEditLinkText();
        Thread.sleep(1000);
    }

    @When("^User is on the Edit Department Screen$")
    public void userIsOnTheEditDepartmentScreen() throws Throwable {

        System.out.println("User is on the Edit Department Screen");
    }
}
