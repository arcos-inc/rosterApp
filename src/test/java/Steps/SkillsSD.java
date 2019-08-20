package Steps;

import Base.BaseUtil;
import Pages.LocationPage;
import Pages.SkillsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Base.BaseUtil.Web_Driver;

public class SkillsSD  extends BaseUtil {

    private BaseUtil baseUtil;
    SkillsPage skillsPage;

    public SkillsSD (BaseUtil baseUtil){
        skillsPage = new SkillsPage(Web_Driver);
        this.baseUtil = baseUtil;
    }

    @When("^User see the Skills Tab$")
    public void userSeeTheSkillsTab() throws Throwable {

        System.out.println("Check Add Location Tab");
    }

    @Then("^User should click on Skills Tab$")
    public void userShouldClickOnSkillsTab() throws Throwable {

        System.out.println("User should click on Skills Tab");
        skillsPage.clickOnSkillsTab();
        Thread.sleep(1000);
    }

    @When("^User is on the Skills Screen$")
    public void userIsOnTheSkillsScreen() throws Throwable {

        System.out.println("User is on the Skills Screen");
    }

    @Then("^User click on the Create New Skill$")
    public void userClickOnTheCreateNewSkill() throws Throwable {

        System.out.println("");
        skillsPage.createNewSkill();
        Thread.sleep(1000);
    }

    @When("^User is on the New Skill Screen$")
    public void userIsOnTheNewSkillScreen() throws Throwable {

        System.out.println("");
    }

    @And("^User enter the code \"([^\"]*)\"$")
    public void userEnterTheCode(String code) throws Throwable {

        System.out.println("User enter the code");
        skillsPage.enterCode(code);
        Thread.sleep(1000);
    }

    @And("^User enter the description \"([^\"]*)\"$")
    public void userEnterTheDescription(String description) throws Throwable {

        System.out.println("User enter the description");
        skillsPage.enterDescription(description);
        Thread.sleep(1000);
    }

    @And("^User enter the third party code \"([^\"]*)\"$")
    public void userEnterTheThirdPartyCode(String partyCode) throws Throwable {

        System.out.println("User enter the third party code");
        skillsPage.enterPartyCode(partyCode);
        Thread.sleep(1000);
    }

    @Then("^User click on the Add Button$")
    public void userClickOnTheAddButton() throws Throwable {

        System.out.println("User click on the Add Button");
        skillsPage.addBtn();
        Thread.sleep(1000);
    }

    @Then("^User click on the Edit Link Text$")
    public void userClickOnTheEditLinkText() throws Throwable {

        System.out.println("");
        skillsPage.clickEditLinkText();
        Thread.sleep(1000);
    }

    @Then("^User click on the Update Button to Update Skill$")
    public void userClickOnTheUpdateButtonToUpdateSkill() throws Throwable {

        System.out.println("User click on the Update Button to Update Skill");
        skillsPage.addBtn();
        Thread.sleep(1000);
    }

    @And("^User select Active Skills from dropdown$")
    public void userSelectActiveSkillsFromDropdown() throws Throwable {

        System.out.println("User select Active Skills from dropdown");
        skillsPage.activeSkills();
        Thread.sleep(1000);
    }

    @And("^User select Inactive Skills from dropdown$")
    public void userSelectInactiveSkillsFromDropdown() throws Throwable {

        System.out.println("User select Inactive Skills from dropdown");
        skillsPage.inactiveSkills();
        Thread.sleep(1000);
    }

    @Then("^User click on the Filter Button$")
    public void userClickOnTheFilterButton() throws Throwable {

        System.out.println("User click on the Filter Button");
        skillsPage.filterButton();
        Thread.sleep(1000);
    }
}
