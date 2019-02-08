package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "...")
    public WebElement txtUsername;

    @FindBy(how = How.XPATH, using = "...")
    public WebElement txtPassword;

    @FindBy(how = How.ID, using = "cboRole")
    public WebElement dropDownAdminRole;

    @FindBy(how = How.ID, using = "btnLogin")
    public WebElement btnLogin;

    @FindBy(how = How.ID, using = "lblPageHeading")
    public WebElement getLocationLabel;

    @FindBy(how = How.ID, using = "ucPageHeader_ucRoleSwitcher_cboRole")
    public WebElement dropDownActingAs;

    @FindBy(how = How.XPATH, using = "...")
    public WebElement btnAddRole;

    @FindBy(how = How.XPATH, using = "...")
    public WebElement txtRoleName;

    @FindBy(how = How.XPATH, using = "...")
    public WebElement btnSaveRole;

    public void Login(String userName, String Password) {
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(Password);
    }

    public void ClickLogin() {
        btnLogin.click();
    }

    public void ClickAdminRole() {
        dropDownAdminRole.click();
    }

    public void SelectAdminRole(){
        Select adminRole = new Select(dropDownAdminRole);
        adminRole.selectByIndex(1);
    }

    public void GetLocationlabel(WebDriver driver) {
        //String locationLabel = getLocationLabel.getText().toLowerCase();
        String url = driver.getCurrentUrl();

        //System.out.println("You got this value: " + locationLabel);

        if(url.contains("Supervisor")){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
        else if(url.contains("ScheduleView")){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
        else if(url.contains("HumanResources")){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
        else if(url.contains("Admin")){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
/*
        if(!(locationLabel.equals("locations for my airline"))){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
*/
    }

    public void ClickRoleManagement() {
        //roleManagementTab.click();
    }

    public void ClickAddRole() {
        btnAddRole.click();
    }

    public void WriteRoleName(String roleName) {
        txtRoleName.sendKeys(roleName);
    }

    public void ClickSaveRole() {
        btnSaveRole.click();
    }
}