package Steps;

import Base.BaseUtil;
import Pages.QualificationsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QualificationsSD extends BaseUtil{

    private BaseUtil base;
    QualificationsPage qualificationsPage;

    public QualificationsSD(BaseUtil base){
        qualificationsPage = new QualificationsPage(Web_Driver);
        this.base = base;
    }

    @When("^User see the Qualifications Tab$")
    public void userSeeTheQualificationsTab() throws Throwable {

        System.out.println("User see the Qualifications Tab");
        Thread.sleep(1000);
    }

    @And("^User click on the Qualifications link text$")
    public void userClickOnTheQualificationsLinkText() throws Throwable {

        System.out.println("User click on the Qualifications link text");
        qualificationsPage.clickQualificationsLink();
        Thread.sleep(1000);
    }

    @Then("^User is on the Qualifications Screen$")
    public void userIsOnTheQualificationsScreen() throws Throwable {

        System.out.println("User is on the Qualifications Screen");
        Thread.sleep(1000);
    }

    @When("^User should click on the Create New Qualification$")
    public void userShouldClickOnTheCreateNewQualification() throws Throwable {

        System.out.println("User should click on the Create New Qualification");
        qualificationsPage.clickCreateNewQualification();
        Thread.sleep(1000);
    }

    @Then("^User is on the New Qualification Screen$")
    public void userIsOnTheNewQualificationScreen() throws Throwable {

        System.out.println("User is on the New Qualification Screen");
        Thread.sleep(1000);
    }

    @And("^User enter the Code for New Qualification \"([^\"]*)\"$")
    public void userEnterTheCodeForNewQualification(String enterCode) throws Throwable {

        System.out.println("User enter the Code for New Qualification");
        qualificationsPage.enterCode(enterCode);
        Thread.sleep(1000);
    }

    @And("^User enter the Description for New Qualification \"([^\"]*)\"$")
    public void userEnterTheDescriptionForNewQualification(String  enterDescription) throws Throwable {

        System.out.println("User enter the Description for New Qualification");
        qualificationsPage.enterDescription(enterDescription);
        Thread.sleep(1000);
    }

    @And("^User enter the Outside Code for New Qualification \"([^\"]*)\"$")
    public void userEnterTheOutsideCodeForNewQualification(String enterOutsideCode) throws Throwable {

        System.out.println("User enter the Outside Code for New Qualification");
        qualificationsPage.enterOutsideCode(enterOutsideCode);
        Thread.sleep(1000);
    }

    @And("^User check on the Is Active Checkbox$")
    public void userCheckOnTheIsActiveCheckbox() throws Throwable {

        System.out.println("User check on the Is Active Checkbox");
        qualificationsPage.checkIsActiveCheckbox();
        Thread.sleep(1000);
    }

    @Then("^User click on the Save Button to Add Qualification$")
    public void userClickOnTheSaveButtonToAddQualification() throws Throwable {

        System.out.println("User click on the Save Button to Add Qualification");
        qualificationsPage.clickSaveButton();
        Thread.sleep(1000);
    }
}
