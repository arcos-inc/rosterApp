package Steps;

import Base.BaseUtil;
import Pages.LocationAdministratorsEditPage;
import Utilities.RDTLocationsTab;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LocationAdministratorEditSD extends BaseUtil {

    private BaseUtil base;
    RDTLocationsTab RDT;
    LocationAdministratorsEditPage page;

    public LocationAdministratorEditSD(BaseUtil base) {
        RDT = new RDTLocationsTab();
        page = new LocationAdministratorsEditPage(base.Web_Driver);
        this.base = base;
    }

    @When("^User clicks on Edit Assignment$")
    public void userClicksOnEditAssignment() throws Exception {
        System.out.println("User clicks on Edit Assignment");
        WebElement editProfileLink = RDT.getLocationAdministratorEditAssignment(base.Web_Driver);
        if (editProfileLink != null) {
            editProfileLink.click();
        }
    }

    @Then("^User should navigate to Edit Location Administrator - Assignment page$")
    public void userShouldNavigateToEditLocationAdministratorAssignmentPage() {
        System.out.println("User should navigate to Edit Location Administrator - Assignment page");

    }

    @And("^User should be able to check box$")
    public void userShouldBeAbleToCheckBox() throws Exception {
        System.out.println("User should be able to check box");
        WebElement editProfileLink = RDT.getLocationCheckbox(base.Web_Driver);
        if (editProfileLink != null) {
            editProfileLink.click();
        }
    }

    @When("^User clicks on Edit Profile$")
    public void userClicksOnEditProfile() throws Exception {
        System.out.println("User clicks on Edit Profile");
        WebElement editProfileLink = RDT.getLocationAdministratorEditProfile(base.Web_Driver);
        if (editProfileLink != null) {
            editProfileLink.click();
        }
    }

    @Then("^User should navigate to Edit Administrator page with Profile info and permissions$")
    public void userShouldNavigateToEditAdministratorPageWithProfileInfoAndPermissions() throws Exception {
        System.out.println("User should navigate to Edit Administrator page with Profile info and permissions");
    }

    @And("^User should be able to edit existing admin First Name$")
    public void userShouldAbleToEditExistingAdminName() throws Exception {
        System.out.println("User should able to edit existing admin name");
        List<WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(2).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.clear();
            getTableLink.sendKeys("max");
            //getTableLink.findElement(By.id("ucProfile_txtFirstName")).sendKeys("test");
        }
    }

    @And("^User should be able to check Supervisor View$")
    public void userShouldBeAbleToCheckSupervisorView() throws Exception {
        System.out.println("User should be able to check Supervisor View");
        List<WebElement> checkCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = checkCollection.get(2).findElements(By.xpath("td/input")).get(1);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to check Supervisor Change$")
    public void userShouldBeAbleToCheckSupervisorChange() throws Exception {
        System.out.println("User should be able to check Supervisor Change");
        List<WebElement> checkCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = checkCollection.get(2).findElements(By.xpath("td/input")).get(2);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to check Employee View$")
    public void userShouldBeAbleToCheckEmployeeView() throws Exception {
        System.out.println("User should be able to check Employee View");
        List<WebElement> checkCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = checkCollection.get(2).findElements(By.xpath("td/input")).get(3);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to check Employee Change$")
    public void userShouldBeAbleToCheckEmployeeChange() throws Exception {
        System.out.println("User should be able to check Employee Change");
        List<WebElement> checkCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = checkCollection.get(2).findElements(By.xpath("td/input")).get(4);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to check Co-Workers View$")
    public void userShouldBeAbleToCheckCoWorkersView() throws Exception {
        System.out.println("User should be able to check Co-Workers View");
        List<WebElement> checkCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = checkCollection.get(2).findElements(By.xpath("td/input")).get(5);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to edit Username$")
    public void userShouldBeAbleToEditUsername() throws Exception {
        System.out.println("User should be able to edit Username");
        List<WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(5).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.clear();
            getTableLink.sendKeys("max");
            //getTableLink.findElement(By.id("ucProfile_txtFirstName")).sendKeys("test");
        }
    }

    @And("^User should be able to edit Password$")
    public void userShouldBeAbleToEditPassword() throws Exception {
        System.out.println("User should be able to edit Password");
        List<WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(6).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.clear();
            getTableLink.sendKeys("max");
        }
    }

    @And("^User should be able to check Change password on Next Login$")
    public void userShouldBeAbleToCheckChangePasswordOnNextLogin() throws Exception {
        System.out.println("User should be able to check Change password on Next Login");
        List<WebElement> checkCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = checkCollection.get(7).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to edit Email Address$")
    public void userShouldBeAbleToEditEmailAddress() throws Exception {
        System.out.println("User should be able to edit Email Address");
        List<WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(8).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.clear();
            getTableLink.sendKeys("blah@gmail.com");
        }
    }

    @And("^User should be able to edit Employee Number$")
    public void userShouldBeAbleToEditEmployeeNumber() throws Exception {
        System.out.println("User should be able to edit Employee Number");
        List<WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(9).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null) {
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.clear();
            getTableLink.sendKeys("9988");
        }
    }

    @And("^User should be able to select Phone Carrier from the dropdown$")
    public void userShouldBeAbleToSelectPhoneCarrierFromTheDropdown() throws Exception {
        System.out.println("User should be able to select Phone Carrier from the dropdown");
        List <WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(15).findElements(By.xpath("td/select")).get(0);
        if (getTableLink != null){
            System.out.println("the field is " + getTableLink.getTagName());
            Select dropdown = new Select(getTableLink);
            dropdown.selectByIndex(1);
        }
    }

    @And("^User should be able to select Hire Date from calendar$")
    public void userShouldBeAbleToSelectHireDateFromCalendar() throws Exception {
        System.out.println("User should be able to select Hire Date from calendar");
        List <WebElement> getTableCollection = RDT.getTableEditProfInfo(base.Web_Driver);
        WebElement getTableLink = getTableCollection.get(26).findElements(By.xpath("td/input")).get(0);
        if (getTableLink != null){
            System.out.println("the field is " + getTableLink.getTagName());
            getTableLink.click();
        }
    }

    @And("^User should be able to click Remove$")
    public void userShouldBeAbleToClickRemove() throws Exception {
        System.out.println("User should be able to click Remove");
        WebElement editProfileLink = RDT.RemoveLocationAdministrator(base.Web_Driver);
        if (editProfileLink != null) {
            editProfileLink.click();
        }
    }

    @Then("^User should be able to click Update button$")
    public void userShouldBeAbleToClickUpdateButton() throws Exception {
        System.out.println("User should be able to click Update button");
        page.clickSubmitButton();
    }

    @Then("^User should be able to click Cancel button$")
    public void userShouldBeAbleToClickCancelButton() {
        System.out.println("User should be able to click Cancel button");
        page.clickCancelButton();
    }
}