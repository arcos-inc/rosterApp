package Pages;

import Base.BaseUtil;
import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.dropDownAdminRole = driver.findElement(By.id(ReadExcel.GetCellValue(1, 2)));
        this.btnLogin = driver.findElement(By.id(ReadExcel.GetCellValue(3, 2)));
    }

    @FindBy(how = How.ID, using = "txtUsername")
    @CacheLookup
    public WebElement txtUsername;

    @FindBy(how = How.ID, using = "txtPassword")
    //@CacheLookup
    public WebElement txtPassword;

    //@FindBy(how = How.ID, using = "cboRole")
    public WebElement dropDownAdminRole;

    //@FindBy(how = How.ID, using = "btnLogin")
    public WebElement btnLogin;

    @FindBy(how = How.ID, using = "ucPageHeader_ucRoleSwitcher_cboRole")
    public WebElement dropDownActingAs;

    @FindBy(how = How.ID, using = "cboEmployee")
    public WebElement selectUser;

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

    public void SelectCompanyAdminRole() {
        Select adminRole = new Select(dropDownAdminRole);
        adminRole.selectByIndex(1);
    }

    public void SelectLocationAdminRole() {
        Select adminRole = new Select(dropDownAdminRole);
        adminRole.selectByIndex(3);
    }

    public void SelectSupervisorRole() {
        Select adminRole = new Select(dropDownAdminRole);
        adminRole.selectByIndex(4);
    }

    public void SelectEmployeeRole() {
        Select adminRole = new Select(dropDownAdminRole);
        adminRole.selectByIndex(5);
    }

    public void SelectUser(){
        selectUser.click();
        Select companyAdmin = new Select(selectUser);
        companyAdmin.selectByIndex(2);
    }
}
/*
        if(!(locationLabel.equals("locations for my airline"))){
            dropDownActingAs.click();
            Select actingAs = new Select(dropDownActingAs);
            actingAs.selectByIndex(1);
        }
*/