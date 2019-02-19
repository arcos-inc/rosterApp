package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class LoginSD extends BaseUtil {


    private BaseUtil base;
    //LoginPage page;

    public LoginSD(BaseUtil base) {
        this.base = base;
        //page = new LoginPage(base.Web_Driver);
    }

    @Given("^User is on Application Login Page$")
    public void userIsOnApplicationLoginPage() throws Throwable {
        base.Web_Driver.navigate().to("http://localhost/RosterAppDebug/Login.aspx");
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

    public class User {
        public String username;
        public String password;

        public User(String userName, String password) {
            this.username = username;
            this.password = password;
        }
    }
}