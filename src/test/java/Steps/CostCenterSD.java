package Steps;

import Base.BaseUtil;
import Pages.CostCenterPage;
import Utilities.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostCenterSD extends BaseUtil {

    private BaseUtil base;
    CostCenterPage costCenterPage;
    Helper help;

    public CostCenterSD(BaseUtil base){
        costCenterPage = new CostCenterPage(Web_Driver);
        help = new Helper();
        this.base = base;
    }

    @When("^User see the Cost Centers Tab$")
    public void userSeeTheCostCentersTab() throws Throwable {

        System.out.println("User see the Cost Centers Tab");
        Thread.sleep(1000);
    }

    @And("^User click on the Cost Centers link text$")
    public void userClickOnTheCostCentersLinkText() throws Throwable {

        System.out.println("User click on the Cost Centers link text");
        costCenterPage.clickCostCentersLinkText();
        Thread.sleep(1000);
    }

    @Then("^User is on the Cost Centers Screen$")
    public void userIsOnTheCostCentersScreen() throws Throwable {

        System.out.println("User is on the Cost Centers Screen");
        Thread.sleep(1000);
    }

    @When("^User should click on the Create New Cost Centers$")
    public void userShouldClickOnTheCreateNewCostCenters() throws Throwable {

        System.out.println("User should click on the Create New Cost Centers");
        costCenterPage.clickCreateNewCostCenters();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Cost Centers Screen$")
    public void userIsOnTheNewCostCentersScreen() throws Throwable {

        System.out.println("User is on the New Cost Centers Screen");
        Thread.sleep(1000);
    }

    @And("^User enter the Cost Center Name$")
    public void userEnterTheCostCenterName() throws Throwable {

        System.out.println("User enter the Cost Center Name");
        costCenterPage.enterCostCenterName(help.generateCostCenter());
        Thread.sleep(1000);
    }

    @And("^User enter the Cost Center Description \"([^\"]*)\"$")
    public void userEnterTheCostCenterDescription(String enterCostCenterDesc) throws Throwable {

        System.out.println("User enter the Cost Center Description");
        costCenterPage.enterCostCenterDescription(enterCostCenterDesc);
        Thread.sleep(1000);
    }

    @And("^User enter the Display Order \"([^\"]*)\"$")
    public void userEnterTheDisplayOrder(String enterDispOrder) throws Throwable {

        System.out.println("User enter the Display Order");
        costCenterPage.enterDisplayOrder(enterDispOrder);
        Thread.sleep(1000);
    }

    @And("^User check on the Is Active Checkbox on Cost Center Screen$")
    public void userCheckOnTheIsActiveCheckboxOnCostCenterScreen() throws Throwable {

        System.out.println("User check on the Is Active Checkbox on Cost Center Screen");
        costCenterPage.checkIsActive();
        Thread.sleep(1000);
    }

    @Then("^User click on the Save Button to Add Cost Center$")
    public void userClickOnTheSaveButtonToAddCostCenter() throws Throwable {

        System.out.println("User click on the Save Button to Add Cost Center");
        costCenterPage.clickSaveButton();
        Thread.sleep(1000);
    }

    @When("^User should click on the Edit Cost Centers$")
    public void userShouldClickOnTheEditCostCenters() throws Throwable {

        System.out.println("User should click on the Edit Cost Centers");
        costCenterPage.clickEditButton();
        Thread.sleep(1000);
    }
}
