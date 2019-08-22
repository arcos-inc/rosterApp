package Steps;

import Base.BaseUtil;
import Pages.AccrualAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccrualAccountSD extends BaseUtil {

    private BaseUtil base;
    AccrualAccountPage accrualAccountPage;

    public AccrualAccountSD(BaseUtil base){
        accrualAccountPage = new AccrualAccountPage(Web_Driver);
        this.base = base;
    }

    @Then("^User should click on the Accrual Accounts$")
    public void userShouldClickOnTheAccrualAccounts() throws Throwable {

        System.out.println("User should click on the Accrual Accounts");
        accrualAccountPage.clickAccrualAccount();
        Thread.sleep(1000);
    }

    @When("^User is on the Accrual Accounts Screen$")
    public void userIsOnTheAccrualAccountsScreen() throws Throwable {

        System.out.println("User is on the Accrual Accounts Screen");
    }

    @Then("^User click on the All link text$")
    public void userClickOnTheAllLinkText() throws Throwable {

        System.out.println("User click on the All link text");
        accrualAccountPage.clickOnAllLinkText();
        Thread.sleep(1000);
    }

    @And("^User click on the None link text$")
    public void userClickOnTheNoneLinkText() throws Throwable {

        System.out.println("User click on the None link text");
        accrualAccountPage.clickOnNoneLinkText();
        Thread.sleep(1000);
    }

    @And("^User check on the Accrual Accounts checkbox$")
    public void userCheckOnTheAccrualAccountsCheckbox() throws Throwable {

        System.out.println("User check on the Accrual Accounts checkbox");
        accrualAccountPage.clickOnAccrualAccountsCheckbox();
        Thread.sleep(1000);
    }

    @Then("^User click on the Update Button to Update Accrual Account$")
    public void userClickOnTheUpdateButtonToUpdateAccrualAccount() throws Throwable {

        System.out.println("User click on the Update Button to Update Accrual Account");
        accrualAccountPage.clickOnUpdateButton();
        Thread.sleep(1000);
    }

    @Then("^User click on the Update Button to Cancel Accrual Account$")
    public void userClickOnTheUpdateButtonToCancelAccrualAccount() throws Throwable {

        System.out.println("User click on the Update Button to Cancel Accrual Account");
        accrualAccountPage.clickOnCancelButton();
        Thread.sleep(1000);
    }
}
