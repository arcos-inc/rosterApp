package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.LoginPage;
import cucumber.api.DataTable;
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
    //LoginPage page;

    public LoginSD(BaseUtil base) {
        this.base = base;
        //page = new LoginPage(base.Web_Driver);
    }

    @Given("^User is on Application Login Page$")
    public void userIsOnApplicationLoginPage() {
        configFileReader = new ConfigFileReader();
        Web_Driver.navigate().to(configFileReader.getApplicationUrl());
        Web_Driver.manage().window().maximize();
        Web_Driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        System.out.println("Application launch successfully...");
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
    public void userShouldClickOnAdminLoginDropDown() {
        LoginPage page = new LoginPage(Web_Driver);
        page.ClickAdminRole();
    }

    @And("^User select role as a Company Admin$")
    public void userShouldRoleAsACompanyAdmin() {
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectCompanyAdminRole();
    }

    @And("^User click on login button$")
    public void iClickLoginButton() {
        LoginPage page = new LoginPage(Web_Driver);
        page.ClickLogin();
    }

    @Then("^User is on Application home page$")
    public void userIsOnApplicationHomePage() {
        System.out.println("Welcome to ARCOS-RosterApp Home Page");
    }

    @And("^User select role as a Location Admin$")
    public void userSelectRoleAsALocationAdmin() {
        LoginPage page = new LoginPage(Web_Driver);
        page.SelectLocationAdminRole();
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

    public class User {
        public String username;
        public String password;

        public User(String userName, String password) {
            this.username = username;
            this.password = password;
        }
    }
}