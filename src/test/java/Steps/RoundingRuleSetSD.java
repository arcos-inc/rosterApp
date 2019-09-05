package Steps;

import Base.BaseUtil;
import Pages.RoundingRuleSetPage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class RoundingRuleSetSD extends BaseUtil {

    private BaseUtil base;
    RoundingRuleSetPage roundingRuleSetPage;

    public RoundingRuleSetSD(BaseUtil base){
        roundingRuleSetPage = new RoundingRuleSetPage(Web_Driver);
        this.base = base;
    }

    @When("^User see the Rule Sets Tab$")
    public void userSeeTheRuleSetsTab() throws Throwable {

        System.out.println("User see the Rule Sets Tab");
        Thread.sleep(1000);
    }

    @And("^User click on the Rule Sets link text$")
    public void userClickOnTheRuleSetsLinkText() throws Throwable {

        System.out.println("User click on the Rule Sets link text");
        roundingRuleSetPage.clickOnRuleSetLink();
    }

    @Given("^User is on the Company Rule Sets Screen$")
    public void userIsOnTheCompanyRuleSetsScreen() throws Throwable {

        System.out.println("User is on the Company Rule Sets Screen");
    }

    @When("^User should click on the Create New Rounding Rule Set$")
    public void userShouldClickOnTheCreateNewRoundingRuleSet() throws Throwable {

        System.out.println("User should click on the Create New Rounding Rule Set");
        roundingRuleSetPage.clickOnCreateNewRoundingRuleSet();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Rounding Rule Set Screen$")
    public void userIsOnTheNewRoundingRuleSetScreen() throws Throwable {

        System.out.println("User is on the New Rounding Rule Set Screen");
    }

    @And("^User enter the Rule Set Name \"([^\"]*)\"$")
    public void userEnterTheRuleSetName(String ruleSetName) throws Throwable {

        System.out.println("User enter the Rule Set Name");
        roundingRuleSetPage.enterRuleSetName(ruleSetName);
        Thread.sleep(1000);
    }

    @And("^User enter the Grace Minutes Before Start \"([^\"]*)\"$")
    public void userEnterTheGraceMinutesBeforeStart(String minutesBeforeStart) throws Throwable {

        System.out.println("User enter the Grace Minutes Before Start");
        roundingRuleSetPage.enterMinutesBeforeStart(minutesBeforeStart);
        Thread.sleep(1000);
    }

    @And("^User enter the Grace Minutes After Start \"([^\"]*)\"$")
    public void userEnterTheGraceMinutesAfterStart(String minutesAfterStart) throws Throwable {

        System.out.println("User enter the Grace Minutes After Start");
        roundingRuleSetPage.enterMinutesAfterStart(minutesAfterStart);
        Thread.sleep(1000);
    }

    @And("^User check on the Round All Early In To Schedule$")
    public void userCheckOnTheRoundAllEarlyInToSchedule() throws Throwable {

        System.out.println("User check on the Round All Early In To Schedule");
        roundingRuleSetPage.clickOnRoundAllEarlyInToSchedule();
        Thread.sleep(1000);
    }

    @And("^User select an option from the Round Early In Direction dropdown$")
    public void userSelectAnOptionFromTheRoundEarlyInDirectionDropdown() throws Throwable {

        System.out.println("User select an option from the Round Early In Direction dropdown");
        roundingRuleSetPage.selectRoundEarly();
    }

    @And("^User enter the Rule Set Description \"([^\"]*)\"$")
    public void userEnterTheRuleSetDescription(String ruleSetDescription) throws Throwable {

        System.out.println("User enter the Rule Set Description");
        roundingRuleSetPage.enterRuleSetDescription(ruleSetDescription);
    }

    @Then("^User click on the Add Button to Add Rounding Rule Set$")
    public void userClickOnTheUpdateButtonToUpdateRoundingRuleSet() throws Throwable {

        System.out.println("User click on the Add Button to Add Rounding Rule Set");
        roundingRuleSetPage.clickOnAddButton();
    }

    @When("^User should click on the Edit Rounding Rule Set$")
    public void userShouldClickOnTheEditRoundingRuleSet() throws Throwable {

        System.out.println("User should click on the Edit Rounding Rule Set");
        roundingRuleSetPage.clickEditRounding();
    }

    @Then("^User is on the Edit Rounding Rule Set Screen$")
    public void userIsOnTheEditRoundingRuleSetScreen() throws Throwable {

        System.out.println("User is on the Edit Rounding Rule Set Screen");
    }

    @Then("^User click on the Update Button to Add Rounding Rule Set$")
    public void userClickOnTheUpdateButtonToAddRoundingRuleSet() throws Throwable {

        System.out.println("User click on the Update Button to Add Rounding Rule Set");
        roundingRuleSetPage.clickOnUpdateButton();
    }
}
