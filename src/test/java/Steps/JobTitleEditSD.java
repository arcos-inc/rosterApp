package Steps;

import Base.BaseUtil;
import Pages.JobTitleEditPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobTitleEditSD extends BaseUtil {
    private BaseUtil base;
    JobTitleEditPage page;

    public JobTitleEditSD(BaseUtil base) {
        page = new JobTitleEditPage(base.Web_Driver);
        this.base = base;
    }

    @Given("^User should on Job Title Page$")
    public void userShouldOnJobTitlePage() throws Throwable {
        System.out.println("User should on Job Title Page");
        page.getJobTitleLabel();
    }

    @When("^User click on Edit link of an existing Job Title$")
    public void userClickOnEditLinkOfAnExistingJobTitle() throws Throwable {
    }

    @Then("^User should see the Edit Job Title$")
    public void userShouldSeeTheEditJobTitle() throws Throwable {
    }

    @And("^User should edit existing record$")
    public void userShouldEditExistingRecord() throws Throwable {
    }

    @And("^User should press update button$")
    public void userShouldPressUpdateButton() throws Throwable {
    }
}
