package Steps;

import Base.BaseUtil;
import Pages.FilterEmployeesPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ser.Serializers;

import java.util.concurrent.TimeUnit;

public class FilterEmployeesSD extends BaseUtil {

    private BaseUtil base;
    FilterEmployeesPage filterEmployeesPage;

    public FilterEmployeesSD(BaseUtil base){
        filterEmployeesPage = new FilterEmployeesPage(Web_Driver);
        this.base = base;
    }

    @Given("^User Should select Acting roles as Loc Admin$")
    public void userShouldSelectActingRolesAsLocAdmin() throws Throwable {
        filterEmployeesPage.GetLocationURL();
        Web_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^User is on the Employees Screen$")
    public void userIsOnTheEmployeesScreen() throws Throwable {

        System.out.println("User is on the Employees Screen");
        Thread.sleep(1000);
    }

    @And("^User is on the Employees Screen Again$")
    public void userIsOnTheEmployeesScreenAgain() throws Throwable {
        System.out.println("User is on the Employees Screen Again");
        Thread.sleep(1000);
    }

    @Then("^User should click on the Filter Dropdown to select all employees$")
    public void userShouldClickOnTheFilterDropdownToSelectAllEmployees() throws Throwable {

        System.out.println("User should click on the Filter Dropdown to select all employees");
        filterEmployeesPage.clickFilterDropdown();
        Thread.sleep(1000);
    }

    @Then("^User should click on the Filter Dropdown to select Active employees$")
    public void userShouldClickOnTheFilterDropdownToSelectActiveEmployees() throws Throwable {

        System.out.println("");
        filterEmployeesPage.clickActiveFilterDropdown();
        Thread.sleep(1000);
    }

    @Then("^User should click on the Filter Dropdown to select Inactive employees$")
    public void userShouldClickOnTheFilterDropdownToSelectInactiveEmployees() throws Throwable {

        System.out.println("");
        filterEmployeesPage.clickInactiveFilterDropdown();
        Thread.sleep(1000);
    }

    @And("^User should click on the Workgroup Dropdown$")
    public void userShouldClickOnTheWorkgroupDropdown() throws Throwable {

        System.out.println("User should click on the Workgroup Dropdown");
        filterEmployeesPage.clickWorkgroupDropdown();
        Thread.sleep(1000);
    }

    @And("^User enter the Employee Name \"([^\"]*)\"$")
    public void userEnterTheEmployeeName(String name) throws Throwable {

        System.out.println("User enter the Employee Name");
        filterEmployeesPage.enterEmployeeName();
        Thread.sleep(1000);
    }
}
