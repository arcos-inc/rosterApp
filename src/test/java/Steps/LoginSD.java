package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.LoginPage;
import com.aventstack.extentreports.GherkinKeyword;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginSD extends BaseUtil {


    private BaseUtil base;
    ConfigFileReader configFileReader;
//    LoginPage page;

    public LoginSD(BaseUtil base) {
//        page = new LoginPage(Web_Driver);
        this.base = base;
    }

    @Given("^User is on Application Login Page$")
    public void userIsOnApplicationLoginPage() throws Throwable {
        scenarioDef.createNode(new GherkinKeyword("Given"), "User is on Application Login Page");
        configFileReader = new ConfigFileReader();
        Web_Driver.navigate().to(configFileReader.getApplicationUrl());
        Web_Driver.manage().window().maximize();
        Web_Driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        System.out.println("Application launch successfully...");
        Thread.sleep(1000);
    }

    @And("^I enter the following details for login$")
    public void iEnterTheFollowingDetailsForLogin(DataTable table) {
        System.out.println("Entering Login Credentials...");
        LoginPage page = new LoginPage(Web_Driver);
        //Create an Array List
        List<User> users = new ArrayList<User>();
        //Store all the Users
        users = table.asList(User.class);

        for (User user : users) {
            page.Login(user.username, user.password);
        }
    }

    @When("^User click on Admin Login DropDown$")
    public void userShouldClickOnAdminLoginDropDown() throws Throwable{
        scenarioDef.createNode(new GherkinKeyword("When"), "User click on Admin Login DropDown");
        LoginPage page = new LoginPage(Web_Driver);
        page.ClickAdminRole();
        Thread.sleep(1000);
    }

    @And("^User select role as a Company Admin$")
    public void userShouldRoleAsACompanyAdmin() throws Throwable{
        scenarioDef.createNode(new GherkinKeyword("And"), "User select role as a Company Admin");
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectCompanyAdminRole();
    }

    @And("^User click on login button$")
    public void iClickLoginButton() throws Throwable{
        scenarioDef.createNode(new GherkinKeyword("And"), "User click on login button");
        LoginPage page = new LoginPage(Web_Driver);
        page.ClickLogin();
        Thread.sleep(1000);
    }

    @Then("^User is on Application home page$")
    public void userIsOnApplicationHomePage() throws Throwable{
        scenarioDef.createNode(new GherkinKeyword("Then"), "User is on Application home page");
        System.out.println("Welcome to ARCOS-RosterApp Home Page");
        Thread.sleep(1000);
    }

    @And("^User select role as a Location Admin$")
    public void userSelectRoleAsALocationAdmin() throws InterruptedException {
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectLocationAdminRole();
        Thread.sleep(1000);
    }

    @And("^User select role as a Supervisor$")
    public void userSelectRoleAsASupervisor() {
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectSupervisorRole();
    }

    @And("^User select role as a Employee$")
    public void userSelectRoleAsAEmployee() {
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectEmployeeRole();
    }

    @And("^User should select Admin User$")
    public void userShouldSelectAdminUser() throws Throwable{
        scenarioDef.createNode(new GherkinKeyword("And"), "User should select Admin User");
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectUser();
    }

    @And("^User click on the Location$")
    public void userClickOnTheLocation() throws Throwable {
        scenarioDef.createNode(new GherkinKeyword("And"), "User click on the Location");
        System.out.println("User click on the Location");
        LoginPage page = new LoginPage(Web_Driver);
        page.clickLocation();
        Thread.sleep(1000);
    }

    @And("^User select location$")
    public void userSelectLocation() throws Throwable {
        scenarioDef.createNode(new GherkinKeyword("And"), "User select location");
        System.out.println("User select location");
        LoginPage page = new LoginPage(Web_Driver);
        page.selectLocation();
        Thread.sleep(1000);
    }

    public class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}