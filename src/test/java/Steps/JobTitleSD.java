package Steps;

import Base.BaseUtil;
import Pages.JobTitlePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class JobTitleSD extends BaseUtil {

    private BaseUtil base;
    JobTitlePage page;

    public JobTitleSD(BaseUtil base) {
        page = new JobTitlePage(Web_Driver);
        this.base = base;
    }

    @Given("^User is on Job Titles Tab$")
    public void userIsOnJobTitlesTab() {
        Web_Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("User Should Click on Job Title Tab");
        page.clickOnJobTitleTab();
    }

    @When("^User click on create new Job Title$")
    public void userClickOnCreateNewJobTitle() throws InterruptedException {
        System.out.println("User Click on Create New Job Title");
        page.clickOnCreateNewJobTitle();
        Thread.sleep(1000);
    }

    @Then("^User should see the New Job Title Window$")
    public void userShouldSeeTheNewJobTitleWindow() throws Throwable {
        System.out.println("User Should See the New Job Title Window");
        page.getNewJobTitleTitleLable();
        Thread.sleep(1000);
    }

    @And("^User should enter the Short Description \"([^\"]*)\"$")
    public void userShouldEnterTheShortDescription(String shortDescription) throws Throwable {
        System.out.println("User Should enter the short description");
        page.enterShortDescription(shortDescription);
        Thread.sleep(1000);
    }

    @And("^User should enter the Description \"([^\"]*)\"$")
    public void userShouldEnterTheDescription(String longDescription) throws Throwable {
        System.out.println("User Should enter the description");
        page.enterLongDescription(longDescription);
        Thread.sleep(1000);
    }

    @And("^User should select the Department$")
    public void userShouldSelectTheDepartment() throws Throwable {
        System.out.println("User Should select the department");
        page.selectDepartment();
        Thread.sleep(1000);
    }

    @And("^User click on Add Job Title button$")
    public void userClickOnAddJobTitleButton() throws Throwable {
        System.out.println("User Should Click on Add Job Title Button");
        page.clickOnAddButton();
        Thread.sleep(1000);
    }
}
