package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class LoginSD extends BaseUtil {


    private BaseUtil base;

    public LoginSD(BaseUtil base) {
        this.base = base;
    }

    @Given("^User is on Application Login Page$")
    public void userIsOnApplicationLoginPage() throws Throwable {
        base.Web_Driver.navigate().to("http://test.rosterapps.com/Login.aspx");
        base.Web_Driver.manage().window().maximize();

        System.out.println("Application launch successfully...");
    }

    @And("^I enter the following details for login$")
    public void iEnterTheFollowingDetailsForLogin(DataTable table) throws Throwable {
        System.out.println("Entering Login Credentials...");
        /*
        //Create an Array List
        List<User> users = new ArrayList<User>();
        //Store all the Users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.Web_Driver);
        for (User user : users) {
            page.Login(user.username, user.password);
        }
        */
    }

    @And("^User Should select his login role$")
    public void userShouldSelectHisLoginRole() throws Throwable {
        LoginPage page = new LoginPage(base.Web_Driver);
        page.ClickAdminRole();
        page.SelectAdminRole();
    }

    @And("^User click on login button$")
    public void iClickLoginButton() throws Throwable {
        LoginPage page = new LoginPage(base.Web_Driver);
        page.ClickLogin();
    }

    @Then("^User is on Application home page$")
    public void userIsOnApplicationHomePage() throws Throwable {
        System.out.println("Welcome to ARCOS-RosterApp Home Page");
    }

    @And("^User Should select Acting role$")
    public void userShouldSelectActingRole() throws Throwable {
        LoginPage page = new LoginPage(base.Web_Driver);
        page.GetLocationlabel(base.Web_Driver);

        Thread.sleep(5000);
    }

    @When("^user should see the Location Tab$")
    public void userShouldSeeTheUserTab() throws Throwable {
/*        System.out.println("Check the flow");

        WebElement element = (new WebDriverWait(base.Web_Driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("LOCATIONS")));
        System.out.println("Got the location tab" + element);*/
    }

    @Then("^User click on User Tab$")
    public void userClickOnUserTab() throws Throwable {
/*        LoginPage page = new LoginPage(base.Web_Driver);
        //page.ClickUserTab();
        System.out.println("Clicking on Location TAB");*/
    }

    @Then("^user should see the role management tab$")
    public void userShouldSeeTheRoleManagementTab() throws Throwable {
        /*System.out.println("User Should see the role Management");
        WebElement element = (new WebDriverWait(base.Web_Driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id("mat-tab-label-1-1")));
        System.out.println("FOUND " + element);*/
        //org.junit.Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("mat-tab-label-1-1")).isDisplayed(), true);
    }

    @And("^User click on Role Management$")
    public void userClickOnRoleManagement() throws Throwable {
/*        LoginPage page = new LoginPage(base.Web_Driver);
        page.ClickRoleManagement();
        System.out.println("Clicking on Role Management Button");*/
    }

    @Then("^user should see the Add Role button$")
    public void userShouldSeeTheAddRoleButton() throws Throwable {
/*        System.out.println("Clicking on Add Role button");
        WebElement element = (new WebDriverWait(base.Web_Driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-tab-content-1-1\"]/div/role-management/div/div[1]/div[1]/div/button")));*/
        //org.junit.Assert.assertEquals("Its not displayed", base.Driver.findElement(By.xpath("//*[@id=\"mat-tab-content-1-1\"]/div/role-management/div/div[1]/div[1]/div/button")).isDisplayed(), true);
    }

    @And("^User click on Add Role button$")
    public void userClickOnAddRoleButton() throws Throwable {
/*        LoginPage page = new LoginPage(base.Web_Driver);
        page.ClickAddRole();*/
    }

    @Then("^user should see the text box to enter role name$")
    public void userShouldSeeTheTextBoxToEnterRoleName() throws Throwable {
/*        System.out.println("Clicking into the text box");
        WebElement element = (new WebDriverWait(base.Web_Driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[starts-with(@id,'mat-input-')]")));*/
    }

    @And("^User enters \"([^\"]*)\" in a Text field$")
    public void userEntersInATextField(String roleName) throws Throwable {
/*        LoginPage page = new LoginPage(base.Web_Driver);
        page.WriteRoleName(roleName);*/
    }

    @And("^Press Save button to add new role$")
    public void pressSaveButtonToAddNewRole() throws Throwable {
/*        LoginPage page = new LoginPage(base.Web_Driver);
        page.ClickSaveRole();*/
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
